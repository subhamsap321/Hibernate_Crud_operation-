package com.jsp.hibernate_simple_crud_operation.controller;


import java.util.List;

import com.jsp.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayAllLaptop {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
/*		
	Query query= em.createQuery("from Laptop");
	List<Laptop> laptop=query.getResultList();
	
	if(!laptop.isEmpty()) {
		for(Laptop lp: laptop) {
			System.out.println(lp);
		}
	}
	else {
		System.out.println("not available");
	}*/
		
		//  display query with where clause.
	/*	
		Query query= em.createQuery("SELECT a from Laptop a where a.price=:abc");
	    query.setParameter("abc", 45500);
	 try {
		 Laptop laptop =(Laptop) query.getSingleResult();
		 System.out.print(laptop);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }*/
		
		/**
		 * delete from entityclassName aliasname where aliasname.attribute=?1;
		 */
	/*	
		Query query = em.createQuery("delete from Laptop a where a.price=:abc");
		     query.setParameter("abc",45500);
		     et.begin();
		     
		 int a= query.executeUpdate();
		 
		 et.commit();
		 String msg= a!=0?"deleted":"not deleted";
		 System.out.println(msg);
		 
		*/
		
		//update laptop price by laptop name
		
		Query query= em.createQuery("update Laptop a set a.price=:abcd where a.name=:abc");
		 query.setParameter("abcd", 50000);
		 query.setParameter("abc", "Subham");
		 et.begin();
		 int a= query.executeUpdate();
		 et.commit();
		 String msg= a!=0?"done":"not done";
		 System.out.println(msg);
		     
		
	}

}
