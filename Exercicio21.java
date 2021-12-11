import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int ano, bissexto ;
		
		System.out.println("Digite um ano :");
		ano = i.nextInt();
		
		bissexto = ano % 4;
		
		if(bissexto == 0){
			System.out.println("O ano de "+ano+" é um ano bissexto");
			
		}else {
			System.out.println("O ano de "+ano+" não é um ano bissexto");
		}
		i.close();
		
		

	}

}
