package com.example.SpringDataJpademo.entities; 
import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference; 
@Entity
@Table(name="product_master") 
public class Product implements Serializable{  
	private static final long serialVersionUID=1L;
	 
	@Id 
	@Column(name = "product_id") 
	private Integer productId; 
	private String productName;
	private double price;
	 
	@JsonBackReference  
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="products") 
	private Set<Order>orders;
	 
	public Product() { 
	}
	}
 