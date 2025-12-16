
    import java.util.HashMap;

public class Restaurante {

    HashMap<String, Usuario> usuarios = new HashMap<>();
    HashMap<Integer, Producto> productos = new HashMap<>();
    HashMap<Integer, Pedido> pedidos = new HashMap<>();

    int idProducto = 1;
    int idPedido = 1;

    public Restaurante() {

        usuarios.put("mesero1", new Mesero("Juan", "mesero1", "1234"));
        usuarios.put("cocinero1", new Cocinero("Pedro", "cocinero1", "1234"));
        usuarios.put("admin", new Administrador("Admin", "admin", "admin"));

        productos.put(idProducto, new Producto(idProducto++, "Hamburguesa", 12000));
        productos.put(idProducto, new Producto(idProducto++, "Jugo", 5000));
    }

    public Usuario login(String u, String c) {
        if (usuarios.containsKey(u) && usuarios.get(u).clave.equals(c))
            return usuarios.get(u);
        return null;
    }
}

