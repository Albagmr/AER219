/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer219;

import java.util.Scanner;

/**
 *
 * @author aLBA
 */
public class AER219 {

    /**
     * La entrada comienza con una línea que contiene el número de casos de
     * prueba que aparecen a continuación. Cada caso de prueba, que se compone
     * de dos líneas, se corresponde con una administración de lotería. primera
     * línea tiene un único entero con el número de décimos distintos que tiene
     * la administración (como mucho 10.000), mientras que la segunda línea
     * contiene la lista con los números de cada décimo (números entre 0 y
     * 99.999). 
     * 1 
     * 10 
     * 1 2 3 4 5 6 7 8 9 10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numDec;
        int n;
        int contador;
        numero = sc.nextInt();
        for(int i=0;i<numero;i++){
            contador=0;
            numDec=sc.nextInt();
            for (int d=0;d<numDec;d++){
                n=sc.nextInt();
                if (n%2==0){
                    contador++;
                }
            }
            System.out.println(contador);
        }
        

    }

}
