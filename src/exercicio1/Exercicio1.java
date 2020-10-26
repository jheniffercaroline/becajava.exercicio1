package exercicio1;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite aqui os meses a serem convertidos em dias :");
		int meses = leitor.nextInt();
		int resultado = meses * 30;
		System.out.println("Aqui esta o resultado : " +resultado+ " dias");

	}

}
