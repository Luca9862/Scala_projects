package mod7;

//Scrivere una funzione Java iterativa per il calcolo di Fibonacci

//Fn = 0 se n = 0
//Fn = 1 se n = 1
//Fn = Fn−1 + Fn−2 se n > 1

import java.util.Scanner;

public class FibonacciIterativo {
    public static int fibo(int n){
        int acc1 = 0;
        int acc2 = 1; //gli accumulatori servono per tenere traccia delle funzioni Fn−1 e Fn−2 ad ogni ciclo
        int totale = 0;
        int i = 2;
        if(n==0) return 0;
        else if(n==1) return 1;
        else{

            //questo ciclo simula la ricorsione
            while(i<=n){
                totale = acc1 + acc2;
                acc1 = acc2;
                acc2 = totale;
                i++;
            }
        }
        return totale;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ciao babbuino, inserisci il numero: ");
        int numero = sc.nextInt();
        System.out.println(fibo(numero));
    }
}
