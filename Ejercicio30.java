package ejercicios;

import java.util.Scanner;

/*Leer tres números enteros y 
 determinar si el último dígito de los tres números es igual*/
public class Ejercicio30 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int numUno, numDos, numTres;

        //Solicitar datos
        System.out.println("Ingrese el primer número de tres digitos");
        numUno = entrada.nextInt();

        System.out.println("Ingrese el segundo número de tres digitos");
        numDos = entrada.nextInt();

        System.out.println("Ingrese el tercer número de tres digitos");
        numTres = entrada.nextInt();

        if (numUno >= 100 && numUno <= 999) {
            if (numDos > 100 && numDos <= 999) {
                if (numTres >= 100 && numTres <= 999) {
                    numUno %= 10;
                    numDos %= 10;
                    numTres %= 10;
                    if(numUno == numDos && numUno == numTres && numDos == numTres){
                        System.out.println("El último digito de los tres número ingresado es igual");
                    }else{
                        System.out.println("El último digitos de los números ingresados no son iguales");
                    }                            
                } else {
                    System.out.println("Número ingresado no válido");
                }
            } else {
                System.out.println("Número ingresado no válido");
            }
        } else {
            System.out.println("Número ingresado no válido");
        }

    }
}
