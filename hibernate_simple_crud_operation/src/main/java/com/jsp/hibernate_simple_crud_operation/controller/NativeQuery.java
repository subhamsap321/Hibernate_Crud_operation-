package com.jsp.hibernate_simple_crud_operation.controller;



import java.util.List;

import com.jsp.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class NativeQuery {
public static void main(String[] args) {
	
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate");
	
	EntityManager em= emf.createEntityManager();
//	EntityTransaction et= em.getTransaction();
	Query query= em.createNativeQuery("Select * from Laptop",Laptop.class);
	
	List<Laptop> lp = query.getResultList();
	for(Laptop l :lp) {
		System.out.println(l);
	}
}
}
