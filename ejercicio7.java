import java.util.*;

public class ejercicio7{
	public static void main(String[] args){
		int num;
		double porcentP;
		double porcentI;
		double porcentC;
		int p=0;
		int im=0;
		int c=0;
		final int NUM_RULETA =15;

		for (int i=1;i<=NUM_RULETA;i++) {
			num=(int)(Math.random()*36);

			if (num==0) {
				c++;
			} 
			else if ((num % 2)==0) {
				p++;
			} 
			else {
				im++;
			}

			System.out.println(i+") Numero aleatorio generado: "+ num);
			System.out.println("\n");
		}

		porcentI=(im*100)/NUM_RULETA;
		porcentC=(c*100)/NUM_RULETA;
		porcentP=(p*100)/NUM_RULETA;
		System.out.println("El porcentaje de Pares es: "+porcentP);
		System.out.println("El porcentaje de Impares es: "+porcentI);
		System.out.println("El porcentaje de Ceros es: "+porcentC);	
	}
}
