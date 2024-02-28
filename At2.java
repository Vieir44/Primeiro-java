package atividades;
import java.util.Scanner;
public class At2 {

	public static void main(String[] args) {
	
		//Entrada de dados
		double horatrab, valorhora, salbruto, sallíquido, INSS;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o seu número de horas trabalhadas: ");
		horatrab = ler.nextDouble();
		
		System.out.println("Informe o seu ganho por hora: ");
		valorhora = ler.nextDouble();
		
		salbruto = valorhora * horatrab;
		INSS = salbruto * 0.12;
		sallíquido = salbruto - INSS;
		
		System.out.println("O seu salário bruto é: " + salbruto);
		System.out.println("O seu salário líquido é: " + sallíquido);
		
		
		
		

		
		
		
		
		
	 
		

	}

}
