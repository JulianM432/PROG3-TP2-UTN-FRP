import java.util.*;

public class Factura<T extends Modificador> {
    private double montoTotal = 0.0;
    private List<T> listaModificadores;

    public Factura() {

    }

    public List<T> getListaModificadores() {
        return listaModificadores;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double monto) {
        this.montoTotal = monto;
    }
}