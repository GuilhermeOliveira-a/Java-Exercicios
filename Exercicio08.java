import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valor;
		double km,hm,dam,dm,cm,mm;
		
		System.out.println("Digite a distancia em metros: ");
		valor = sc.nextInt();
		km = valor/1000.0;
		hm = valor/100;
		dam = valor/10;
		dm = valor*10;
		cm = valor*100;
		mm = valor*1000;
		
		
		System.out.println("Valor em Km :"+km);
		System.out.println("Valor em hm :"+hm);
		System.out.println("Valor em dam:"+dam);
		System.out.println("Valor em dm :"+dm);
		System.out.println("Valor em cm :"+cm);
		System.out.println("Valor em mm :"+mm);
		sc.close();
		
		
	}

}
