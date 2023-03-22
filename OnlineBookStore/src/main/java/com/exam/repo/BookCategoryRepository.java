package com.exam.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> 
{
	
	

}
