package semana2;

import java.util.Scanner;

/**
 *
 * @ PACHECO HUAMAN, Juan Ben Hur

 */
public class tarea04 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    float radio, altura,area,volumen;
    
 System.out.print("Ingrese un valor para el radio del cilindro : ");
 radio = Float.parseFloat(teclado.nextLine());
 System.out.print("Ingrese un valor para la altura del cilindro  : ");
 altura = Float.parseFloat(teclado.nextLine());

 area = (float) (2*Math.PI*radio*(radio+altura));
 volumen = (float) (Math.PI*(radio*radio)*altura);
 

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("altura : " + altura);
 System.out.println("radio : " + radio);
 System.out.println("area : " + area);
 System.out.println("perimetro: " + volumen);
    }

}


