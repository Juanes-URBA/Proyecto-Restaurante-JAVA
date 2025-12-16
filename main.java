import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Restaurante r = new Restaurante();
        Mensajeria msg = new Mensajeria();
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String u = sc.nextLine();
        System.out.print("Clave: ");
        String c = sc.nextLine();

        Usuario log = r.login(u, c);

        if (log == null) {
            System.out.println("Credenciales incorrectas");
            return;
        }

        if (log instanceof Mesero) {
            msg.opcionesMesero();
        }

        if (log instanceof Cocinero) {
            msg.opcionesCocinero();
        }

        if (log instanceof Administrador) {
            msg.opcionesAdmin();
        }
    }
}
