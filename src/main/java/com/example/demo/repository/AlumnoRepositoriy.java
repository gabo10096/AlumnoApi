package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Alumno;

public interface AlumnoRepositoriy {
	
	Alumno add (Alumno alumno);
	
	List<Alumno> findAll();

}
