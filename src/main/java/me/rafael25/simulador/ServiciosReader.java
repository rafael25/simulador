/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.simulador;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author rafael
 */
public class ServiciosReader implements JsonReader {

	@Override
	public ArrayList<RegistroProbabilidad> readJson(String file) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		FileInputStream stream = new FileInputStream(file);
		
		DistribucionServicio servicios = mapper.readValue(stream, DistribucionServicio.class);
		return servicios.getTiempos();
	}
	
}
