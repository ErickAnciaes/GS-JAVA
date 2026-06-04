package br.com.orbiclean.model;

/**
 * Representa um satélite monitorado pelo sistema.
 * Armazena informações básicas sobre satélites em órbita.
 *  @author Erick, João Pedro , Rafael , João Paulo e Patrick
 */
public class Satelite {

    // Atributos do satélite
    private int id;
    private String nome;
    private String tipo;
    private String paisOrigem;
    private boolean ativo;

    /**
     * Construtor padrão.
     */
    public Satelite() {
        super();
    }

    /**
     * Construtor com todos os atributos.
     *
     * @param id, identificador do satélite
     * @param nome, nome do satélite
     * @param tipo, tipo do satélite
     * @param paisOrigem, país responsável pelo satélite
     * @param ativo, indica se o satélite está ativo
     */
    public Satelite(int id, String nome, String tipo, String paisOrigem, boolean ativo) {
        super();
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.paisOrigem = paisOrigem;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome do satélite.
     *
     * @return nome do satélite
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * Exibe informações resumidas sobre o satélite.
     */
    public void informacao() {

        if (this.ativo) {

            System.out.println(
                this.nome +
                " está em órbita, seu ID é " + this.id +
                ", ele é do tipo " + this.tipo +
                ", pertence ao país " + this.paisOrigem +
                " e está ativo."
            );

        } else {

            System.out.println(
                "O satélite de ID " + this.id +
                " e de nome " + this.nome +
                " está desativado."
            );
        }
    }
}