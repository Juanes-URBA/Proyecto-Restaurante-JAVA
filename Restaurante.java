import java.util.HashMap;

public class Restaurante {

    private HashMap<String, Usuario> usuarios = new HashMap<>();
    private HashMap<String, Producto> productos = new HashMap<>();
    private HashMap<Integer, Pedido> pedidos = new HashMap<>();
    private int idPedido = 1;

    public Restaurante() {
        usuarios.put("mesero1", new Mesero("Juan", "mesero1", "123"));
        usuarios.put("cocinero1", new Cocinero("Pedro", "cocinero1", "123"));
        usuarios.put("admin", new Administrador("Admin", "admin", "admin"));

        productos.put("Hamburguesa", new Producto("Hamburguesa", 12000));
        productos.put("Jugo", new Producto("Jugo", 5000));
        productos.put("Perro", new Producto("Perro", 10000));
        productos.put("Papas", new Producto("Papas", 6000));
    }

    public Usuario login(String u, String c) {
        if (usuarios.containsKey(u) && usuarios.get(u).getClave().equals(c))
            return usuarios.get(u);
        return null;
    }

    public void mostrarMenuProductos() {
        System.out.println("---- MENÚ DEL DÍA ----");
        for (Producto p : productos.values()) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }
    }

    public int crearPedido(int mesa, String mesero) {
        pedidos.put(idPedido, new Pedido(idPedido, mesa, mesero));
        System.out.println("Pedido #" + idPedido + " creado");
        return idPedido++;
    }

    public void agregarProductoPedido(int id, String prod, int cant) {
        if (!productos.containsKey(prod)) return;
        Pedido p = pedidos.get(id);
        Producto pr = productos.get(prod);
        p.agregarProducto(prod, pr.getPrecio(), cant);
    }

    public void verPedidosPendientes() {
        for (Pedido p : pedidos.values())
            if (p.getEstado().equals("pendiente"))
                System.out.println("Pedido " + p.getId() + " Mesa " + p.getMesa());
    }

    public void verPedidosListos() {
        for (Pedido p : pedidos.values())
            if (p.getEstado().equals("listo"))
                System.out.println("Pedido " + p.getId() + " listo");
    }

    public void cambiarEstadoPedido(int id) {
        pedidos.get(id).setEstado("listo");
    }

    public void verPedidosDelDia() {
        for (Pedido p : pedidos.values())
            System.out.println("Pedido " + p.getId() + " Total $" + p.getTotal());
    }

    public void totalPorMesa(int mesa) {
        int total = 0;
        for (Pedido p : pedidos.values())
            if (p.getMesa() == mesa) total += p.getTotal();
        System.out.println("Total mesa " + mesa + ": $" + total);
    }

    public void pedidosPorMesero() {
        HashMap<String, Integer> conteo = new HashMap<>();
        for (Pedido p : pedidos.values())
            conteo.put(p.getMesero(), conteo.getOrDefault(p.getMesero(), 0) + 1);

        for (String m : conteo.keySet())
            System.out.println(m + ": " + conteo.get(m));
    }

    public void verPedidosPorMesero(String nombre) {
        for (Pedido p : pedidos.values())
            if (p.getMesero().equals(nombre))
                System.out.println("Pedido " + p.getId() + " Mesa " + p.getMesa());
    }

    public void editarProducto(String nombre, int precio) {
        if (productos.containsKey(nombre))
            productos.get(nombre).setPrecio(precio);
    }

    public void crearProducto(String nombre, int precio) {
        productos.put(nombre, new Producto(nombre, precio));
    }

    public void reporteFinal() {
        int total = 0;
        for (Pedido p : pedidos.values()) total += p.getTotal();
        System.out.println("Pedidos: " + pedidos.size());
        System.out.println("Total ingresos: $" + total);
    }
    
    public HashMap<Integer, Pedido> getPedidos() {
    return pedidos;
    }
}
