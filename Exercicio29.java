import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String nome;
		double ano, salario,novosalario;
		
		System.out.println("Digite seu nome:");
		nome = i.next();
		System.out.println("Digite quantos anos você trabalhou:");
		ano = i.nextDouble();
		System.out.println("Digite o valor do seu salario:");
		salario = i.nextDouble();
		
		if(ano <= 3) {
			novosalario = salario*3/100;
			System.out.println("Você tera um aumento de 3%");
			System.out.println("Ola,"+nome+"seu novo salario é de "+novosalario);	
		}else if(ano == 3 || ano <=10) {
			novosalario = salario*12.5/100;
			System.out.println("Você tera um aumento de 12.5%");
			System.out.println("Ola,"+nome+"seu novo salario é de "+novosalario);
		}else if(ano >= 10) {
			novosalario = salario*20/100;
			System.out.println("Você tera um aumento de 20%");
			System.out.println("Ola,"+nome+ " seu novo salario é de "+novosalario);
		}
		
	i.close();
	}

}
