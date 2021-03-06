package com.model;

public class Circulo {

	private double raio;

	private static final double PI = 3.14159;

	public Circulo(double raio) {
		super();
		if (raio <= 0.0) {
			throw new IllegalArgumentException();
		}
		this.raio = raio;
	}

	public double getArea() {
		return raio * raio * PI;
	}

	public double getRaio() {
		return raio;
	}
	
}
