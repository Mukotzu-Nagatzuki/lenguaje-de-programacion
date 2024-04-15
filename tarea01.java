package semana2;
import java.util.Scanner;

/**
 *
 * @PACHECO HUAMAN, Juan Ben Hur
 */
public class tarea01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    float peso, estatura, imc;

 System.out.print("Ingrese un valor para la peso : ");
 peso = Integer.parseInt(teclado.nextLine());
 System.out.print("Ingrese un valor para la estatura : ");
 estatura = Float.parseFloat(teclado.nextLine());

 imc = peso / (estatura*estatura);

 System.out.println("---- Reporte ----");
 System.out.println("-----------------");
 System.out.println("peso : " + peso);
 System.out.println("estatura : " + estatura);
 System.out.println("imc : " + imc);
    }
    
}
