import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int ano, bissexto ;
		
		System.out.println("Digite um ano :");
		ano = i.nextInt();
		
		bissexto = ano % 4;
		
		if(bissexto == 0){
			System.out.println("O ano de "+ano+" � um ano bissexto");
			
		}else {
			System.out.println("O ano de "+ano+" n�o � um ano bissexto");
		}
		i.close();
		
		

	}

}
