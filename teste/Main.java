

package br.com.orbiclean.teste;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.orbiclean.model.DetritoEspacial;
import br.com.orbiclean.model.MissaoEspacial;
import br.com.orbiclean.model.Operador;
import br.com.orbiclean.model.Satelite;


/**
 * Classe principal do sistema Orbiclean.
 * Responsável pelo gerenciamento das missões espaciais
 * relacionadas ao monitoramento de lixo espacial.
 * 
 * @author Erick, João Pedro , Rafael , João Paulo e Patrick
 */

public class Main {

    // Scanner utilizado para entrada de dados
    static Scanner entrada = new Scanner(System.in);

    // Lista que armazena as missões cadastradas
    static ArrayList<MissaoEspacial> missoes = new ArrayList<>();

    public static void main(String[] args) {
    	
    	Operador operador1 = new Operador(33,"Carlos Silva","Engenheiro de Operações Espaciais","NASA");
    	operador1.fichaOperador();
    	
    	DetritoEspacial detrito1 = new DetritoEspacial(56,"Parafuso",40.7,500,"ALTO","Foguete Alemão");
    	detrito1.informacoesDetrito();
    	
    	Satelite satelite1 = new Satelite(12,"HM1000","Coletor de Lixo","Alemanha",true);
    	satelite1.informacao();
    	

        int opcao;

        do {

            exibirMenu();

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarMissao();
                    break;

                case 2:
                    listarMissoes();
                    break;

                case 3:
                    buscarMissao();
                    break;

                case 4:
                    alterarStatus();
                    break;

                case 5:
                    exibirResumo();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        entrada.close();
    }

    /**
     * Exibe o menu principal do sistema.
     */
    public static void exibirMenu() {

        System.out.println("\n===== SISTEMA DE MONITORAMENTO ORBITAL =====");
        System.out.println("1 - Cadastrar missão");
        System.out.println("2 - Listar missões");
        System.out.println("3 - Buscar missão");
        System.out.println("4 - Alterar status");
        System.out.println("5 - Exibir resumo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    /**
     * Realiza o cadastro de uma nova missão espacial.
     */
    public static void cadastrarMissao() {

        MissaoEspacial missao = new MissaoEspacial();

        System.out.println("\n=== CADASTRO DE MISSÃO ===");

        System.out.print("ID: ");
        missao.setId(entrada.nextInt());
        entrada.nextLine();

        // Validação do nome
        String nome;

        do {

            System.out.print("Nome: ");
            nome = entrada.nextLine();

            if (nome.trim().isEmpty()) {
                System.out.println("O nome não pode ficar vazio.");
            }

        } while (nome.trim().isEmpty());

        missao.setNome(nome);

        System.out.print("Área de impacto: ");
        missao.setAreaImpacto(entrada.nextLine());

        System.out.print("Objetivo: ");
        missao.setObjetivo(entrada.nextLine());

        // Validação da ODS
        int ods;

        do {

            System.out.print("ODS Relacionada (1 a 17): ");
            ods = entrada.nextInt();

            if (ods < 1 || ods > 17) {
                System.out.println("Digite uma ODS válida entre 1 e 17.");
            }

        } while (ods < 1 || ods > 17);

        entrada.nextLine();
        missao.setOdsRelacionada(String.valueOf(ods));

        System.out.print("Tecnologia utilizada: ");
        missao.setTecnologia(entrada.nextLine());

        // Validação da prioridade
        int prioridade;

        do {

            System.out.print("Prioridade (1 a 10): ");
            prioridade = entrada.nextInt();

            if (prioridade < 1 || prioridade > 10) {
                System.out.println("Digite um valor entre 1 e 10.");
            }

        } while (prioridade < 1 || prioridade > 10);

        entrada.nextLine();
        missao.setPrioridade(prioridade);

        // Escolha do status por menu
        int statusOpcao;

        do {

            System.out.println("\nSelecione o status:");
            System.out.println("1 - PENDENTE");
            System.out.println("2 - EM ANDAMENTO");
            System.out.println("3 - CONCLUÍDA");
            System.out.println("4 - CANCELADA");

            statusOpcao = entrada.nextInt();
            entrada.nextLine();

            if (statusOpcao < 1 || statusOpcao > 4) {
                System.out.println("Opção inválida.");
            }

        } while (statusOpcao < 1 || statusOpcao > 4);

        switch (statusOpcao) {

            case 1:
                missao.setStatus("PENDENTE");
                break;

            case 2:
                missao.setStatus("EM ANDAMENTO");
                break;

            case 3:
                missao.setStatus("CONCLUÍDA");
                break;

            case 4:
                missao.setStatus("CANCELADA");
                break;
        }

        missoes.add(missao);

        System.out.println("Missão cadastrada com sucesso!");
    }

    /**
     * Exibe todas as missões cadastradas.
     */
    public static void listarMissoes() {

        if (missoes.isEmpty()) {
            System.out.println("Nenhuma missão cadastrada.");
            return;
        }

        System.out.println("\n=== MISSÕES CADASTRADAS ===");

        for (MissaoEspacial m : missoes) {
            System.out.println(m);
            System.out.println("--------------------");
        }
    }

    /**
     * Busca uma missão pelo nome ou pela área de impacto.
     */
    public static void buscarMissao() {

        System.out.println("\n1 - Buscar por nome");
        System.out.println("2 - Buscar por área de impacto");

        int opcao = entrada.nextInt();
        entrada.nextLine();

        boolean encontrada = false;

        switch (opcao) {

            case 1:

                System.out.print("Digite o nome da missão: ");
                String nome = entrada.nextLine();

                for (MissaoEspacial m : missoes) {

                    if (m.getNome().equalsIgnoreCase(nome)) {

                        System.out.println(m);
                        encontrada = true;
                    }
                }

                break;

            case 2:

                System.out.print("Digite a área de impacto: ");
                String area = entrada.nextLine();

                for (MissaoEspacial m : missoes) {

                    if (m.getAreaImpacto().equalsIgnoreCase(area)) {

                        System.out.println(m);
                        encontrada = true;
                    }
                }

                break;

            default:
                System.out.println("Opção inválida.");
        }

        if (!encontrada) {
            System.out.println("Nenhuma missão encontrada.");
        }
    }

    /**
     * Permite alterar o status de uma missão cadastrada.
     */
    public static void alterarStatus() {

        System.out.print("Digite o nome da missão: ");
        String nome = entrada.nextLine();

        boolean encontrada = false;

        for (MissaoEspacial m : missoes) {

            if (m.getNome().equalsIgnoreCase(nome)) {

                System.out.println("\nStatus atual: " + m.getStatus());

                System.out.println("1 - PENDENTE");
                System.out.println("2 - EM ANDAMENTO");
                System.out.println("3 - CONCLUÍDA");
                System.out.println("4 - CANCELADA");

                int opcao = entrada.nextInt();
                entrada.nextLine();

                switch (opcao) {

                    case 1:
                        m.setStatus("PENDENTE");
                        break;

                    case 2:
                        m.setStatus("EM ANDAMENTO");
                        break;

                    case 3:
                        m.setStatus("CONCLUÍDA");
                        break;

                    case 4:
                        m.setStatus("CANCELADA");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        return;
                }

                System.out.println("Status atualizado com sucesso!");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Missão não encontrada.");
        }
    }

    /**
     * Exibe um resumo geral das missões cadastradas.
     */
    public static void exibirResumo() {

        System.out.println("\n=== RESUMO FINAL ===");

        System.out.println("Total de missões cadastradas: " + missoes.size());

        int pendente = 0;
        int andamento = 0;
        int concluida = 0;
        int cancelada = 0;

        // Procura a missão com maior prioridade
        MissaoEspacial maiorPrioridade = null;

        for (MissaoEspacial m : missoes) {

            if (m.getStatus().equalsIgnoreCase("PENDENTE")) {
                pendente++;
            } else if (m.getStatus().equalsIgnoreCase("EM ANDAMENTO")) {
                andamento++;
            } else if (m.getStatus().equalsIgnoreCase("CONCLUÍDA")) {
                concluida++;
            } else if (m.getStatus().equalsIgnoreCase("CANCELADA")) {
                cancelada++;
            }

            if (maiorPrioridade == null
                    || m.getPrioridade() > maiorPrioridade.getPrioridade()) {

                maiorPrioridade = m;
            }
        }

        System.out.println("PENDENTE: " + pendente);
        System.out.println("EM ANDAMENTO: " + andamento);
        System.out.println("CONCLUÍDA: " + concluida);
        System.out.println("CANCELADA: " + cancelada);

        if (maiorPrioridade != null) {

            System.out.println("\nMissão com maior prioridade:");

            System.out.println("Nome: " + maiorPrioridade.getNome());
            System.out.println("Prioridade: " + maiorPrioridade.getPrioridade());
        }
    }
}