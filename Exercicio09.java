import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		double real, dolar;
		
		Scanner i = new Scanner(System.in);
		System.out.println("Digite o valor em R$");
		real = i.nextDouble();
		dolar = real/5.51;
		System.out.println("Seu valor em Dolar é $:"+dolar);
		i.close();
		
		

	}

}
