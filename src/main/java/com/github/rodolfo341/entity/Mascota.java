package com.github.rodolfo341.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "raza", nullable = false, length = 50)
	private String raza;

	@Column(name = "edad", nullable = false, precision = 10)
	private int edad;
	
	public Mascota() { }

	public Mascota(long id, String nombre, String raza, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getRaza() { return raza; }
	public void setRaza(String raza) { this.raza = raza; }
	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }
	
}
