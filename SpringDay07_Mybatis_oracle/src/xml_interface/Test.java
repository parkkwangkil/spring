package xml_interface;

import vo.Book;

public class Test {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		Book book = new Book(19,"±¤±æ","±¤±æ","±¤±æ", 100);
		System.out.println(""+dao.delete(24,26));
	
		
		System.out.println(""+dao.insert(book));
		//System.out.println(""+book.getB_book_num());
	}
	
	


}
