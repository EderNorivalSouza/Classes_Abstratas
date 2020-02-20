package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.entidade;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<entidade> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)?");
			char x = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double income = sc.nextDouble();
			
			if(x=='i') {
				System.out.print("Health expenditures: ");
				double saude=sc.nextDouble();
				list.add(new PessoaFisica(name, income, saude));
			}
			else {
				System.out.print("Number of employees: ");
				int number = sc.nextInt();
				list.add(new PessoaJuridica(name, income, number));
			}
		}
		
		System.out.println();
		
		double soma = 0.0;
		System.out.println("TAXES PAID:");
		for (entidade ent : list) {
			double tax = ent.calcTax();
			System.out.println(ent.getName()+": $ "+ String.format("%.2f", tax));
			soma += tax;
		}
		System.out.println();
		System.out.println("Total taxes: $ "+ String.format("%.2f", soma));
		
	sc.close();
	}

}
