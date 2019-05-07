package com.example.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ejemploComponent")
public class EjemploComponent {
		
		private static final Log LOG=LogFactory.getLog(EjemploComponent.class);
	
		public void sayHello() {
			LOG.info("HELLO FROM EJEMPLO_COMPONENT");
		}
	
	
}
