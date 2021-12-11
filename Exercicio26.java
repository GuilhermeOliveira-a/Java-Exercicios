import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Digite o valor do primeiro numero:");
		n1 = i.nextInt();
		
		System.out.println("Digite o valor do segundo numero:");
		n2 = i.nextInt();
		
		if (n1 > n2){
			System.out.println("O primeiro valor é maior");	
		}else if(n1 < n2){
			System.out.println("O segundo valor é maior");
		}else if(n1==n2){
			System.out.println("Os dois numeros são iguais");
		}
		

		i.close();
	}

}
 