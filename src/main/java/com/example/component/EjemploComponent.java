package com.example.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.repository.CourseJpaRepository;

@Component("ejemploComponent")
public class EjemploComponent {
		
		private static final Log LOG=LogFactory.getLog(EjemploComponent.class);
	
		@Autowired
		@Qualifier("courseJpaRepository")
		private CourseJpaRepository courseJpaRepository; 
		
		public void sayHello() {
			
			LOG.info("HELLO FROM EJEMPLO_COMPONENT");
		}
	
	
}
