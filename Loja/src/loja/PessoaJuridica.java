package loja;

import javax.swing.JOptionPane;

public class PessoaJuridica extends Cliente{
	private String cnpj;
	private String nomeFantasia;
	private int desconto = 20;
	
	
	
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public void desconto(int total) {
		float valor = total-((total*desconto)/100);
		JOptionPane.showMessageDialog(null, "Desconto aplicado: " + desconto
				+ "Valor total com desconto = "
				+ valor);
		
		System.exit(0);
	}
	
	
}
