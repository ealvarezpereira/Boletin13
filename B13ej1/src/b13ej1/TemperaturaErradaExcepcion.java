/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b13ej1;

/**
 *
 * @author quique
 */
public class TemperaturaErradaExcepcion {

    ConversorTemperaturas cond = new ConversorTemperaturas();

    public void llamemosleX() throws PersExcepcion {
        
        if (cond.intrTemp() < cond.temp) {
            throw new PersExcepcion("Alerta! La temperatura no puede ser menor de " + cond.temp + "ºC");
        } else {
            cond.centigradosAFarenheit();
        }

    }

}
