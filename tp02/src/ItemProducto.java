public class ItemProducto {
    private String Nombre;
    private float Precio;
    private float Impuesto;
    private int Cantidad;

    public ItemProducto(String nombreProducto, float precioProducto, float impuestoProducto, int cantidadProducto) {
        Nombre = nombreProducto;
        Precio = precioProducto;
        Impuesto = impuestoProducto;
        Cantidad = cantidadProducto;
    }

    //IMPLEMENTAR
    public float calcularTotal() {
        return 0;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public float getPrecio()
    {
        return Precio;
    }

    public float getImpuesto()
    {
        return Impuesto;
    }
    
    public int getCantidad()
    {
        return Cantidad;
    }
}
