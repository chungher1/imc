/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mackenzie.model;

/**
 *
 * @author 41341759
 */
public interface Calcular {
  public double calcularIMC(String peso,String altura);
      public double convertPeso(String peso);
      public double convertAltura(String altura);
}
