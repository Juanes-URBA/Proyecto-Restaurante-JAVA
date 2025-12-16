public class Cocinero extends Usuario {

    public Cocinero(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    public void menu(Restaurante r, Mensajeria msg) {
        int op;

        do {
            msg.opcionesCocinero();
            op = msg.pedirEntero("Opción: ");

            switch (op) {
                case 1:
                    r.verPedidosPendientes();
                    break;

                case 2:
                    int id = msg.pedirEntero("ID del pedido: ");
                    r.cambiarEstadoPedido(id);
                    break;

                case 3:
                    r.verPedidosListos();
                    break;
            }

        } while (op != 0);

        msg.cerrarSesion(getNombre());
    }
}

