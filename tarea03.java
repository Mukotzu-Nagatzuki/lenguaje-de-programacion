package semana2;

import java.util.Scanner;

/**
 *
 * @ PACHECO HUAMAN, Juan Ben Hur

 */
public class tarea03 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    float base,altura,area,perimetro ;

 System.out.print("Ingrese un valor para la base del rectángulo: ");
 base = Integer.parseInt(teclado.nextLine());
 System.out.print("Ingrese un valor para la altura del rectángulo: ");
 altura = Float.parseFloat(teclado.nextLine());

 area = base * altura;
 perimetro = ((base + base) + (altura + altura));
 

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("altura : " + altura);
 System.out.println("base : " + base);
 System.out.println("area : " + area);
 System.out.println("perimetro: " + perimetro);
    }
}
