package mapper;

import java.util.List;
import java.util.Map;

import vo.Book;
//mapper.mapper
public interface BookMapper {
		public int insertBook(Book book);

		public Book selectBook(int book_num);

		public List<Book> selectBookList();

		public int deleteBook(Map<String, Integer> paramMap);
		
	}

