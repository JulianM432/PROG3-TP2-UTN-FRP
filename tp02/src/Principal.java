public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                Caso 1:");
        Caso01();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                Caso 2:");
        Caso02();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("                Caso 3:");
        Caso03();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public static void Caso01() {
        Factura<Modificador> unaFactura = new Factura<Modificador>();
        // PRODUCTOS
        ItemProducto bicicletas = new ItemProducto("Bicicleta", 780000, 0.21f, 1);
        ItemProducto vaporeras = new ItemProducto("Vaporera", 94000, 0.105f, 3);

        unaFactura.getListaProducto().add(bicicletas);
        unaFactura.getListaProducto().add(vaporeras);
        // MODIFICADORES
        unaFactura.getListaModificadores().add(new ProductDiscount("Bicicleta Desc", 0.05f, bicicletas));
        unaFactura.getListaModificadores().add(new ProductDiscount("Vaporera Desc",
                0.03f, vaporeras));
        unaFactura.getListaModificadores().add(new BillDiscount("Monto 01", 0, 10000,
                unaFactura));
        
        Calculador<Modificador> unCalculador = new Calculador<Modificador>();
        for(int i = 0; i< unaFactura.getListaProducto().size(); i++){
            System.out.println(unaFactura.getListaProducto().get(i).toString());
        }
        System.out.printf("\nMonto total: $%.2f\n", unCalculador.calcularMontoTotal(unaFactura));
    }

    public static void Caso02() {
        Factura<Modificador> unaFactura = new Factura<>();
        // PRODUCTOS
        ItemProducto lavarropa = new ItemProducto("Lavarropa", 510000, 0.105f, 1);
        ItemProducto tostadora = new ItemProducto("Tostadora", 40000, 0.21f, 2);
        ItemProducto heladera = new ItemProducto("Heladera", 890000, 0.105f, 3);
        ItemProducto ventilador = new ItemProducto("Ventilador", 158000, 0.21f, 4);
        
        unaFactura.getListaProducto().add(lavarropa);
        unaFactura.getListaProducto().add(tostadora);
        unaFactura.getListaProducto().add(heladera);
        unaFactura.getListaProducto().add(ventilador);
        // MODIFICADORES
        unaFactura.getListaModificadores().add(new ProductDiscount("Lavarropa Desc",0.15f,lavarropa));
        unaFactura.getListaModificadores().add(new ProductDiscount("Tostadora Desc",0.35f,tostadora));
        unaFactura.getListaModificadores().add(new ProductDiscount("Heladera Desc",0.25f,heladera));
        unaFactura.getListaModificadores().add(new ProductDiscount("Ventilador Desc",0.1f,ventilador));
        unaFactura.getListaModificadores().add(new BillDiscount("Monto 2", 0.05f, 15000, unaFactura));

        Calculador<Modificador> unCalculador = new Calculador<Modificador>();
        for(int i = 0; i< unaFactura.getListaProducto().size(); i++){
            System.out.println(unaFactura.getListaProducto().get(i).toString());
        }
        System.out.printf("\nMonto total: $%.2f\n", unCalculador.calcularMontoTotal(unaFactura));
    }

    public static void Caso03() {
        Factura<Modificador> unaFactura = new Factura<>();
        // PRODUCTOS
        ItemProducto notebook = new ItemProducto("Notebook", 1400000, 0.21f, 1);
        ItemProducto music = new ItemProducto("Sony Music Center", 2600000, 0.21f, 1);

        unaFactura.getListaProducto().add(notebook);
        unaFactura.getListaProducto().add(music);
        
        // MODIFICADORES
        unaFactura.getListaModificadores().add(new ProductDiscount("Sony Music Center Desc", 0.18f, music));

        Calculador<Modificador> unCalculador = new Calculador<Modificador>();
        for(int i = 0; i< unaFactura.getListaProducto().size(); i++){
            System.out.println(unaFactura.getListaProducto().get(i).toString());
        }
        System.out.printf("\nMonto total: $%.2f\n", unCalculador.calcularMontoTotal(unaFactura));
    }
}
