import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		
		int idade,ano;
		
		System.out.println("Digite o ano em que você nasceu:");
		idade = i.nextInt();
		ano = (2021-idade);
		if(ano >= 18) {
			
			System.out.println("Você tem idade para votar");
			
		}else {
			System.out.println("Você ainda não tem idade para votar");
		}
i.close();
	}

}
