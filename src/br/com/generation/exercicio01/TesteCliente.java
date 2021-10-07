	/*
	 * 1. Crie uma classe cliente e apresente os atributos e métodos 
	 * referentes esta classe, em seguida crie um objeto cliente, 
	 * defina as instancias deste objeto e apresente as informações 
	 * deste objeto no console.
	 * 
	 * @author Helen Lissa Sonoda
	 * Date: 07/10/2021
	 */

package br.com.generation.exercicio01;

import javax.swing.JOptionPane;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente: ")));
		cliente1.setNome(JOptionPane.showInputDialog("Insira o nome do cliente: "));
		cliente1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: ")));
		cliente1.setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente: "));
		cliente1.setEndereco(JOptionPane.showInputDialog("Insira o endereço do cliente: "));
		cliente1.setCidade(JOptionPane.showInputDialog("Digite a cidade do cliente: "));
				
		JOptionPane.showMessageDialog(null, "Dados do cliente 1: \n\n" + 
										"Id: " + cliente1.getCodigo() + 
										"\nNome: " + cliente1.getNome() + 
										"\nIdade: " + cliente1.getIdade() + 
										"\nCPF: " + cliente1.getCpf() + 
										"\nEndereço: " + cliente1.getEndereco() + 
										"\nCidade: " + cliente1.getCidade(), "Dados",
										JOptionPane.INFORMATION_MESSAGE);

	}

}
