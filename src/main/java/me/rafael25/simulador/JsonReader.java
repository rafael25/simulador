/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.rafael25.simulador;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rafael
 */
public interface JsonReader {
	public abstract ArrayList<RegistroProbabilidad> readJson(String file) throws IOException;
}
