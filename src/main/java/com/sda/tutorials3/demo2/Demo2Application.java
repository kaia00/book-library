package com.sda.tutorials3.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Book book = context.getBean("book", Book.class);
		book.setAuthor("J.K. Rowling");
		book.setTitle("Harry Potter");

		List<Book> books = new ArrayList<>();
		books.add(book);

		Library library = context.getBean("library", Library.class);
		library.setAddress("Tallinn");
		library.setBooksInLibrary(books);


		//System.out.println(book.toString());

		System.out.println(library.toString());

		context.close();

	}

}
