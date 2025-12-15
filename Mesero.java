public class Mesero {

    Usuario dato;

    public Mesero(String nombre, String password){
        dato = new Usuario(nombre, password);
    }
    
    Mensajeria mj = new Mensajeria();

    public void menu(){
        mj.opcionesMesero();
    }
    
}
