import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.println("Digite o valor de X");
		x = i.nextInt();
		System.out.println("Digite o valor de Y");
		y = i.nextInt();
		System.out.println("Digite o valor de Z");
		z = i.nextInt();
		
		if (x < y + z || y < x + z || z < x+y){
			System.out.println("Trata-se de um triangulo");
		}
		
		if (x == y && x == z){
			System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
		}else if(x == y || x == z){
			System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
			}else
			System.out.println("Três lados diferentes.");
		
		i.close();
	
		}
		

	}
