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
public class B13ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TemperaturaErradaExcepcion excp = new TemperaturaErradaExcepcion();
        ConversorTemperaturas excp2 = new ConversorTemperaturas();

        try {
            excp.llamemosleX();
        } catch (PersExcepcion ex) {
            System.out.println(ex.getMessage());
        }

        excp2.centigradosAFarenheit();
        excp2.centigradosAReamur();
        excp2.retornarJOption();
    }

}
