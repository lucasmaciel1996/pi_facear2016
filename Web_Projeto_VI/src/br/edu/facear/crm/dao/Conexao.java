package br.edu.facear.crm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
		 static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PROJETO");
		 
		public static  EntityManager getEntityManager(){
			
			return emf.createEntityManager();
			
		}
	}



