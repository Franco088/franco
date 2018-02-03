package estudiando_java;

import java.util.Scanner;

public class NumerodelaSuerte {

	public static void main(String[] args) {
		
//numero de la suerte
		Scanner sc= new Scanner (System.in);//inicio escanner
		System.out.println("año");//mostrar por pantalla
		int a=sc.nextInt();//almaceno los datos de teclado
		System.out.println("mes ");
		int m=sc.nextInt();
		System.out.println("dia");
		int d=sc.nextInt();
		int s=a+m+d;//creo nuevo espacio y le asigno su valor

		String v=Integer.toString(s);
		int sum=0;
		for (int i = 0; i <v.length(); i++) {
		sum=sum+Integer.parseInt(v.charAt(i)+"");

		}
		System.out.println("NUMERO DE LA SUERTE "+sum);//muestro  valor final
		sc.close();//cerrar scanner
	}

}
