package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Número da conta: ");
		 int numero = sc.nextInt();
		 System.out.print("Nome do cliente: ");
		 String cliente = sc.nextLine();
		 System.out.print("Saldo inicial: ");
		 Double saldo = sc.nextDouble();
		 System.out.print("Limite de saque: ");
		 Double limite = sc.nextDouble();
		 
		 System.out.print("Qual o valor do saque: ");
		 Double saque = sc.nextDouble();
		 
		 System.out.printf("Novo saldo: %.2f%n", getSaque.ContaCorrente(saque));
		 
		 
		 }
	}

}
