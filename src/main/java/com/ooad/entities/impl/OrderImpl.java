
package com.ooad.entities.impl;

import com.ooad.entities.OrderEntity;

public class OrderImpl implements OrderEntity {

	private long id;

	private String name;

	@Override
	public Long getId() {
		return id;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

}
