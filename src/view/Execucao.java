package view;

import model.PessoaFisica;

public class Execucao {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("GUSTAVO");
		pf.setEndereco("Rua Jo�o Batista");
		
		System.out.println("Nome : "+ pf.getNome());
		System.out.println("Endere�o :" +pf.getEndereco());
		

	}

}
