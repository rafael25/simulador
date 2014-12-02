package me.rafael25.simulador;

/**
 * Representa una fila de la tabla de distribucion de probabilidades de
 * tiempo de llegada o de servicio
 * @author rafael
 */
public class RegistroProbabilidad {
	
	/**
	 * Tiempo entre llegadas o de sercicio (minutos)
	 */
	private int tiempo;
	
	/**
	 * Probabilidad en el tiempo definido < 1
	 */
	private double probabilidad;
	
	/**
	 * Para la frecuencia acumulada los datos deben estar ordenados <= 1
	 */
	private double frecuenciaAcumulada;

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public double getProbabilidad() {
		return probabilidad;
	}

	public void setProbabilidad(double probabilidad) {
		this.probabilidad = probabilidad;
	}

	public double getFrecuenciaAcumulada() {
		return frecuenciaAcumulada;
	}

	public void setFrecuenciaAcumulada(double frecuenciaAcumulada) {
		this.frecuenciaAcumulada = frecuenciaAcumulada;
	}

	@Override
	public String toString() {
		return "RegistroProbabilidad{" + "tiempo=" + tiempo + ", probabilidad=" + probabilidad + ", frecuenciaAcumulada=" + frecuenciaAcumulada + '}';
	}
}
