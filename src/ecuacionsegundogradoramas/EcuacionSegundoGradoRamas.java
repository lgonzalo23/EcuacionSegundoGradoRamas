/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacionsegundogradoramas;

import java.util.Scanner;

/**
 *
 * @author luisg
 */
public class EcuacionSegundoGradoRamas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double discriminante, x1, x2;

        System.out.print("Ingrese a: ");
        a = sc.nextInt();

        System.out.print("Ingrese b: ");
        b = sc.nextInt();

        System.out.print("Ingrese c: ");
        c = sc.nextInt();

        if (a == 0) {
            System.out.println("No es una ecuacion de segundo grado.");
            return;
        }

        discriminante = (b * b) - (4 * a * c);

        if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2.0 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2.0 * a);

            System.out.println("Dos raices reales diferentes:");
            System.out.println("Raiz 1: " + x1);
            System.out.println("Raiz 2: " + x2);
        } else if (discriminante == 0) {
            x1 = (-b) / (2.0 * a);
            System.out.println("Una raiz real doble:");
            System.out.println("Raiz: " + x1);
        } else {
            System.out.println("No existen raices reales.");
        }
    }

}
