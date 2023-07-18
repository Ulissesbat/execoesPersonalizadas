package aplicattion;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta = null;

		try {
			System.out.print("Digite o número da conta: ");
			int numero = sc.nextInt();
			System.out.print("Insira o titular da conta: ");
			sc.nextLine();
			String titular = sc.nextLine();
			System.out.print("Existe depósito inicial (s/n)? ");
			char resp = sc.next().charAt(0);

			if (resp == 's') {
				System.out.print("Digite o valor do depósito inicial: ");
				double depositoInicial = sc.nextDouble();
				conta = new Conta(titular, numero, depositoInicial);
			} else {

				conta = new Conta(titular, numero);
			}

			System.out.println();
			System.out.println("Dados da Conta: ");
			System.out.println(conta);

			System.out.println();
			System.out.println("Entre com valor de deposito: ");
			double valor = sc.nextDouble();
			conta.deposito(valor);

			System.out.println("Dados atualizados: ");
			System.out.println(conta);

			System.out.println();
			System.out.println("Entre com valor de saque: ");
			valor = sc.nextDouble();
			conta.saque(valor);

			System.out.println("Dados atualizados: ");
			System.out.println(conta);

		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida! Certifique-se de digitar números corretamente.");
		} catch (NumberFormatException e) {
			System.out.println("Formato numérico inválido! Certifique-se de digitar números corretamente.");
		} catch (RuntimeException e) {
			System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
