import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner i = new Scanner (System.in);
		int idade, ano, alistamento;
		
		System.out.println("Digite o ano do seu nascimento");
		ano = i.nextInt();
		
		idade = 2021-ano;
		
		if(idade < 18){
			alistamento = 18 - idade;
			System.out.println("Voc� tem " +idade+ " anos e faltam " +alistamento+" para voc� se alistar ");
			
		}else{ alistamento = idade -18;
		System.out.println(alistamento);
			i.close();
			
		}
		
		

	}

}
