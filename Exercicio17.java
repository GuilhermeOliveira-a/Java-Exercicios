import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Scanner i = new Scanner(System.in);
		 
		double velocidade,dif, valor;
		dif = 0.0;
		
		System.out.println("Digite a velocidade do carro:");
		velocidade = i.nextDouble();
		
		if (velocidade>80) {
			dif = velocidade-80;
			valor = dif*5;
			
			System.out.println(velocidade);
			System.out.println(dif);
			System.out.println(valor);
		}
		i.close();
		
		

	}

}
