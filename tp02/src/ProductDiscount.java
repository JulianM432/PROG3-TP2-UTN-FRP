public class ProductDiscount extends Modificador{
    private ItemProducto refProducto;

    public ProductDiscount(String nombreDescuento, float porcentajeDescuento, ItemProducto unaRefProducto)
    {
        super(nombreDescuento, porcentajeDescuento);
        refProducto = unaRefProducto;
    }
    public ItemProducto getRefProducto() {
        return refProducto;
    }
    @Override
    public double applyProductDiscount(){
        return 0;
    }
    @Override
    public double applyBillDiscount(){
        return 0;
    }
}
