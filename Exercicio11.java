import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		double a,b,c;
		double delta,x1,x2;
			x1 = 0;
			x2 = 0;
		Scanner i = new Scanner(System.in);
		
		System.out.println("Digite o valor de A");
			a = i.nextDouble();
		
		System.out.println("Digite o valor de B");
			b = i.nextDouble();
		
		System.out.println("Digite o valor de C");
			c = i.nextDouble();
		
			delta = (b*b)-(4*a*c);
		
		if (delta<=0){
			System.out.println("Erro não possui raiz real");
		}
		else
			x1=((-b +(Math.sqrt (delta)))/(2*a));
		    	x2=((-b+(Math.sqrt (delta)))/(2*a));
	          
			System.out.println("Valor de X1"+ x1);
			System.out.println("Valor de X2"+ x2);
				i.close();
	
	}

}
