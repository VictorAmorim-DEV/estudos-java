package application;

import java.util.Scanner;

public class exercicio_matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int mat[][] = new int[M][N];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int X = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == X ) {
					System.out.println();
					System.out.println("Position " + i + "," + j + ":");
					if (i == 0 && j == 0) {
						System.out.println ("Direita: " + mat[i][(j+1)]);
						System.out.println ("Abaixo: " + mat[(i+1)][j]);
					}
					else if(i == 0 && j > 0 && j < mat[i].length-1) {
						System.out.println ("Esquerda: " + mat[i][(j-1)]);
						System.out.println ("Direita: " + mat[i][(j+1)]);
						System.out.println ("Abaixo: " + mat[(i+1)][j]);
					}
					else if(i == 0 && j == mat[i].length-1) {
						System.out.println ("Esquerda: " + mat[i][(j-1)]);
						System.out.println ("Abaixo: " + mat[(i+1)][j]);
					}
					else if (i > 0 && i <mat.length-1 && j == 0) {
						System.out.println ("Direita: " + mat[i][(j+1)]);
						System.out.println ("Acima: " + mat[(i-1)][j]);						
						System.out.println ("Abaixo: " + mat[(i+1)][j]);
					}
					else if(i > 0 && i <mat.length-1 && j > 0 && j < mat[i].length-1) {
						System.out.println ("Direita: " + mat[i][(j+1)]);
						System.out.println ("Esquerda: " + mat[i][(j-1)]);
						System.out.println ("Acima: " + mat[(i-1)][j]);
						System.out.println ("Abaixo: " + mat[(i+1)][j]);
					}
					else if(i > 0 && i <mat.length-1 && j == mat[i].length-1) {
						System.out.println ("Esquerda: " + mat[i][(j-1)]);
						System.out.println ("Acima: " + mat[(i-1)][j]);
						System.out.println ("Abaixo: " + mat[(i+1)][j]);
					}
					else if (i == mat.length-1 && j == 0) {
						System.out.println ("Direita: " + mat[i][(j+1)]);
						System.out.println ("Acima: " + mat[(i-1)][j]);
					}
					else if (i == mat.length-1 && j > 0 && j < mat[i].length-1) {
						System.out.println ("Esquerda: " + mat[i][(j-1)]);
						System.out.println ("Direita: " + mat[i][(j+1)]);
						System.out.println ("Acima: " + mat[(i-1)][j]);
					}
					else if (i == mat.length-1 && j < mat[i].length-1) {
						System.out.println ("Esquerda: " + mat[i][(j-1)]);
						System.out.println ("Acima: " + mat[(i-1)][j]);
					}
				}
			}
		}
		
		/*Outra forma de se fazer para otimizar o código é:
		 
		  for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
		*/	
		sc.close();

	}

}
