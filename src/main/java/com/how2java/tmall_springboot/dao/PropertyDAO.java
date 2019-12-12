package com.how2java.tmall_springboot.dao;

import com.how2java.tmall_springboot.pojo.Category;
import com.how2java.tmall_springboot.pojo.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyDAO extends JpaRepository<Property,Integer>{
    Page<Property> findByCategoryAnd(Category category, Pageable pageable);
}
