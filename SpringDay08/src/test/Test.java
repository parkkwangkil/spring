package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.BookDao;
import vo.Book;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookDao dao = context.getBean("bookDao",BookDao.class);
		
		for(Book b: dao.selectAllList()){
			System.out.println(b);
		}

	}

}
