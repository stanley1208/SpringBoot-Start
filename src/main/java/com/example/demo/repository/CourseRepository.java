package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.twoway_mtom.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
