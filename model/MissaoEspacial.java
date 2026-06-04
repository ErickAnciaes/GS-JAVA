package br.com.orbiclean.model;

/**
 * Representa uma missão espacial cadastrada no sistema.
 * Cada missão possui informações relacionadas ao monitoramento
 * e controle de lixo espacial.
 * 
 * @author Erick, João Pedro , Rafael , João Paulo e Patrick
 */
public class MissaoEspacial {

    // Atributos da missão espacial
    private int id;
    private String nome;
    private String areaImpacto;
    private String objetivo;
    private String odsRelacionada;
    private String tecnologia;
    private int prioridade;
    private String status;

    /**
     * Construtor padrão.
     */
    public MissaoEspacial() {
        super();
    }

    /**
     * Construtor com todos os atributos da missão.
     *
     * @param id, identificador da missão
     * @param nome, nome da missão
     * @param areaImpacto, área de impacto da missão
     * @param objetivo, objetivo principal da missão
     * @param odsRelacionada ODS, relacionada
     * @param tecnologia, tecnologia utilizada
     * @param prioridade, nível de prioridade da missão
     * @param status, status atual da missão
     */
    public MissaoEspacial(int id, String nome, String areaImpacto,
                          String objetivo, String odsRelacionada,
                          String tecnologia, int prioridade, String status) {

        this.id = id;
        this.nome = nome;
        this.areaImpacto = areaImpacto;
        this.objetivo = objetivo;
        this.odsRelacionada = odsRelacionada;
        this.tecnologia = tecnologia;
        this.prioridade = prioridade;
        this.status = status;
    }

    /**
     * Exibe todos os dados da missão de forma formatada.
     */
    @Override
    public String toString() {
        return "ID: " + id +
               "\nNome: " + nome +
               "\nÁrea de Impacto: " + areaImpacto +
               "\nObjetivo: " + objetivo +
               "\nODS: " + odsRelacionada +
               "\nTecnologia: " + tecnologia +
               "\nPrioridade: " + prioridade +
               "\nStatus: " + status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaImpacto() {
        return areaImpacto;
    }

    public void setAreaImpacto(String areaImpacto) {
        this.areaImpacto = areaImpacto;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getOdsRelacionada() {
        return odsRelacionada;
    }

    public void setOdsRelacionada(String odsRelacionada) {
        this.odsRelacionada = odsRelacionada;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}