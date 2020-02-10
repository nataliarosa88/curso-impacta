/**
 * 
 */
package principal;

/**
 * @author linux
 *
 */
public class ClienteTO {
	private int codigo;
	private String nome;
	public static int contador = 0;
	/**
	 * 
	 */
	public ClienteTO() {
		super();
		contador = contador + 1;
	}
	/**
	 * @param codigo
	 * @param nome
	 */
	public ClienteTO(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		contador = contador + 1;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
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
	

}
