package semana2;

import java.util.Scanner;

/**
 *
 * @ PACHECO HUAMAN, Juan Ben Hur

 */
public class tarea02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    float area, altura, ancho, precio;

 System.out.print("Ingrese un valor para la altura del terreno: ");
 altura = Float.parseFloat(teclado.nextLine());
 System.out.print("Ingrese un valor para la ancho del terreno : ");
 ancho = Float.parseFloat(teclado.nextLine());

 area = altura * ancho;
 precio = area * 750;
 

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("altura : " + altura);
 System.out.println("ancho : " + ancho);
 System.out.println("area : " + area);
 System.out.println("precio : " + precio);
    }
}

