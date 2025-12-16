import java.util.HashMap;

public class Pedido {

    private int id;
    private int mesa;
    private String mesero;
    private String estado;
    private HashMap<String, Integer> productos;
    private int total;

    public Pedido(int id, int mesa, String mesero) {
        this.id = id;
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = "pendiente";
        this.productos = new HashMap<>();
        this.total = 0;
    }

    public int getId() {
        return id;
    }

    public int getMesa() {
        return mesa;
    }

    public String getMesero() {
        return mesero;
    }

    public String getEstado() {
        return estado;
    }

    public int getTotal() {
        return total;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void agregarProducto(String prod, int precio, int cant) {
        productos.put(prod, productos.getOrDefault(prod, 0) + cant);
        total += precio * cant;
    }
}
