package br.com.orbiclean.model;

/**
 * Representa um operador responsável pelo monitoramento
 * e gerenciamento das missões espaciais.
 * @author Erick, João Pedro , Rafael , João Paulo e Patrick
 * 
 */
public class Operador {

    // Atributos do operador
    private int id;
    private String nome;
    private String cargo;
    private String organizacao;

    /**
     * Construtor com todos os atributos.
     *
     * @param id, identificador do operador
     * @param nome, nome do operador
     * @param cargo, cargo ocupado pelo operador
     * @param organizacao, organização em que trabalha
     */
    public Operador(int id, String nome, String cargo, String organizacao) {
        super();
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.organizacao = organizacao;
    }

    /**
     * Construtor padrão.
     */
    public Operador() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome do operador.
     *
     * @return nome do operador
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(String organizacao) {
        this.organizacao = organizacao;
    }

    /**
     * Exibe uma ficha resumida do operador.
     */
    public void fichaOperador() {

        System.out.println(
            "O operador é " + this.nome +
            ", seu ID é " + this.id +
            ", seu cargo é " + this.cargo +
            " e trabalha para " + this.organizacao
        );
    }
}