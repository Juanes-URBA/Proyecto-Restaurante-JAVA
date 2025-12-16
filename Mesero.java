
public class Mesero extends Usuario {

    public Mesero(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    public void menu(Restaurante r, Mensajeria msg) {
        int op;

        do {
            msg.opcionesMesero();
            op = msg.pedirEntero("Opción: ");

            switch (op) {
                case 1:
                    r.mostrarMenuProductos();
                    break;

                case 2:
                    int mesa = msg.pedirEntero("Número de mesa: ");
                    int idPedido = r.crearPedido(mesa, getNombre());
                    String resp;

                    do {
                        r.mostrarMenuProductos();
                        String prod = msg.pedirTexto("Producto: ");
                        int cant = msg.pedirEntero("Cantidad: ");
                        r.agregarProductoPedido(idPedido, prod, cant);
                        resp = msg.pedirTexto("¿Agregar otro producto? (s/n): ");
                    } while (resp.equalsIgnoreCase("s"));
                    break;

                case 3:
                    r.verPedidosPorMesero(getNombre());
                    break;
            }

        } while (op != 0);

        msg.cerrarSesion(getNombre());
    }
}
