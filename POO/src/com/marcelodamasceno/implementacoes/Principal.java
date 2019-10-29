package com.marcelodamasceno.implementacoes;

import com.marcelodamasceno.abstratas.Pessoa;

public class Principal {

	PessoaJuridica pessoaJuridica=null;
	PessoaFisica pessoaFisica=null;
	Pessoa pessoa=null;
	public Principal() {
		pessoaFisica=new PessoaFisica("Marcelo", "00990739350");
		pessoaJuridica=new PessoaJuridica("Americanas", "33014556080017");
		
		pessoa=pessoaFisica;
		pessoa.imprimir();
		pessoa=pessoaJuridica;
		pessoa.imprimir();
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
	}

}
