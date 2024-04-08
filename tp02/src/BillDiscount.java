public class BillDiscount extends Modificador {
    protected float montoFijo;
    private Factura<Modificador> factura;

    public BillDiscount(String nombreDescuento, float porcentajeDescuento, float montoFijo,
            Factura<Modificador> factura) {
        super(nombreDescuento, porcentajeDescuento);
        this.montoFijo = montoFijo;
        this.factura = factura;
    }

    //IMPLEMENTAR
    @Override
    public double applyProductDiscount() {
        return 0;
    }
    //IMPLEMENTAR
    @Override
    public double applyBillDiscount() {
        return montoFijo;
    }
}
