/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scaner;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class Scaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bunas como te llamas?");
        String nombre=teclado.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
