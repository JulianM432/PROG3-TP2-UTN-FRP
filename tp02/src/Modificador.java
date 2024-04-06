public abstract class Modificador {
    protected String nombreDescuento;
    protected float porcentaje;

    public Modificador(String nombreDelDescuento, float porcentajeDescuento) {
        nombreDescuento = nombreDelDescuento;
        porcentaje = porcentajeDescuento;
    }

    public String getNombreDescuento() {
        return nombreDescuento;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public abstract double applyProductDiscount();

    public abstract double applyBillDiscount();
}
