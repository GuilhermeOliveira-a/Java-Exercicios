import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		double largura, altura, area, tinta;
		Scanner i = new Scanner(System.in);
		
		System.out.println("Digite a largura da parede");
		largura = i.nextDouble();
		
		System.out.println("Digite a altura da parede");
		altura = i.nextDouble();
		
		area = largura*altura;
		tinta = area/2;
		
		System.out.println("A sua parede possui " +area+ "m2, para pintar é necessario " +tinta+ " litros de tinta ");
		i.close();

	}

}
