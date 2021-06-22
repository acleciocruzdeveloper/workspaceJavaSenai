package org.senai.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa("Aclécio", 8, 4, 1979);
		
		System.out.println(pessoa.getNome()); 
		System.out.println(pessoa.getDataNascimento()); 
		System.out.println(pessoa.calculaIdade()); 
		
		pessoa.setNome("Aclecio Cruz");
		System.out.println(pessoa.getNome());
	}

}
