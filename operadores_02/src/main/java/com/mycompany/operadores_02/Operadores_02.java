/*
 * Imagine uma variável chamada salario com valor R$
900,00. Escreva uma expressão linearizada e demonstre sua
solução, para:

a) Determinar o dobro do salário;
b) Aumentar em R$ 150,00 o salário;
c) Determinar o valor do desconto do INSS, considerando que
seja 11% do salário (sem considerar os itens A e B).
d) Determinar o salário líquido considerando os itens B e C;
e) Determinar o salário Líquido considerando os itens A e C;
 */

package com.mycompany.operadores_02;

/**
 *
 * @author Alunos
 */
public class Operadores_02 {

    public static void main(String[] args) {
        int salario = 900;
        float salario_des_inss = (salario + 150.0f) * 11 / 100;
        System.out.println("a) Determinar o dobro do salário; " + "R$ " + (salario + salario));
        System.out.println("b) Aumentar em R$ 150,00 o salario; " + "R$ " + (salario + 150));
        System.out.println("c) Determinar o valor do desconto do INSS, considerando que seja 11% do salario (sem considerar os itens A e B). " + "R$ " + (salario - (salario * 11 / 100)));
        System.out.println("d) Determinar o salário líquido considerando os itens B e C; " + "R$ " + ( (salario + 150) - salario_des_inss));
        System.out.println("e) Determinar o salário Líquido considerando os itens A e C; " + (salario + salario - ((salario + salario) * 11 / 100 )));
    }
}
