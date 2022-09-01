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
	    
	    @Column(name="fname")
	    private String fname;
	    
	    @Column(name="lname")
	    private String lname;
	    
	    @Column(name="username")
	    private String username;
	    
	    @Column(name="pw")
	    private String pw;
	 
		public long getId() {
		return id;
		}
		 
		public void setId(long id) {
		this.id = id;
		}
		 
		public String getFname() {
		return fname;
		}
		 
		public void setFname(String fname) {
		this.fname = fname;
		}
		 
		public String getLname() {
		return lname;
		}
		 
		public void setLname(String lname) {
		this.lname = lname;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}
		 
}

