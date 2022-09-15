package view;

import javax.swing.JOptionPane;

import controller.CalculadoraController;

public class Principal {

	public static void main(String[] args) {
		int num = 0, e = 0;
		double res;
		String op;
		CalculadoraController calc = new CalculadoraController();

		while (e != 9) {
			e = Integer.parseInt(
					JOptionPane.showInputDialog("Calculadora NPR\n1-Inserir Valor \n2-Calcular Valores \n9-Finalizar"));
			switch (e) {
			case 1: {
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
				calc.empilhar(num);
			}
				break;
			case 2: {
				op = JOptionPane.showInputDialog("Digite uma operacao (+ , - , * , /)");
				if (calc.testePilha() == true) {
					break;
				} else {
					res = calc.calcular(op);
					System.out.println("Resultado:" + res);
				}
			}
				break;
			case 9: {
				System.out.println("Calculadora Finalizada");
			}
				break;

			default:
				System.out.println("Opcao invalida");
			}

		}
	}

}
