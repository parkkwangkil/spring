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
			System.out.println("1.å �߰�, 2.��Ϻ���, 3.å�˻�, 4.å���� ����, 5.å ����, 6����");
			System.out.println("���ϴ� �޴��� �����Ͻð�");
			select = sc.nextInt();
			if (select == 6) {
				System.out.println("����");
				break;
			}
		
		switch (select) {
		case 1:
			System.out.println("å�߰�");
			Book book = new Book("����", "����", "����", 500);
			System.out.println(dao.insert(book));
			System.out.println("�ݿ� ��");
			break;

		case 2:
			System.out.println("��Ϻ���");
			Book book2 = new Book();
			System.out.println(dao.select(book2.getB_book_num()));
			break;
		case 3:
			System.out.println("å �˻�");
			for (Book b : dao.selectAllList()) {
			System.out.println(b);
			break;
			}
		case 4:
			System.out.println("å ����");
			System.out.println(dao.update(bookNum));
			break;
		case 5:
			System.out.println("å ����");
			System.out.println(dao.delete(bookNum));
			break;
			}
		}
	}
}
	


// switch (select) {
// case 1:
// System.out.println("å�߰�");
// Book book = new Book(b_book_num,b_title,b_publisher,b_writer,b_price);
// System.out.println(dao.insert(book));
// break;
// case 2:
// System.out.println("���� ���� å �������μ��� ");
// int bookNum = sc.nextInt();
// System.out.println(dao.select(bookNum));
// break;
// case 3:
// System.out.println("å �˻�");
//// System.out.println("å ��ȣ�� �˻� " + dao.selectAllList());
// for(Book b: dao.selectAllList()){
// System.out.println(b);
// break;
// }
// case 4:
// System.out.println("å ���� ����");
// System.out.println("å ��ȣ�� ����" + dao.update(b_book_num));
// break;
// case 5:
// System.out.println("å����");
// System.out.println("å ��ȣ�� ���� " + dao.delete(b_book_num));
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
