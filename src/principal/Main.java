package principal;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bom Dia!");
		
		System.out.print("--------------------------------------");
		
		System.out.print("\nQual é o valor do Dollar? ");
		double dollar = input.nextDouble();
		
		System.out.print("\nQuantos Dollares você quer comprar? ");
		double valor = input.nextDouble();
		
		double resultado =  Conversor.converte(dollar, valor);
		
		System.out.printf("\nVocê vai pagar: %.2f em Reais $", resultado);
		
		input.close();

	}

}
