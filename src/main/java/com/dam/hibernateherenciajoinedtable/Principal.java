package com.dam.hibernateherenciajoinedtable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Principal {

	public static void main(String[] args) {
		
		//Creamos el SessionFactory
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();   	
     	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
     	//Abrimos la sesión
     	Session sesion = sf.openSession();
     	
     	
     
     	
     	//Iniciamos la transacción
     	//sesion.getTransaction().begin();
     	sesion.beginTransaction();
     	
   
     	//Hacemos commit de la transacción
     	sesion.getTransaction().commit();
     	
     	//Cerramos los objetos sesion y sessionfactory
     	sesion.close();
     	sf.close();

	}

}
