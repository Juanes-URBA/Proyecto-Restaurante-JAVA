public class Administrador extends Usuario {

    public Administrador(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    public void menu(Restaurante r, Mensajeria msg) {
        int op;

        do {
            msg.opcionesAdmin();
            op = msg.pedirEntero("Opción: ");

            switch (op) {
                case 1:
                    r.verPedidosDelDia();
                    break;

                case 2:
                    int mesa = msg.pedirEntero("Mesa: ");
                    r.totalPorMesa(mesa);
                    break;

                case 3:
                    r.pedidosPorMesero();
                    break;

                case 4:
                    String prod = msg.pedirTexto("Producto a editar: ");
                    int precio = msg.pedirEntero("Nuevo precio: ");
                    r.editarProducto(prod, precio);
                    break;

                case 5:
                    String nombreProd = msg.pedirTexto("Nombre del producto: ");
                    int precioProd = msg.pedirEntero("Precio: ");
                    r.crearProducto(nombreProd, precioProd);
                    break;

                case 6:
                    r.reporteFinal();
                    break;

                case 7: 
                    ReporteIAService ia = new ReporteIAService(r);
                    System.out.println(ia.reporteMensualIA(9, 2025));
                    break;
            }

        } while (op != 0);

        msg.cerrarSesion(getNombre());
    }
}
