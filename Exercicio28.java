import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int largura, comprimento,total;
		
		System.out.println("Digite o comprimento do terreno :");
		comprimento = i.nextInt();
		System.out.println("Digite a largura do terreno :");
		largura = i.nextInt();
		
		total = largura*comprimento;
		
		if(total< 100) {
			System.out.println("Terreno POPULAR");
		}else if(total == 100 || total <= 500){
			System.out.println("Terreno MASTER");
		}else if(total >= 500) {
			System.out.println("Terreno VIP");
		}
		System.out.println("O total do seu terreno é de:"+total);
		i.close();

	}

}
