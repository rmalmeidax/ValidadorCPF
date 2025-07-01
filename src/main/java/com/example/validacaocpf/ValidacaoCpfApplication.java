package com.example.validacaocpf;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da aplicação Spring Boot para validação de CPF.
 * Esta aplicação tenta implementar a lógica de validação de um CPF.
 * 
 * **Atenção**: A lógica de validação de CPF presente neste código está incompleta e não funciona corretamente.
 * Para uma validação de CPF robusta, é necessário implementar os algoritmos de cálculo dos dígitos verificadores
 * conforme as regras da Receita Federal do Brasil.
 */
@SpringBootApplication // Anotação que combina @Configuration, @EnableAutoConfiguration e @ComponentScan.
                       // Ela habilita a configuração automática do Spring Boot e a varredura de componentes.
public class ValidacaoCpfApplication {

	/**
	 * Método principal que inicia a aplicação Spring Boot e contém a lógica de validação de CPF.
	 * @param args Argumentos de linha de comando passados para a aplicação.
	 */
	public static void main(String[] args) {
		// Inicia a aplicação Spring Boot. Embora seja uma aplicação Spring Boot, a lógica principal
		// está diretamente no método main, o que não é uma prática recomendada para aplicações Spring.
		SpringApplication.run(ValidacaoCpfApplication.class, args);
	
			
			// Cria um objeto Scanner para ler a entrada do usuário via console.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Digite um CPF valido;"); // Solicita ao usuário que digite um CPF.
			// Lê a entrada do usuário e remove todos os caracteres que não são dígitos.
			String cpf = sc.next().replaceAll("[^0-9]","");
			
			
			
			
			// Verifica se o CPF tem 11 dígitos e se é composto apenas por números.
			// A condição `cpf.matches("^[0-9]+$")` sempre será verdadeira após o `replaceAll("[^0-9]","")`,
			// tornando a segunda parte da condição redundante para a validação de formato.
			// Além disso, a lógica de validação dos dígitos verificadores está ausente ou incorreta.
			if (cpf.length() != 11 || cpf.matches("^[0-9]+$")) {
				
								
				int soma = 0; // Inicializa a variável para a soma dos produtos.
				// Loop para calcular o primeiro dígito verificador (incompleto).
				// A lógica para o cálculo dos dígitos verificadores do CPF é mais complexa
				// e envolve pesos específicos para cada dígito, além de tratamento de CPFs com todos os dígitos iguais.
				for (int i = 0; i< 9; i++ ) {
					soma += Character.getNumericValue(cpf.charAt(i)) * (10 -i); // Cálculo parcial e incorreto.
					
					// Esta linha está incompleta e causaria um erro de compilação.
					// int num1 = 11 -()
					
					
					System.out.print(soma); // Imprime a soma parcial, o que não é útil para a validação final.
				}
			}
			
			
						
			sc.close();	// Fecha o objeto Scanner para liberar recursos.
			
			
			
	}

}


