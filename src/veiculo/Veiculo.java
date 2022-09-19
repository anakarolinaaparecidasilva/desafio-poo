package veiculo;

import java.util.Scanner;

public class Veiculo {

	static int velocidade = 0;
	
	public static void main(String[] args) {
		
		pintar("branco");
		abastecer(0);
		
		ligar();
		
		acelerar();
		acelerar();
		acelerar();
		
		frear();
		
		desligar();	
		
		
	}
		

	public static void acelerar () {
	velocidade = velocidade + 20;
	System.out.println("Acelerando! A velocidade atual é: " + velocidade);
	}
	
	public static void abastecer (int combustivel) {
		
		System.out.println("Digite quantos litros de combustível quer abastecer: ");
		Scanner qtde = new Scanner (System.in);
		int litrosCombustivel = qtde.nextInt();
		combustivel = combustivel + litrosCombustivel;
		if (litrosCombustivel <= 60) {
			System.out.println("Abastecendo...");
		} else {
			System.out.println("O tanque tem capacidade máxima de 60 litros!");
		}
	}

	public static void frear () {
		while (velocidade > 0) {
			System.out.println("Freando...");
			velocidade = velocidade - 20;
		}
		
	}
	
	
	public static void pintar (String cor) {
		
		System.out.println("Digite uma cor para o veículo: ");
		Scanner teclado = new Scanner (System.in);
		cor = teclado.nextLine();
	}
	
	
	public static void ligar() {
	System.out.println("A velocidade atual do carro é :" + velocidade);
		if (velocidade > 0) {
		System.out.println("O carro já está ligado!");
		} else {
			System.out.println("Ligando o carro!");
		}
	}
	
	public static void desligar() {
		
			if (velocidade <= 0) {
			System.out.print("O carro ja está desligado!");
			} else {
				if (velocidade > 0)
				System.out.println("O carro está em movimento e não pode ser deligado!");
			} 
			{
				System.out.println("Desligando o carro!");
		}
		
}
}

	
	

	




		
	

