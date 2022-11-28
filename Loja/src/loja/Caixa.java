package loja;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Caixa {
	public static void main(String[] args) {
		String[] itens = {"produto1", "produto2", "produto3"};
		int[] valores = {15, 25, 35};
		String item = "";
		String quantidade = "";
		String identificacao = "";
		Cliente cliente = null;
		
		identificacao = JOptionPane.showInputDialog("Digite seu CPF ou CNPJ:"
				+ "\n Ex.:"
				+ "\n CPF: 000.000.000-00"
				+ "\n CNPJ: 00.111.222/0001-00"
				+ "\n ou sem pontuação");
		
		identificacao = identificacao.replace(".", "");
		identificacao = identificacao.replace("-", "");
		identificacao = identificacao.replace("/", "");
		
		System.out.println("replace: "+ identificacao);
		if(identificacao.length() > 11 && identificacao.length() == 14) {
			cliente = new PessoaJuridica("Empresa X", "Rua tal", 
					"(81) 9999-9999", identificacao, "C. X");
			System.out.println("PJ");
		}else if(identificacao.length() == 11) {
			cliente = new PessoaFisica("Fulano de Tal", "Rua ok", "(81) 18",
					identificacao);
			System.out.println("PF");
		} else {
			System.out.println("Erro");
			System.exit(0);
		}
		


		item = (String)JOptionPane.showInputDialog(null, "Escolha o item:"
				+ "\n Digite: '0' para sair",
				"Itens no Estoque", JOptionPane.QUESTION_MESSAGE, 
				null, itens, itens[0]);
		quantidade = JOptionPane.showInputDialog("Escolha a quantidade:");
		int total = Integer.parseInt(quantidade) * 15;
		cliente.desconto(total);
		
	}
}
