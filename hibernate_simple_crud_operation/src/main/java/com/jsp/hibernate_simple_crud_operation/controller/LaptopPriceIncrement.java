package com.jsp.hibernate_simple_crud_operation.controller;

import java.util.List;

import com.jsp.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class LaptopPriceIncrement {
	public static void main(String[] args) {
		
		System.out.println(incrementLaptopPriceByPercentageByName("Subham", 10));
		
		
	}
	public static boolean incrementLaptopPriceByPercentageByName(String laptopName,int percentage){
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate");
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction et= em.getTransaction();
		
		Query query = em.createQuery("Select a from Laptop a where a.name=:abc");
		query.setParameter("abc",laptopName );
		try {
			List <Laptop> lp=query.getResultList();
			
			if(lp!=null) {
				for(Laptop laptop2:lp) {
					laptop2.setPrice(laptop2.getPrice()+laptop2.getPrice()*percentage/10);
					et.begin();
					em.merge(laptop2);
					et.commit();
					
					
				}
				
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
			
		}
		return false;
		
		
		
		
		
		
		
		
		
		
	}
	}


