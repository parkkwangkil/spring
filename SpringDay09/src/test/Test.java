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
			System.out.println("1.�� ��� 2.�� ���� 3.�� �б� 4.�� ���� ���� 5.�� ���� 6.�� �亯");
			System.out.print("�޴� ����: ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("�۸�� ����");
				currentPage = sc.nextInt();
				int articleCount = 10;
				int startRow = (currentPage - 1) * articleCount;
				int endRow = articleCount;

				List<Article> articleList = service.selectPage(startRow, endRow);
				if (articleList.size() == 0) {
					System.out.println("�� ���� ");
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
				System.out.println("������");
				String title = sc.next();
				System.out.println("�۳���");
				String content = sc.next();
				System.out.println("�ۼ���");
				String writer = sc.next();
				System.out.println("�н�����");
				String password = sc.next();

				System.out.println("�� �Է� " + service.insert(article));
				service.addUpdate(article.getNum());
				break;
			case 3:
				System.out.println("��ȣ �Է� ");
				num = sc.nextInt();
				System.out.println(service.selectReadCount(num));
				break;
			case 4:
				System.out.print("�Խù� ��ȣ �Է�: ");
				num = sc.nextInt();
				System.out.print("�Խù� ��й�ȣ �Է�: ");
				password = sc.next();
				if (service.isPassword(num, password)) {
					Article savedArticle = service.selectNoReadCount(num);
					System.out.print("�� ���� ���� : ");
					article.setTitle(sc.next());
					System.out.print("�� ���� ���� : ");
					article.setContent(sc.next());
					System.out.print("�ۼ��� ���� : ");
					article.setWriter(sc.next());
					System.out.print("�н����� ���� : ");
					article.setPassword(sc.next());
					System.out.println("�� ���� ���� : " + service.update(savedArticle));
				} else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
				}
				break;
			case 5:
				System.out.println("�Խù� �Է�");
				num = sc.nextInt();
				System.out.println("�Խù� ��ȣ �Է�");
				password = sc.next();
				if (service.isPassword(num, password)) {
					System.out.println("�� ���� : " + service.delete(num));
				} else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
				}
				break;
			case 6:
				System.out.println("���� ��ȣ");
				num = sc.nextInt();
				article = service.selectNoReadCount(num);
				article = new Article();
				System.out.println("�亯 ����");
				content = sc.next();
				System.out.println("��� ����");
				title = sc.next();
				System.out.println("��� �ۼ���");
				writer = sc.next();
				System.out.println("�н�����");
				password = sc.next();
				article.setPassword(password);
			
				
			}
		}
	}
}