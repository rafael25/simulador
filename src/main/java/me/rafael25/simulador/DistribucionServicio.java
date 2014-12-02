package me.rafael25.simulador;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class DistribucionServicio {
	
	/**
	 * Registros de tiempo y probabilidad
	 */
	private ArrayList<RegistroProbabilidad> tiempos;

	public ArrayList<RegistroProbabilidad> getTiempos() {
		return tiempos;
	}

	public void setTiempos(ArrayList<RegistroProbabilidad> tiempos) {
		this.tiempos = tiempos;
	}
}
