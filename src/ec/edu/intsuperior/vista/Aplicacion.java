
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Automovil;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Automovil au1=new Automovil();
       
        Automovil au2=new Automovil("TBA-4716", Automovil.TipoMarca.TOYOTA,2013, Automovil.tipoColor.NEGRO);
        
        System.out.print("Ingresa la placa del av=uto 1: ");
        au1.setPlaca(leer.nextLine());
        au1.setMarca(Automovil.TipoMarca.CHEVROLET);
        System.out.print("Ingresa el anio: ");
        au1.setAnio(leer.nextInt());
        au1.setColor(Automovil.tipoColor.AZUL);
        System.out.println("\n\n\n");
        System.out.println(au1.toString());
        
        System.out.println("\n\n\n");
        System.out.println(au2.toString());
    }
    
}
