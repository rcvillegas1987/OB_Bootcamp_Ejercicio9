public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente=new Cliente();
        nuevoCliente.edad=35;
        nuevoCliente.nombre="Richard Castillo";
        nuevoCliente.telefono=942971664;
        System.out.println("edad : "+nuevoCliente.edad);
        System.out.println("nombre: "+ nuevoCliente.nombre);
        System.out.println("telefono:"+nuevoCliente.telefono);
        // ERROR nuevoCliente.salario=9999;
        Trabajador nuevo=new Trabajador();
        nuevo.salario=99999;
        System.out.println("Salario del trabajador : "+nuevo.salario);
    }
}
 class Persona{
    public int edad;
    String nombre;
    int telefono;

}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
     int salario;
}
