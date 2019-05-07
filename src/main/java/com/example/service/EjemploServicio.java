package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Person;



public interface EjemploServicio {
	public abstract List<Person> getPersonas();
	
	
}
