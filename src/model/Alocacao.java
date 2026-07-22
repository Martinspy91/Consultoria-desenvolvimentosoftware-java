// Define que esta classe pertence ao pacote "model"
package model;

// Importa a classe BufferedReader para leitura de arquivos TXT
import java.io.BufferedReader;

// Importa a classe FileReader para abrir arquivos para leitura
import java.io.FileReader;

// Importa a classe FileWriter para escrever em arquivos
import java.io.FileWriter;

// Importa a classe PrintWriter para facilitar a escrita no arquivo
import java.io.PrintWriter;

// Importa a classe ArrayList para criar listas dinâmicas
import java.util.ArrayList;

// Importa a interface List
import java.util.List;

/**
 * Classe que representa a Alocação de um Colaborador em um Projeto.
 * Atributos privados com getters/setters.
 * Responsável pela persistência em TXT (salvarTXT / lerTodos).
 */

// Declaração da classe Alocacao
public class Alocacao {

    // Constante que guarda o nome do arquivo TXT
    private static final String ARQUIVO = "alocacoes.txt";

    // ── Atributos privados (objetos das outras classes) ────

    // Objeto da classe Colaborador
    private Colaborador colaborador;

    // Objeto da classe Projeto
    private Projeto projeto;

    // String que guarda a função do colaborador no projeto
    private String funcao;

    // String que guarda as horas trabalhadas
    private String horas;

    // ── Construtor ─────────────────────────────────────────

    // Construtor da classe Alocacao
    public Alocacao(Colaborador colaborador, Projeto projeto, String funcao, String horas) {

        // Recebe o colaborador e salva no atributo da classe
        this.colaborador = colaborador;

        // Recebe o projeto e salva no atributo da classe
        this.projeto = projeto;

        // Recebe a função e salva no atributo da classe
        this.funcao = funcao;

        // Recebe as horas e salva no atributo da classe
        this.horas = horas;
    }

    // ── Getters e Setters ──────────────────────────────────

    // Retorna o colaborador
    public Colaborador getColaborador() {
        return colaborador;
    }

    // Define um novo colaborador
    public void setColaborador(Colaborador c) {
        this.colaborador = c;
    }

    // Retorna o projeto
    public Projeto getProjeto() {
        return projeto;
    }

    // Define um novo projeto
    public void setProjeto(Projeto p) {
        this.projeto = p;
    }

    // Retorna a função
    public String getFuncao() {
        return funcao;
    }

    // Define uma nova função
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    // Retorna as horas
    public String getHoras() {
        return horas;
    }

    // Define novas horas
    public void setHoras(String horas) {
        this.horas = horas;
    }

    // ── Persistência TXT ───────────────────────────────────

    /**
     * Salva este objeto no TXT (append — não apaga registros anteriores).
     */

    // Método responsável por salvar os dados no arquivo TXT
    public void salvarTXT() throws Exception {

        // Cria um FileWriter em modo append (true = não apagar conteúdo antigo)
        FileWriter fw = new FileWriter(ARQUIVO, true);

        // Cria um PrintWriter para escrever no arquivo
        PrintWriter pw = new PrintWriter(fw);

        // Escreve o nome do colaborador no arquivo
        pw.println("Colaborador: " + colaborador.getNome());

        // Escreve o nome do projeto no arquivo
        pw.println("Projeto: " + projeto.getNomeProjeto());

        // Escreve a função no arquivo
        pw.println("Funcao: " + funcao);

        // Escreve as horas no arquivo
        pw.println("Horas: " + horas);

        // Linha separadora entre registros
        pw.println("---");

        // Fecha o PrintWriter
        pw.close();

        // Fecha o FileWriter
        fw.close();
    }

    /**
     * Lê todas as alocações do TXT e retorna uma lista de objetos Alocacao.
     */

    // Método estático que lê todas as alocações salvas
    public static List<Alocacao> lerTodos() {

        // Cria uma lista vazia de Alocacao
        List<Alocacao> lista = new ArrayList<>();

        try {

            // Abre o arquivo para leitura
            BufferedReader br = new BufferedReader(new FileReader(ARQUIVO));

            // Variável usada para guardar cada linha lida
            String linha;

            // Variáveis auxiliares para armazenar os dados temporariamente
            String nomeColaborador = "", nomeProjeto = "", funcao = "", horas = "";

            // Enquanto existir linha no arquivo
            while ((linha = br.readLine()) != null) {

                // Verifica se a linha começa com "Colaborador: "
                if (linha.startsWith("Colaborador: "))

                    // Remove o texto "Colaborador: " e guarda apenas o nome
                    nomeColaborador = linha.replace("Colaborador: ", "").trim();

                // Verifica se a linha começa com "Projeto: "
                else if (linha.startsWith("Projeto: "))

                    // Remove o texto "Projeto: " e guarda apenas o nome
                    nomeProjeto = linha.replace("Projeto: ", "").trim();

                // Verifica se a linha começa com "Funcao: "
                else if (linha.startsWith("Funcao: "))

                    // Remove o texto "Funcao: " e guarda apenas a função
                    funcao = linha.replace("Funcao: ", "").trim();

                // Verifica se a linha começa com "Horas: "
                else if (linha.startsWith("Horas: "))

                    // Remove o texto "Horas: " e guarda apenas as horas
                    horas = linha.replace("Horas: ", "").trim();

                // Verifica se chegou no final de um registro
                else if (linha.equals("---")) {

                    // Cria um objeto Colaborador com os dados lidos
                    Colaborador c = new Colaborador(nomeColaborador, "", 0, "");

                    // Cria um objeto Projeto com os dados lidos
                    Projeto p = new Projeto(nomeProjeto, "");

                    // Cria uma nova Alocacao e adiciona na lista
                    lista.add(new Alocacao(c, p, funcao, horas));
                }
            }

            // Fecha o BufferedReader
            br.close();

        } catch (Exception e) {

            // Caso o arquivo ainda não exista, não faz nada
            // Isso é normal na primeira execução do sistema
        }

        // Retorna a lista com todas as alocações
        return lista;
    }
}
