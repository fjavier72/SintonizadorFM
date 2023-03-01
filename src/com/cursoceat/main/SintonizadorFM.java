package com.cursoceat.main;

public class SintonizadorFM {

	// Atributos
	private double frecuencia;

	// Constructores
	public SintonizadorFM() {
		this.frecuencia = 80;  // Valor de frecuencia por defecto
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
		comprobarFrecuencia();
	}
	
	public void up() {
		this.frecuencia += 0.5;
		comprobarFrecuencia();
	}
	
	public void down() {
		this.frecuencia -= 0.5;
		comprobarFrecuencia();
	}
	
	public void display() {
		System.out.println("Sintonizando " + this.frecuencia + " MHz");
	}

	private void comprobarFrecuencia() { // Si nos salimos del rango por arriba o por abajo, reasignamos
		if (this.frecuencia < 80)
			this.frecuencia = 108;
		else if (this.frecuencia > 108)
			this.frecuencia = 80;
	}
}
