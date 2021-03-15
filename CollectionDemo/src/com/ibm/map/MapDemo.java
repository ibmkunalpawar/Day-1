package com.ibm.map;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;
import com.ibm.Book;

public class MapDemo {
	public static void main(String[] args) {
		CreateMapofBooks();
	}
	private static void createMapofBooks() {
		Map<String , Book> books = new HashMap<String , Book>();
		System.out.println(books.size());
		for (int i = 0; i < 10; i++) {
			Book book1= new Book("java"+i);
			books.put("book"+i, book1);
			
		}
	}
}
