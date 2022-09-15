package controller;

import br.fateczl.pilhasInt.PilhaInt;

public class CalculadoraController {

	PilhaInt p = new PilhaInt();
		
	public CalculadoraController() {
		super();
	}

	public void empilhar(int num) {
		
		p.push(num);
	}
	
	
	public boolean testePilha() {
		int tamanho = p.tamanho();
		if (tamanho < 2) {
			System.out.println("Para calcular digite outro numero");
			return true;
		}
		return false;
	}
	
	public double calcular (String op) {
		double res=0;
		int valor1 = 0, valor2 = 0;
		
		if (op.equals("+")) {
			try {
			valor1 = p.pop();
			valor2 = p.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		res = (double)valor1 + (double)valor2;
		
		} else if (op == "-") {
			try {
				valor1 = p.pop();
				valor2 = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			res = (double)valor1 - (double)valor2;
		}else if (op == "*") {
			try {
				valor1 = p.pop();
				valor2 = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			res = (double)valor1 * (double)valor2;
		}else if (op == "/") {
			try {
				valor1 = p.pop();
				valor2 = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			res = (double)valor1 / (double)valor2;
		}
		
		return res;
	}
}
