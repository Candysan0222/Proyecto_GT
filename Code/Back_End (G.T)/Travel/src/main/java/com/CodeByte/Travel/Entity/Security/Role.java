package com.CodeByte.Travel.Entity.Security;


import com.CodeByte.Travel.Entity.Base.Base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends Base{

	@Column(name = "name",nullable = false, length = 50)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
