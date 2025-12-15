
import java.util.Scanner;

public class Mensajeria {
    //Esta función es para mostrar el menú de las opciones que tiene el mesero
    public void opcionesMesero(){
        System.out.println("----------Mesero----------");
        System.out.println("1.Consultar menú del día." + "\n" +
                            "2.Tomar nuevo pedido." + "\n" +
                            "3.Ver pedidos enviados." + "\n" +
                            "0.Cerrar sesión");
    }
    //esta es la Opción 1 del menú principal de Mesero.
    public void opcion1Mesero(){
        System.out.println("------Menú del día-----");
        System.out.println("1.Hamburgesa......$12.000" + "/n" + 
                            "2.Jugo natural.....$5.000" + "\n" +
                            "3.Perro caliente.....$10.000" + "\n" + 
                            "4.Papas fritas.......$6.000" + "\n" +
                            "0.Salir");
    }
    //Esta es la opción 2 del menú principal de Mesero
    public void opcion2Mesero(){
        System.out.println("-----Nuevo Pedido------");
        System.out.println("Ingrese el número de la mesa: ");
        pedirDatosEnteros(); 
        opcion1Mesero();
        System.out.println("Ingrese el número del producto: ");
        pedirDatosEnteros(); 
        System.out.println("Cantidad: ");
        pedirDatosEnteros(); 
        System.out.println("¿Desea agregar otro producto?, Ingresa S para SI / N para NO: ");
        pedirDatosCadena();
        //falta terminarlo
    }
    //Esta es la opción 3 del menú principal de Mesero
    public void opcion3Mesero(){
        System.out.println("-----Pedidos Enviados-----");
        //pendiente
    }
    //Esta es el menú principal de cocinero
    public void opcinesCocinero(){
        System.out.println("--------Cocinero---------");
        System.out.println("1.Ver pedidos pendientes." + "\n "+
                            "2.Cambiar estado de pedido." + "\n" +
                            "3.Ver pedidos listos." + "\n" + 
                            "0.Cerrar sesión");
    }
    //Esta es la opcion 1 del menú principal de cocinero
    public void Opcion1Cocinero(){
        System.out.println("--------Pedidos Pendientes------");
    }
    //Esta es la opcion 2 del menú principal de cocinero
    public void opcion2Cocinero(){
        System.out.println("");
    }
    //Esta es la opcion 3 del menú principal de cocinero
    public void opción3Cocinero(){
        System.out.println("------Pedido Listo-------");
    }
    //Este es el menú principal de Administrador
    public void opcionesAdmin(){
        System.out.println("---------------Administrador-----------------");
        System.out.println("1.Ver pedidos del día."+ "\n" + 
                            "2.Consultar total por mesa." + "\n" + 
                            "3.Ver cantidad de pedidos por mesero." + "\n" + 
                            "4.Editar precio de producto." + "\n" + 
                            "5.Crear nuevo producto." + "\n" + 
                            "6.Cerrar jornada(ver total del día)" + "\n" + 
                            "0.Cerrar sesión.");
    }
    //Esta es la opcion 1 del menú principal de Administrador
    public void opcion1Admin(){
        System.out.println("-------Pedidos del día--------");
    }
    //Esta es la opcion 2 del menú principal de Administrador
    public void opcion2Admin(){
        System.out.println("Ingrese el número de la mesa que quiere ver:");
        System.out.println("El total del pedidos de la mesa");
        //falta terminar
    }
    //Esta es la opcion 3 del menú principal de Administrador 
    public void opcion3Admin(){
        System.out.println("------Pedidos por mesero------");
    }
    //Esta es la opcion 4 del menú principal de Administrador
    public void opcion4Admin(){
        System.out.println("-------Editar Producto--------");
    }
    //Esta es la opcion 5 del menú principal de Administrador
    public void opcion5Admin(){
        System.out.println("crear nuevo producto");
        System.out.println("Ingrese nombre del producto:");
        pedirDatosCadena();
        System.out.println("Ingrese el precio");
        pedirDatosEnteros();
    }
    //Esta es la opcion 6 del menú principal de Administrador
    public void opcion6Admin(){
        System.out.println("---- Reporte final del día --- ");
    }
    //Esta función resive datos enteros
    public int pedirDatosEnteros(){
        int opcion;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese el número de la opción que desea ejecutar.");
        return opcion = sc.nextInt(); 
    }
    public String pedirDatosCadena(){
        String entradaUsuario; 
        Scanner scr = new Scanner(System.in);
        return entradaUsuario = scr.nextLine();
    }
    public void cerrarSesion(){
        System.out.println("Hasta pronto, "+ ".");
    }
}

