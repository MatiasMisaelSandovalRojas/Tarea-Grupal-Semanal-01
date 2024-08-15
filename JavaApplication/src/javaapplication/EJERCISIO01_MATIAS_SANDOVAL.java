/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

    import java.util.Scanner;
/**
 *Escribe un programa que calcule el area de una figura cualquiera 
 * @author Matias
 */
public class EJERCISIO01_MATIAS_SANDOVAL {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");
        System.out.println("4. Trapecio");
        System.out.print("Ingrese el número de la figura (1-4): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            // Calcular el área de un círculo
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            double areaCirculo = Math.PI * Math.pow(radio, 2);
            System.out.printf("El área del círculo es: %.2f\n", areaCirculo);

        } else if (opcion == 2) {
            // Calcular el área de un triángulo
            System.out.print("Ingrese la base del triángulo: ");
            double baseTriangulo = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double alturaTriangulo = scanner.nextDouble();
            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            System.out.printf("El área del triángulo es: %.2f\n", areaTriangulo);

        } else if (opcion == 3) {
            // Calcular el área de un rectángulo
            System.out.print("Ingrese el ancho del rectángulo: ");
            double anchoRectangulo = scanner.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double alturaRectangulo = scanner.nextDouble();
            double areaRectangulo = anchoRectangulo * alturaRectangulo;
            System.out.printf("El área del rectángulo es: %.2f\n", areaRectangulo);

        } else if (opcion == 4) {
            // Calcular el área de un trapecio
            System.out.print("Ingrese la base mayor del trapecio: ");
            double baseMayorTrapecio = scanner.nextDouble();
            System.out.print("Ingrese la base menor del trapecio: ");
            double baseMenorTrapecio = scanner.nextDouble();
            System.out.print("Ingrese la altura del trapecio: ");
            double alturaTrapecio = scanner.nextDouble();
            double areaTrapecio = ((baseMayorTrapecio + baseMenorTrapecio) * alturaTrapecio) / 2;
    
    
   
             }
        }
    }
     

