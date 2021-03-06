package xml_interface;

import java.util.List;
import java.util.Map;

import vo.Book;

public interface BookMapper {
		public int insertBook(Book book);

		public Book selectBook(int book_num);

		public List<Book> selectBookList();

		public int deleteBook(Map<String, Integer> paramMap);
		
	}

