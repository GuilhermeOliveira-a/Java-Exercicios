import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int quant,anos,ano,total;
		double hora,tempo;
		ano = 365;
	
		
		System.out.println("Digite a quantidade de cigarros que você fuma por dia :");
		quant = i.nextInt();
		
		System.out.println("Por quantos anos você já fumou ?");
		anos = i.nextInt();
		
		total = quant*ano*anos;
		
		System.out.println("A quantidade de cigarros que você fumou durante " + anos+ " anos foi de "+total);
		i.close();
		
		tempo = total*10;
		hora = tempo/1440;
		
		DecimalFormat df = new DecimalFormat("###,#00");
		System.out.println("A quantidade de dias perdidos foi de :"+df.format(hora));
	}

}
