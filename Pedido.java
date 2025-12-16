public class Pedido {
    int id;
    int mesa;
    String mesero;
    String estado;

    public Pedido(int id, int mesa, String mesero) {
        this.id = id;
        this.mesa = mesa;
        this.mesero = mesero;
        this.estado = "pendiente";
    }
}
