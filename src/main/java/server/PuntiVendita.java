
package server;

import java.util.ArrayList;

/**
 *
 * @author Andrea Lotti
 */
public class PuntiVendita {
    
    private int size;
    private ArrayList<PuntoVendita> listaRisultati;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<PuntoVendita> getListaRisultati() {
        return listaRisultati;
    }

    public void setListaRisultati(ArrayList<PuntoVendita> listaRisultati) {
        this.listaRisultati = listaRisultati;
    }
    
}
