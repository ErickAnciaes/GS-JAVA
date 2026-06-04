package br.com.orbiclean.model;

/**
 * Representa um detrito espacial monitorado pelo sistema.
 * Os detritos podem representar satélites desativados,
 * fragmentos de foguetes ou outros objetos em órbita.
 * 
 * @author Erick, João Pedro , Rafael , João Paulo e Patrick
 */
public class DetritoEspacial {

    // Atributos do detrito espacial
    private int id;
    private String nomeObjeto;
    private double velocidade;
    private double altitude;
    private String riscoColisao;
    private String origem;

    /**
     * Construtor padrão.
     */
    public DetritoEspacial() {
        super();
    }

    /**
     * Construtor com todos os atributos.
     *
     * @param id, identificador do detrito
     * @param nomeObjeto, nome do objeto espacial
     * @param velocidade, velocidade do objeto
     * @param altitude, altitude atual
     * @param riscoColisao, nível de risco de colisão
     * @param origem, origem do detrito
     */
    public DetritoEspacial(int id, String nomeObjeto, double velocidade,
                           double altitude, String riscoColisao, String origem) {

        this.id = id;
        this.nomeObjeto = nomeObjeto;
        this.velocidade = velocidade;
        this.altitude = altitude;
        this.riscoColisao = riscoColisao;
        this.origem = origem;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeObjeto() {
        return nomeObjeto;
    }

    public void setNomeObjeto(String nomeObjeto) {
        this.nomeObjeto = nomeObjeto;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getRiscoColisao() {
        return riscoColisao;
    }

    public void setRiscoColisao(String riscoColisao) {
        this.riscoColisao = riscoColisao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    /**
     * Exibe uma descrição resumida do detrito.
     */
    
    public void informacoesDetrito() { System.out.println(" O/A " + this.nomeObjeto + " está em uma altitude de " + this.altitude + " com uma velocidade de " + this.velocidade + " KM/H " + " atualmente o risco de colisão é " + this.riscoColisao + " e tem origem de um " + this.origem); }
}