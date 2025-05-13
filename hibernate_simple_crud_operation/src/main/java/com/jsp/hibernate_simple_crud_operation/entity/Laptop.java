package com.jsp.hibernate_simple_crud_operation.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Laptop {

	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	private String ram;
	private LocalDate purchaseDate;
	
	
}
