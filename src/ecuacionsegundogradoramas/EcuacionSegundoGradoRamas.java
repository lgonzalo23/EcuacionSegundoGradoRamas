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
        double x1, x2;
        System.out.print("Ingrese a: ");
        a = sc.nextInt();
        System.out.print("Ingrese b: ");
        b = sc.nextInt();
        System.out.print("Ingrese c: ");
        c = sc.nextInt();
        x1 = (b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        x2 = (b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        System.out.println("Raiz 1: " + x1);
        System.out.println("Raiz 2: " + x2);
    }

}
