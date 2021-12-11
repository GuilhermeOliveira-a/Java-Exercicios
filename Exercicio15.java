import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		
		int dias,ganhofinal,ganho;
		
		System.out.println("Digite quantos dias do mês você trabalhou: ");
		dias = i.nextInt();
		ganho = 25*8;
		ganhofinal = dias*ganho;
		System.out.println("O total de ganho por " +dias+ " dias trabalhados foi de R$:"+ganhofinal);
		i.close();
	}

}
