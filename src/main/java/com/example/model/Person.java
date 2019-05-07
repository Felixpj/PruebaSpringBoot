package com.example.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class Person {
	
	@NonNull
	@Size(min=2, max=6)
	private String nombre;
	
	@NonNull
	@Min(18)
	private int edad;
	
	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Person() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
}
