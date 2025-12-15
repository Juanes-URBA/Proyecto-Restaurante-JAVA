public class Pedido {
    
    int mesa;
    String mesero;
    String estado;
    double total;
    
    public Pedido (int mesa, String estado, double total, String mesero){
        this.mesa = mesa;
        this.estado = estado;
        this.mesero = mesero;
        this.total = total;
    }
}
