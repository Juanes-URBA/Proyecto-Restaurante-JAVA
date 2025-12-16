public class Cocinero extends Usuario {

    public Cocinero(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public String getRol() {
        return "cocinero";
    }
}
