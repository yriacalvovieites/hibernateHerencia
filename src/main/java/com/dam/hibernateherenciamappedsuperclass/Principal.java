package com.dam.hibernateherenciamappedsuperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.dam.hibernateherenciasingletable.Alumno;
import com.dam.hibernateherenciasingletable.Profesor;


public class Principal {

	public static void main(String[] args) {
		
		//Creamos el SessionFactory
    	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();   	
     	SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
    	
     	//Abrimos la sesión
     	Session sesion = sf.openSession();
     	
     	//Creamos los objetos necesarios
     	Alumno alumno1 = new Alumno("3123123", "Pepito", 20, "DAM");
     	Alumno alumno2 = new Alumno("5254342", "Menganito", 22, "ASIR");
     	
     	Profesor profesor1 = new Profesor("54532432", "Jose", 38, 2);
     
     	
     	//Iniciamos la transacción
     	//sesion.getTransaction().begin();
     	sesion.beginTransaction();
     	
     	//Persistimos los objetos
     	sesion.save(alumno1);
     	sesion.save(alumno2);
     	sesion.save(profesor1);
     	
     	//Hacemos commit de la transacción
     	sesion.getTransaction().commit();
     	
     	//Cerramos los objetos sesion y sessionfactory
     	sesion.close();
     	sf.close();

	}

}
