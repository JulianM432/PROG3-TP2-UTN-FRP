public class BillDiscount extends Modificador {
    protected float montoFijo;
    private Factura<Modificador> factura;

    public BillDiscount(String nombreDelDescuento, float porcentajeDelDescuento, float montoFijoADescontar,
            Factura<Modificador> factura) {
        super(nombreDelDescuento, porcentajeDelDescuento);
        montoFijo = montoFijoADescontar;
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
