package com.example.validacaocpf;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicação simples para validar CPF com lógica básica.
 */
@SpringBootApplication
public class ValidacaoCpfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValidacaoCpfApplication.class, args);

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um CPF (apenas números ou com pontuação): ");
		String cpf = sc.next().replaceAll("[^0-9]", ""); // remove pontos e traços

		if (cpf.length() != 11 || cpf.chars().distinct().count() == 1) {
			System.out.println("CPF inválido (formato ou todos dígitos iguais).");
		} else {
			// Cálculo do primeiro dígito
			int soma1 = 0;
			for (int i = 0; i < 9; i++) {
				soma1 += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
			}
			int digito1 = soma1 % 11 < 2 ? 0 : 11 - (soma1 % 11);

			// Cálculo do segundo dígito
			int soma2 = 0;
			for (int i = 0; i < 10; i++) {
				int num = (i == 9) ? digito1 : Character.getNumericValue(cpf.charAt(i));
				soma2 += num * (11 - i);
			}
			int digito2 = soma2 % 11 < 2 ? 0 : 11 - (soma2 % 11);

			// Verificação dos dígitos finais
			if (digito1 == Character.getNumericValue(cpf.charAt(9)) &&
				digito2 == Character.getNumericValue(cpf.charAt(10))) {
				System.out.println("CPF válido.");
			} else {
				System.out.println("CPF inválido.");
			}
		}

		sc.close();
	}
}
