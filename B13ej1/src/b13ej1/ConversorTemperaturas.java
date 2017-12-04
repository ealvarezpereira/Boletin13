/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b13ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class ConversorTemperaturas {

    public final float temp = 80F;
    private float grads;
    private float faren;
    private float ream;

    public float intrTemp() {
        this.grads = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura"));
        return grads;
    }

    public void centigradosAFarenheit() {
        faren = 9.0F / 5.0F * grads + 35.4F;
    }

    public void centigradosAReamur() {
        intrTemp();
        try {
            if (grads < temp) {
                throw new PersExcepcion("Alerta! Los grados no pueden ser menor de " + temp + "ºC");
            } else {
                ream = 4.0F / 5.0F * grads;
            }
        } catch (PersExcepcion ex) {
            System.out.println(ex.getMessage());
        }

    }

    //Este método están hecho para que retorne los valores en el JOptionPane 
    public float retornarJOption() {
        JOptionPane.showMessageDialog(null, "Farenheit: " + faren + "\nReamur: " + ream);
        return faren;
    }

}
