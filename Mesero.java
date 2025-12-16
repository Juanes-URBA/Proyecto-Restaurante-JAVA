public class Mesero extends Usuario {

    public Mesero(String nombre, String usuario, String clave) {
        super(nombre, usuario, clave);
    }

    @Override
    public String getRol() {
        return "mesero";
    }
}
