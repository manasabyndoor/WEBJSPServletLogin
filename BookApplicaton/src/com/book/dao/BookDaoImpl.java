package com.book.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.book.pojo.Book;

public class BookDaoImpl implements BookDao {
	 
	Map<String,Book> bookdata= new HashMap<String,Book>();
	static Map <String,Integer>list =new HashMap<String,Integer>();
	public void add(Book book) {
		bookdata.put(book.getBookName(), book);
		//System.out.println(bookdata);
		
	}

	public void deleteItems(Book book)
	{
		bookdata.remove(book.getBookName());
		
	}
	public Collection <Book> display()
	{
	 return	bookdata.values();
	
	}

	public void addtocart(String name, int p) {
		list.put(name,p);
		
		
	}
	public Collection<Integer> displaycart()
	{
		System.out.println(list);
		return list.values();
	}
	



	


	
}
