import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		String nome;
		int sexo;
		//boolean Homem,sexo,Mulher;
		int valor, valorfinal;
		int discount;
	
		
		System.out.print("Digite o nome do cliente :");
		nome = i.next();
		System.out.print("Digite o valor da compra do cliente :");
		valor = i.nextInt();
		System.out.println("Digite o sexo Homem ou Mulher ");
		sexo = i.nextInt();
		if(sexo == 0) {
			discount = valor*5/100;
			valorfinal = valor - discount; 
			System.out.println("Nome:"+nome);
			System.out.println("Valor da compra R$ "+valor);
			System.out.println("Valor final "+valorfinal);
			
		}else if (sexo == 1) {
			discount = valor*13/100;
			valorfinal = valor - discount; 
			System.out.println("Nome:"+nome);
			System.out.println("Valor da compra R$ "+valor);
			System.out.println("Valor final "+valorfinal);
		}
		i.close();
	}

}
