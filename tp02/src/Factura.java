import java.util.*;

public class Factura<T extends Modificador> {
    private double montoTotal = 0.0;
    private List<T> listaModificadores;
    private List<ItemProducto> listaProducto;

    public Factura() {
        listaModificadores = new ArrayList<T>();
        listaProducto = new ArrayList<ItemProducto>();
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

    public List<ItemProducto> getListaProducto(){
        return listaProducto;
    }
}