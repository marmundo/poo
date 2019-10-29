package com.marcelodamasceno.implementacoes;

import com.marcelodamasceno.abstratas.Pessoa;

public class PessoaFisica extends Pessoa {

	private String cpf=new String();

	public PessoaFisica(String nomeTitular, String cpf) {
		super(nomeTitular);
		this.cpf=cpf;
	}

	@Override
	public boolean validarDocumento() {
		if(cpf.length()==11){
			return true;
		}else{
			return false;
		}
	}
	
	

}
