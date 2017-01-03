package test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ArticleService;
import vo.Article;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleService service = context.getBean("articleService", ArticleService.class);
		Article article = null;
		Scanner sc = new Scanner(System.in);
		int num;
		int currentPage;
		while (true) {
			System.out.println("1.글 목록 2.글 쓰기 3.글 읽기 4.글 내용 수정 5.글 삭제 6.글 답변");
			System.out.print("메뉴 선택: ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("글목록 보기");
				currentPage = sc.nextInt();
				int articleCount = 10;
				int startRow = (currentPage - 1) * articleCount;
				int endRow = articleCount;

				List<Article> articleList = service.selectPage(startRow, endRow);
				if (articleList.size() == 0) {
					System.out.println("글 없음 ");
				} else {
					for (Article a : articleList) {
						for (int i = 0; i < a.getDepth(); i++) {
							System.out.println("??");
						}
						if (a.getDepth() != 0) {
							System.out.println("!!");
						}
						System.out.println(a);
					}
				}
				break;

			case 2:
				article = new Article();
				System.out.println("글제목");
				String title = sc.next();
				System.out.println("글내용");
				String content = sc.next();
				System.out.println("작성자");
				String writer = sc.next();
				System.out.println("패스워드");
				String password = sc.next();

				System.out.println("글 입력 " + service.insert(article));
				service.addUpdate(article.getNum());
				break;
			case 3:
				System.out.println("번호 입력 ");
				num = sc.nextInt();
				System.out.println(service.selectReadCount(num));
				break;
			case 4:
				System.out.print("게시물 번호 입력: ");
				num = sc.nextInt();
				System.out.print("게시물 비밀번호 입력: ");
				password = sc.next();
				if (service.isPassword(num, password)) {
					Article savedArticle = service.selectNoReadCount(num);
					System.out.print("글 제목 수정 : ");
					article.setTitle(sc.next());
					System.out.print("글 내용 수정 : ");
					article.setContent(sc.next());
					System.out.print("작성자 수정 : ");
					article.setWriter(sc.next());
					System.out.print("패스워드 수정 : ");
					article.setPassword(sc.next());
					System.out.println("글 내용 수정 : " + service.update(savedArticle));
				} else {
					System.out.println("비밀번호를 확인해주세요.");
				}
				break;
			case 5:
				System.out.println("게시물 입력");
				num = sc.nextInt();
				System.out.println("게시물 번호 입력");
				password = sc.next();
				if (service.isPassword(num, password)) {
					System.out.println("글 삭제 : " + service.delete(num));
				} else {
					System.out.println("비밀번호를 확인해주세요.");
				}
				break;
			case 6:
				System.out.println("리플 번호");
				num = sc.nextInt();
				article = service.selectNoReadCount(num);
				article = new Article();
				System.out.println("답변 내용");
				content = sc.next();
				System.out.println("답글 제목");
				title = sc.next();
				System.out.println("답글 작성자");
				writer = sc.next();
				System.out.println("패스워드");
				password = sc.next();
				article.setPassword(password);
			
				
			}
		}
	}
}