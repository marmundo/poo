package com.marcelodamasceno.implementacoes;

import com.marcelodamasceno.abstratas.Pessoa;

public class PessoaJuridica extends Pessoa {

	private String cnpj=new String();
	public PessoaJuridica(String nomeTitular,String cnpj) {
		super(nomeTitular);
		this.cnpj=cnpj;
	}
	
	@Override
	public boolean validarDocumento() {
		if (cnpj.length()==14){
			return true;
		}else{
			return false;
		}
	}
	
}
