import java.util.Scanner;

public class Mensajeria {

    Scanner sc = new Scanner(System.in);

    public void opcionesMesero() {
        System.out.println("----------Mesero----------");
        System.out.println("1. Consultar menú del día");
        System.out.println("2. Tomar nuevo pedido");
        System.out.println("3. Ver pedidos enviados");
        System.out.println("0. Cerrar sesión");
    }

    public void opcionesCocinero() {
        System.out.println("--------Cocinero---------");
        System.out.println("1. Ver pedidos pendientes");
        System.out.println("2. Cambiar estado de pedido");
        System.out.println("0. Cerrar sesión");
    }

    public void opcionesAdmin() {
        System.out.println("---------------Administrador-----------------");
        System.out.println("1. Ver pedidos del día");
        System.out.println("2. Consultar total por mesa");
        System.out.println("6. Cerrar jornada (total del día)");
        System.out.println("0. Cerrar sesión");
    }

    public void mostrarMenuProductos() {
        System.out.println("------Menú del día-----");
        System.out.println("Hamburguesa - $12000");
        System.out.println("Jugo - $5000");
        System.out.println("Perro caliente - $10000");
        System.out.println("Papas fritas - $6000");
    }

    public int pedirEntero(String msg) {
        System.out.print(msg);
        int n = sc.nextInt();
        sc.nextLine(); 
        return n;
    }

    public String pedirTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }

    public void cerrarSesion(String nombre) {
        System.out.println("Hasta pronto, " + nombre);
    }
}
