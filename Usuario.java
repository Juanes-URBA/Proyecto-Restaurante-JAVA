public class Usuario {

    // esta es la  clase padre adry

    String nombre;
    String usuario;
    String clave;

    public Usuario(String nombre, String usuario, String clave) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getRol() {
        return "usuario";
    }
}

