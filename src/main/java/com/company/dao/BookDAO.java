package com.company.dao;

import java.util.List;

import com.entity.BookDtls;
public interface BookDAO {

	
	public boolean addBooks(BookDtls b);
	
	public List<BookDtls> getNewBooks();
}
