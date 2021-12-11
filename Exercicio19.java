import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		double n1, n2, aproveitamento;
		System.out.println("Digite a primeira nota");
		n1 = i.nextDouble();
		
		System.out.println("Digite a segunda nota");
		n2 = i.nextDouble();
		
		aproveitamento = n1+n2/2;
		
		if (aproveitamento > 7) {
			System.out.println("Você ficou acima da media");
			
		}else {
			System.out.println("Você ficou de recuperação");
		}
		i.close();

	}

}
