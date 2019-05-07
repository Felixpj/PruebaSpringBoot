package com.example.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.example.entity.Course;
import com.example.entity.QCourse;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;


@Repository("queryDSLEjemploRepo")
public class QueryDSLEjemploRepository {
 
	private QCourse qCourse= QCourse.course;
	
	@PersistenceContext
	private EntityManager em;
	
	public Course find(boolean exist) {
		JPAQuery<Course> query= new JPAQuery<Course>(em);
		
		BooleanBuilder predicaterBuilder= new BooleanBuilder(qCourse.description.endsWith("OP"));

		if (exist) {
		Predicate predicate2= qCourse.id.eq(23);
		predicaterBuilder.and(predicate2);
		}else{
			Predicate predicate3= qCourse.name.endsWith("OP");
			predicaterBuilder.or(predicate3);
		}
		return query.select(qCourse).from(qCourse).where(predicaterBuilder).fetchOne();
		
	} 
	
}
