package clases;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        SinConstructor ob = new SinConstructor();
        ob.pedirNombre();
        ob.Imprimir();
        
        //El constructor se invoca solo, nos ahorramos el estar creados metodos
        ConConstructor mensajero = new ConConstructor();

    }

}
