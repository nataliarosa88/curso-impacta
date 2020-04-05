package Aula11;

public class ProdutoTO {
    private int codigo;
    private String nome;
    private float valor;
    private String EAN;
    public ProdutoTO() {
        super();
    }
    public ProdutoTO(int codigo, String nome, float valor, String eAN) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        EAN = eAN;
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
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getEAN() {
        return EAN;
    }
    public void setEAN(String eAN) {
        EAN = eAN;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((EAN == null) ? 0 : EAN.hashCode());
        result = prime * result + codigo;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + Float.floatToIntBits(valor);
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
        ProdutoTO other = (ProdutoTO) obj;
        if (EAN == null) {
            if (other.EAN != null)
                return false;
        } else if (!EAN.equals(other.EAN))
            return false;
        if (codigo != other.codigo)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (Float.floatToIntBits(valor) != Float.floatToIntBits(other.valor))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "ProdutoTO [codigo=" + codigo + ", nome=" + nome + ", valor="
                + valor + ", EAN=" + EAN + "\n" + "]";
    }

}