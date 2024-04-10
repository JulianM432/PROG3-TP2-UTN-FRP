public class ProductDiscount extends Modificador{
    private ItemProducto refProducto;

    public ProductDiscount(String nombreDelDescuento, float porcentajeDelDescuento, ItemProducto unaRefProducto)
    {
        super(nombreDelDescuento, porcentajeDelDescuento);
        refProducto = unaRefProducto;
    }
    public ItemProducto getRefProducto() {
        return refProducto;
    }
    @Override
    public double applyProductDiscount(){
        return refProducto.getCantidad() * refProducto.getPrecio() * porcentaje;
    }
    @Override
    public double applyBillDiscount(){
        return 0;
    }
}
