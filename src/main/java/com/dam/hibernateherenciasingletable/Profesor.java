package com.dam.hibernateherenciasingletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class Profesor extends Persona{

	@Column
	private int numCiclosClase;
	
	public Profesor(String dni, String nombre, int edad, int numCiclosClase) {
		super(dni, nombre, edad);
		this.numCiclosClase = numCiclosClase;
	}

	public int getNumCiclosClase() {
		return numCiclosClase;
	}

	public void setNumCiclosClase(int numCiclosClase) {
		this.numCiclosClase = numCiclosClase;
	}
	
}
