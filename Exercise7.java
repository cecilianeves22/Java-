import java.util.*;
public class Exercise7 {


    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Insira o primeiro valor: ");
            double n1 = sc.nextDouble(); 
        System.out.println ("Insira o segundo valor: ");
            double n2 = sc.nextDouble(); 
        System.out.println ("Insira o terceiro valor: ");
            double n3 = sc.nextDouble();
        System.out.println ("Insira o quarto valor: ");
            double n4 = sc.nextDouble();
        System.out.println ("Insira o quinto valor: ");
            double n5 = sc.nextDouble();
        System.out.println ("Insira o sexto valor: ");
            double n6 = sc.nextDouble();
        System.out.println ("Insira o sétimo valor: ");
            double n7 = sc.nextDouble();
        System.out.println ("Insira o oitavo valor: ");
            double n8 = sc.nextDouble();
        System.out.println ("Insira o nono valor: ");
            double n9 = sc.nextDouble();
        System.out.println ("Insira o último valor: ");
            double n10 = sc.nextDouble();
        
            double soma = 0;

        if(n1 < 40){
            soma += n1;
        }
        if(n2 < 40){
            soma += n2;
        }
        if(n3 < 40){
            soma += n3;
        }
        if(n4 < 40){
            soma += n4;
        }
        if(n5 < 40){
            soma += n5;
        }
        if(n6 < 40){
            soma += n6;
        }
        if(n7 < 40){
            soma += n7;
        }
        if(n8 < 40){
            soma += n8;
        }
        if(n9 < 40){
            soma += n9;
        }
        if(n10 < 40){
            soma += n10;
        }
        System.out.println("A soma dos valores é " + soma);
       
       
        sc.close();
    }
}

