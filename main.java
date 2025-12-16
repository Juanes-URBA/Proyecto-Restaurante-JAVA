public class Main {
    public static void main(String[] args) {

        Restaurante r = new Restaurante();
        Mensajeria msg = new Mensajeria();

        String u = msg.pedirTexto("Usuario: ");
        String c = msg.pedirTexto("Contraseña: ");

        Usuario user = r.login(u, c);

        if (user instanceof Mesero)
            ((Mesero) user).menu(r, msg);
        else if (user instanceof Cocinero)
            ((Cocinero) user).menu(r, msg);
        else if (user instanceof Administrador)
            ((Administrador) user).menu(r, msg);
        else
            System.out.println("Credenciales incorrectas");
    }
}
