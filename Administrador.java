public class Administrador extends Usuario {

    public Administrador(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public String getRol() {
        return "admin";
    }
}
