
package com.ooad.entities;

import javax.persistence.Entity;

@Entity
public interface OrderEntity {

	Long getId();
	
	void setId(long id);
	
	String getName();
	
	void setName(String name);
	
}
