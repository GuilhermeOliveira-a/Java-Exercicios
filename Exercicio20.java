import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		int N; 
		int resto;
		
		
		System.out.println("Digite um numero");
		N = i.nextInt();
		
		resto = (N%2);
	
		
		if(resto == 0) {
			System.out.println("Seu numero é Par");
		
		}else{
			System.out.println("Seu numero é Impar");
		}
		i.close();
				
		
			
	

	}

}
