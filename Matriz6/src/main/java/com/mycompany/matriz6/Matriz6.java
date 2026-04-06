/*
 6) Crie um programa que preencha uma matriz 15x5 com números inteiros. Determine e
apresente quais números se repetem e quantas vezes.
 */
package com.mycompany.matriz6;

/**
 *
 * @author Alunos
 */
public class Matriz6 {

    public static void main(String[] args) {
        int[][] matriz = new int[15][5];

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Digite uma frase");

        for (int numero_rp = 0; numero_rp <= 100; numero_rp++) {
            int contador_numero_rp = 0;
            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 5; j++) {
                    if (matriz[i][j] == numero_rp) {
                        contador_numero_rp++;

                    }
                }
            }
            if (contador_numero_rp >= 2) {
                System.out.println("Numero: " + numero_rp + " | apareceu: " + contador_numero_rp + " vezes");
            }
        }
    }
}
