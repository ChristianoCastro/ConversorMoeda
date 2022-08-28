package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.ConversorMoeda;

public class Programa {

	public static void main(String[] args) {
		
		
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual o preco do dolar? ");
        double precoDollar = sc.nextDouble();
        
        System.out.print("Quantos dolares serao comprados? ");
        double quantia = sc.nextDouble();
        
        double resultado = ConversorMoeda.dollarParaReal(quantia, precoDollar);
        System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
        
        sc.close();
		}			
}