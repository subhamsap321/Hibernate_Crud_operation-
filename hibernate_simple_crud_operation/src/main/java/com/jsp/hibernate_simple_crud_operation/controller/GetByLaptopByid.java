package com.jsp.hibernate_simple_crud_operation.controller;



import com.jsp.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class GetByLaptopByid {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		 
		Laptop laptop= em.find(Laptop.class,11);
		
		if(laptop!=null) {
			System.out.println(laptop);
		}
		else {
			System.out.println("not found");
			
		}
	}

}
