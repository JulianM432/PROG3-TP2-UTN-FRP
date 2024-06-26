public class ItemProducto {
    private String nombre;
    private float precio;
    private float impuesto;
    private int cantidad;

    public ItemProducto(String nombreDelProducto, float precioDelProducto, float impuestoDelProducto, int cantidadDelProducto) {
        nombre = nombreDelProducto;
        precio = precioDelProducto;
        impuesto = impuestoDelProducto;
        cantidad = cantidadDelProducto;
    }

    //IMPLEMENTAR
    public float calcularTotal() {
        float total;
        total = precio * (1 + impuesto) * cantidad;
        return total;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public float getPrecio()
    {
        return this.precio;
    }

    public float getImpuesto()
    {
        return this.impuesto;
    }
    
    public int getCantidad()
    {
        return this.cantidad;
    }
    @Override
    public String toString(){
        String txt = String.format("Nombre: %-20s Precio: %.2f\tImpuesto: %.2f | Cantidad: %d | Total (sin descuento): %.2f",nombre,precio,impuesto,cantidad,calcularTotal());
        return txt;
    }
}
