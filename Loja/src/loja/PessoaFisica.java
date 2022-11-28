package loja;

import javax.swing.JOptionPane;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private int desconto = 5;
	
	public PessoaFisica(String nome, String endereco,
			String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void desconto(int total) {
		double valor = total-((total*desconto)/100);
		JOptionPane.showMessageDialog(null, "Desconto aplicado: " + desconto
				+ "%"
				+ "\n Valor total com desconto = R$"
				+ valor);
		
		System.exit(0);
	}
	
	
}
