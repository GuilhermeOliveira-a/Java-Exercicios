import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		float n1, n2, media;
		
		System.out.println("Digite a primeira nota");
		n1 = i.nextFloat();
		
		System.out.println("Digite a segunda nota");
		n2 = i.nextFloat();
		
		media = n1*n2/2;
		System.out.println("Sua media foi de :"+media);
		
		if (media <= 4.9) {
			System.out.println("Você foi REPROVADO");	
		}else if (media <= 5.0) {
			System.out.println("Você ficou de RECUPERAÇÃO");
		}else if (media >=7.0) {
			System.out.println("Você foi APROVADO");
		}

	i.close();
	}

}
