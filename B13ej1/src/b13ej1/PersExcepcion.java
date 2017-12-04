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
public class PersExcepcion extends Exception {

    public PersExcepcion() {
        super("Personal msg");
    }

    public PersExcepcion(String msg) {
        super(msg);
    }

}
