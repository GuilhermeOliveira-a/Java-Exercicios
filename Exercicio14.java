import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		int km,dias;
		double kmv,diav, kmf,diaf, valorfinal;
		
		diav = 90;
		kmv =0.20;
		
		System.out.println("Por quantos dias você alugou o carro ?");
		dias = i.nextInt();
		System.out.println("Digite o valor de km rodado");
		km = i.nextInt();
		
		diaf = diav*dias;
		kmf = kmv*km;
		valorfinal = diaf+kmf;
		
		System.out.println("O valor final foi de R$"+valorfinal);
		System.out.println(valorfinal);
		i.close();
		
	}

}
