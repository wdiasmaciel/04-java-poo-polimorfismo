package principal;

import pessoa.Pessoa;

public class Principal {
    
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ana");
		System.out.println("Nome: " + pessoa.getNome());
	}
}
