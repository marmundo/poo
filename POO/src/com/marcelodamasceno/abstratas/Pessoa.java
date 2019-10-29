package com.marcelodamasceno.abstratas;

import com.marcelodamasceno.interfaces.Documento;

public abstract class Pessoa implements Documento {
	
	private String nomeTitular=new String();
	
	public Pessoa (String nomeTitular){
		this.nomeTitular=nomeTitular;
	}


	@Override
	public String getNomeTitular() {
		return this.nomeTitular;
	}

	public void imprimir(){
		System.out.println(getNomeTitular()+ " - Documento valido? "+validarDocumento());
	}
	
}
