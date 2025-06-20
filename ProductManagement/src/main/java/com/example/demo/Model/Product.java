package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private long pid;
	private String pname;
	private double price;
	private String review;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(long pid, String pname, double price, String review) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.review = review;
	}
	
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", review=" + review + "]";
	}

}
