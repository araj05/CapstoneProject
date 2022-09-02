package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="records")
public class Employee {
	    @Id
	    @Column(name="id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    
	    @Column(name="name")
	    private String name;
	    
	    @Column(name="email")
	    private String email;
	    
	    @Column(name="pw")
	    private String pw;
	
	    @Column(name="phone")
	    private String phone;
	 
		public long getId() {
		return id;
		}
		 
		public void setId(long id) {
		this.id = id;
		}
		 
		public String getName() {
		return name;
		}
		 
		public void setName(String name) {
		this.fname = name;
		}
		 
		public String getEmail() {
		return email;
		}
		 
		public void setEmail(String email) {
		this.email = email;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}
	
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}
		 
}

