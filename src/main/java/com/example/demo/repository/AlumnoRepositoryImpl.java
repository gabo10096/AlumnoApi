package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Alumno;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepositoriy{

	private static List<Alumno> alumnos = new ArrayList<>();
	
	static {
		Alumno alumno = new Alumno(
				1, 
				"Gabriel", 
				"Aguilar Gonzalez", 
				24, 
				"LCI");
		alumnos.add(alumno);
	}
	
	@Override
	public Alumno add(Alumno alumno) {
		alumno.setId(alumnos.size() + 1);
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> findAll() {
		return alumnos;
	}

}
