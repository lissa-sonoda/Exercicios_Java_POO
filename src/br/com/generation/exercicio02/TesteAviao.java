	/*
	 * 2. Crie uma classe avião e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto avião, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console.
	 * 
	 * @author Helen Lissa Sonoda
	 * Date: 07/10/2021
	 */

package br.com.generation.exercicio02;

import javax.swing.JOptionPane;

public class TesteAviao {

	public static void main(String[] args) {
		
		int velocA, velocF, vA, vF;
		
		Aviao aviao1 = new Aviao();
		
		aviao1.setMarca(JOptionPane.showInputDialog("Digite a marca do avião: "));
		aviao1.setModelo(JOptionPane.showInputDialog("Insira o modelo do avião: "));
		aviao1.setQtdAssento(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos do avião: ")));
		velocA = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade após a aceleração: "));
		velocF = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade após o freio: "));
		
		vA = aviao1.acelerar(velocA);
		vF = aviao1.frear(velocF);
		
		JOptionPane.showMessageDialog(null, "Dados do avião 1: \n\n" + 
										"Marca: " + aviao1.getMarca() + 
										"\nModelo: " + aviao1.getModelo() + 
										"\nQuantidade de Assentos: " + aviao1.getQtdAssento() + 
										"\nQuando acelerou a velocidade aumentou para: " + vA + 
										"\nQuando freou a velocidade diminuiu para: " + vF , "Dados",
										JOptionPane.INFORMATION_MESSAGE);

	}

}
