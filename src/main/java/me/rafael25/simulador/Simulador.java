/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.simulador;

import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public class Simulador {
	public static void main(String[] args) throws Exception {
		String dir = "/home/rafael/NetBeansProjects/Simulador/src/main/resources/";

		LlegadasReader llegadasReader = new LlegadasReader();
		ServiciosReader serviciosReader = new ServiciosReader();
		
		ArrayList<RegistroProbabilidad> llegadas = llegadasReader.readJson(dir+"TiempoLlegadas.json");
		ArrayList<RegistroProbabilidad> servicios = serviciosReader.readJson(dir+"TiempoServicio.json");
		
		System.out.println(">>>>>>>>>>>>>>>>>>> Llegadas");
		float frec = 0;
		for (RegistroProbabilidad r : llegadas) {
			frec += r.getProbabilidad();
			r.setFrecuenciaAcumulada(frec);
			System.out.println(r);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>> Servicios");
		frec = 0;
		for (RegistroProbabilidad r : servicios) {
			frec += r.getProbabilidad();
			r.setFrecuenciaAcumulada(frec);
			System.out.println(r);
		}
	}
}
