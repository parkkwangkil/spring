package xml_interface;

import vo.Book;

public class Test {

	public static void main(String[] args) {
		BookDao dao = new BookDao();
		Book book = new Book("Mybatis", "����", "�ֹ���", 25000);

		// -insert
		// System.out.println("result : " + dao.insert(book));
		// System.out.println("å��ȣ:" + book.getB_book_num());

		// for(BookVO b: dao.selectList()){
		// System.out.println(b);
		// }

		// -delete
		// dao.delete(2, 9);
	}

}
