package com.blog.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Long id;
	
	private String userName;
	
	private String email;
	
	
	
}
