import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		int salario,reajuste, novosalario;
		
		System.out.println("Digite o valor do salario de um funcionario");
		salario = i.nextInt();
		System.out.println("O salario tera um reajuste de 15%");
		reajuste = salario*15/100;
		novosalario = salario+reajuste;
		System.out.println("Seu novo salario é de R$:"+novosalario);
		i.close();

	}

}
