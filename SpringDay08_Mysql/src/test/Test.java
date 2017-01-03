package test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.BookDao;
import vo.Book;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao dao = context.getBean("bookDao", BookDao.class);
		System.out.println("test");
		int select;
		int bookNum = 0;

		while (true) {
			System.out.println("1.책 추가, 2.목록보기, 3.책검색, 4.책내용 수정, 5.책 삭제, 6종료");
			System.out.println("원하는 메뉴를 선택하시게");
			select = sc.nextInt();
			if (select == 6) {
				System.out.println("종료");
				break;
			}
		
		switch (select) {
		case 1:
			System.out.println("책추가");
			Book book = new Book("광길", "광길", "광길", 500);
			System.out.println(dao.insert(book));
			System.out.println("반영 됨");
			break;

		case 2:
			System.out.println("목록보기");
			Book book2 = new Book();
			System.out.println(dao.select(book2.getB_book_num()));
			break;
		case 3:
			System.out.println("책 검색");
			for (Book b : dao.selectAllList()) {
			System.out.println(b);
			break;
			}
		case 4:
			System.out.println("책 수정");
			System.out.println(dao.update(bookNum));
			break;
		case 5:
			System.out.println("책 삭제");
			System.out.println(dao.delete(bookNum));
			break;
			}
		}
	}
}
	


// switch (select) {
// case 1:
// System.out.println("책추가");
// Book book = new Book(b_book_num,b_title,b_publisher,b_writer,b_price);
// System.out.println(dao.insert(book));
// break;
// case 2:
// System.out.println("보고 싶은 책 제목으로선택 ");
// int bookNum = sc.nextInt();
// System.out.println(dao.select(bookNum));
// break;
// case 3:
// System.out.println("책 검색");
//// System.out.println("책 번호로 검색 " + dao.selectAllList());
// for(Book b: dao.selectAllList()){
// System.out.println(b);
// break;
// }
// case 4:
// System.out.println("책 내용 수정");
// System.out.println("책 번호로 수정" + dao.update(b_book_num));
// break;
// case 5:
// System.out.println("책삭제");
// System.out.println("책 번호로 삭제 " + dao.delete(b_book_num));
// break;
// default:
// break;
// }
// }
// }
// }

// if(input==1){
// result = insertBook;
// }else if(input==2){
// result = selectBook;
// }else if(input==3){
// result = selectBookList;
// }else if(input==4){
// result =updateBook;
//
// for(Book b: dao.selectAllList()){
// System.out.println(b);
