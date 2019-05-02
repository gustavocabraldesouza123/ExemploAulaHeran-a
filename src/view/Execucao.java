package view;

import model.PessoaFisica;

public class Execucao {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("GUSTAVO");
		pf.setEndereco("Rua João Batista");
		
		System.out.println("Nome : "+ pf.getNome());
		System.out.println("Endereço :" +pf.getEndereco());
		

	}

}
