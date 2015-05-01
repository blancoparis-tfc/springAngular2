package org.dbp.controller.json;

import java.io.Serializable;

public class EjemploJson implements Serializable{

	private Long numero;
	private String cadena;
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	@Override
	public String toString() {
		return "EjemploJson [numero=" + numero + ", cadena=" + cadena + "]";
	}
	
	
}
