/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package c.bubblesort_v2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class BubbleSort_V2 {
    
    static int trocas = 0;
    static int comparacoes = 0;
    
    static void troca(Integer[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    
    static void bSortFlag(Integer v[]){
        int n = v.length;
        boolean troca; 
        for(int fase = 1; fase < n; fase++){
            troca = false; 
            for(int j = 0; j < n - fase; j++){
                comparacoes++;
                if(v[j] > v[j+1]){
                    troca(v, j, j+1);
                    troca = true; 
                    trocas++;
                }
            }
            
            if(!troca){
                System.out.println("Vetor já ordenado na fase " + fase);
                break;
            }
        }
    }
    static void mostrarVetor(Integer[] v){
        for (int i : v) {
            System.out.print(i + " | ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] meuVetor = new Integer[5];
        System.out.println("Insira os dados para o vetor:");
        for(int i = 0; i < 5; i++)
            meuVetor[i] = scanner.nextInt();
        
        System.out.println("Vetor original:");
        mostrarVetor(meuVetor);
        
        bSortFlag(meuVetor);
        
        System.out.println("Vetor ordenado:");
        mostrarVetor(meuVetor);
        System.out.println("Comparações: " + comparacoes);
        System.out.println("Trocas: " + trocas);
    }
}
