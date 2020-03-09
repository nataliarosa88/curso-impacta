/**
 * 
 */
package principal;

import Aula4.Aula4.src.principal.Impressao;

public class ClienteTO implements Impressao {
	private int codigo;
	private String nome;
	public static int contador = 0;

	public ClienteTO() {
		super();
		contador = contador + 1;
	}

	public ClienteTO(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		contador = contador + 1;
	}

	public int getCodigo() {

		return codigo;
	}

	public void setCodigo(int codigo) {

		this.codigo = codigo;
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteTO other = (ClienteTO) obj;
		if (codigo != other.codigo)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public void imprimir() {
		System.out.println(this.getCodigo());
		System.out.println(this.getNome());

	}
}
