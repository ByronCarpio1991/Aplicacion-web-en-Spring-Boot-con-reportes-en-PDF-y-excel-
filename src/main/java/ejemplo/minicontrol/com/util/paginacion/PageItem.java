/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.minicontrol.com.util.paginacion;

/**
 *
 * @author byroncarpio
 */
public class PageItem {
    private int numero;
    private boolean actual;

    public PageItem(int numero, boolean actual) {
        super();
        this.numero = numero;
        this.actual = actual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }
    

}
