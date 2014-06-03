package com.sobngwi.component;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class SobngwiBean 
{
	private String name;
	private String firstName;
	static final Logger log = Logger.getLogger(com.sobngwi.component.SobngwiBean.class);
	
	
	public SobngwiBean() {
		log.info("Contructeur");
	}
	public void setName(String name) {
		log.info("Init du Nom");
		this.name = name;
	}
	public void setFirstName(String firstName) {
		log.info("Init du PreNom");
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "SobngwiBean [name=" + name + ", firstname=" + firstName + "]";
	}
	
	
}
