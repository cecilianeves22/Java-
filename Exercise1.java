/* 1. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, 
negativo ou zero.*/

import java.util. *;
public class Exercise1 {
public static void main (String [] args) {  
Scanner sc = new Scanner (System.in);
System.out.println ("Informe um valor: ");  
		int n1 = sc.nextInt(); 
if (n1 > 0) {
System.out.println ("O número informado é positivo.");
}
if (n1 < 0) {
System.out.println ("O número informado é negativo.");
}
if (n1 == 0) {
System.out.println ("O número informado é zero.");

	sc.close();
}
}
}