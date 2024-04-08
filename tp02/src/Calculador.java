public class Calculador<M extends Modificador> {
    public double calcularMontoTotal(Factura<M> unaFactura) {

        calcularDescuentoTotalPorProductos(unaFactura);
        
        calcularDescuentoTotalPorFactura(unaFactura);
        
        return unaFactura.getMontoTotal();
    }

    public Factura<M> calcularTotalFactura(Factura<M> unaFactura) {
        double total = 0;
        for (ItemProducto unProducto : unaFactura.getListaProducto()) {
            total += unProducto.calcularTotal();
        }
        // System.out.println("MONTO TOTAL: " + total);
        unaFactura.setMontoTotal(total);
        return unaFactura;
    }

    public Factura<M> calcularDescuentoTotalPorProductos(Factura<M> unaFactura) {
        double total = 0;
        for (M m : unaFactura.getListaModificadores()) {
            total += m.applyProductDiscount();
        }
        unaFactura.setMontoTotal(calcularTotalFactura(unaFactura).getMontoTotal() - total);
        // System.out.println("PRODUCT DISC: " + total);
        return unaFactura;
    }

    public Factura<M> calcularDescuentoTotalPorFactura(Factura<M> unaFactura) {
        double montoFijo = 0;
        double porcentaje = 0;
        for (M m : unaFactura.getListaModificadores()) {
            montoFijo += m.applyBillDiscount();
            if(m instanceof BillDiscount){
                porcentaje = m.porcentaje;
            }
        }
        
        double descPorPorcentaje = unaFactura.getMontoTotal() * porcentaje;

        unaFactura.setMontoTotal(unaFactura.getMontoTotal() - montoFijo - descPorPorcentaje);
        // System.out.println("BILL DISC: " + total);
        return unaFactura;
    }
}