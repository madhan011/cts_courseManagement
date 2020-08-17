package com.learning.management.courseManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.management.courseManagement.model.CourseMockQA;

@Repository
public interface CourseMockQARepo extends JpaRepository<CourseMockQA, Long> {
	
	List<CourseMockQA> findByCourseIdAndIsValid(Long Id,Boolean bflg);

}
