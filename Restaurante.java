
    import java.util.HashMap;

public class Restaurante {

    HashMap<String, Usuario> usuarios = new HashMap<>();
    HashMap<Integer, Producto> productos = new HashMap<>();
    HashMap<Integer, Pedido> pedidos = new HashMap<>();


    public void verPedidosPendientes(HashMap<Integer, Pedido> pedidos) {
        System.out.println("---- PEDIDOS PENDIENTES ----");
        for (Pedido p : pedidos.values()) {
            if (p.getEstado().equals("Pendiente")) {
                p.mostrarPedido();
            }
        }
    }
    public void cambiarEstadoPedido(HashMap<Integer, Pedido> pedidos, int idPedido, String nuevoEstado) {
        Pedido pedido = pedidos.get(idPedido);
        if (pedido != null) {
            pedido.setEstado(nuevoEstado);
            System.out.println("Pedido #" + idPedido + " ahora está: " + nuevoEstado);
        } else {
            System.out.println("Pedido no encontrado");
        }
    }
    public void verPedidosListos(HashMap<Integer, Pedido> pedidos) {
        System.out.println("---- PEDIDOS LISTOS ----");
        for (Pedido comanda : pedidos.values()) {
            if (comanda.getEstado().equals("Listo")) {
                comanda.mostrarPedido();
            }
        }
    }
}

