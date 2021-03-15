package com.ibm.set;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

import com.ibm.Book;

public class SetDemo {
	public static void main(String[] args) {
		createBookSet();
	}
	public static void createBookSet() {
		Set<Book> books = new HashSet<Book>();
		for (int i = 1; i < 4; i++) {
			Book book = new Book("Title"+i);
			book.setPrice(100 * i);
			book.setPublishYear(i + 2000);
			books.add(book);
		}
	}
}
