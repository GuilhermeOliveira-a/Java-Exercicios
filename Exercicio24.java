import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		double distancia, valor;
		
		System.out.println("Digite a distancia que você ira percorrer");
		distancia = i.nextInt();
		
		if(distancia < 200) {
			valor = distancia*0.50;
			System.out.println("O valor foi de R$"+valor);
			
		}else{
			valor = distancia*0.45;
			System.out.println("O valor foi de R$"+valor);
		}
		i.close();
		

	}

}
