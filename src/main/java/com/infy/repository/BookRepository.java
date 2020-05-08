package com.infy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>,BookRepositoryCustom{

	//public List<Book> findByLibraryId(int id);
	public List<Book> findByLibraryId(int id);
	
}
