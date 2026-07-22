package model; // Define que esta classe pertence ao pacote "model"

// Importa a classe BufferedReader
// Usada para ler arquivos linha por linha
import java.io.BufferedReader;

// Importa a classe FileReader
// Usada para abrir arquivos para leitura
import java.io.FileReader;

// Importa a classe FileWriter
// Usada para escrever em arquivos
import java.io.FileWriter;

// Importa a classe PrintWriter
// Facilita a escrita de texto no arquivo
import java.io.PrintWriter;

// Importa a classe ArrayList
// Usada para criar listas dinâmicas
import java.util.ArrayList;

// Importa a interface List
// Serve para trabalhar com listas
import java.util.List;

/**
 * Classe que representa um Projeto.
 * Atributos privados com getters/setters.
 * Responsável pela persistência em TXT (salvarTXT / lerTodos).
 */

// Criação da classe Projeto
public class Projeto {

    // Constante que guarda o nome do arquivo TXT
    // static = pertence à classe
    // final = não pode ser alterado
    private static final String ARQUIVO = "projetos.txt";

    // ── Atributos privados ──────────────────────────────────

    // Guarda o nome do projeto
    private String nomeProjeto;

    // Guarda o nome do cliente relacionado ao projeto
    private String nomeCliente;

    // ── Construtor ─────────────────────────────────────────

    // Construtor da classe
    // Executado quando um objeto Projeto é criado
    public Projeto(String nomeProjeto, String nomeCliente) {

        // Salva o nome do projeto recebido
        this.nomeProjeto = nomeProjeto;

        // Salva o nome do cliente recebido
        this.nomeCliente = nomeCliente;
    }

    // ── Getters e Setters ──────────────────────────────────

    // Método GET
    // Retorna o nome do projeto
    public String getNomeProjeto() {
        return nomeProjeto;
    }

    // Método SET
    // Altera o nome do projeto
    public void setNomeProjeto(String nome) {
        this.nomeProjeto = nome;
    }

    // Método GET
    // Retorna o nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Método SET
    // Altera o nome do cliente
    public void setNomeCliente(String cliente) {
        this.nomeCliente = cliente;
    }

    // @Override indica que estamos sobrescrevendo
    // um método da classe Object
    @Override

    // Método toString()
    // Define o que será mostrado quando o objeto aparecer
    public String toString() {

        // Retorna o nome do projeto
        return nomeProjeto;
    }

    // ── Persistência TXT ───────────────────────────────────

    /**
     * Salva este objeto no TXT.
     * append = true significa que não apaga os registros anteriores.
     */

    // Método responsável por salvar os dados no arquivo TXT
    public void salvarTXT() throws Exception {

        // Cria um FileWriter para escrever no arquivo
        // true = adiciona dados sem apagar os anteriores
        FileWriter fw = new FileWriter(ARQUIVO, true);

        // Cria um PrintWriter para facilitar a escrita
        PrintWriter pw = new PrintWriter(fw);

        // Escreve o nome do projeto no arquivo
        pw.println("Projeto: " + nomeProjeto);

        // Escreve o nome do cliente no arquivo
        pw.println("Cliente: " + nomeCliente);

        // Linha separadora entre registros
        pw.println("---");

        // Fecha o PrintWriter
        pw.close();

        // Fecha o FileWriter
        fw.close();
    }

    /**
     * Lê todos os projetos do TXT
     * e retorna uma lista de objetos Projeto.
     */

    // Método static
    // Pode ser usado sem criar objeto
    public static List<Projeto> lerTodos() {

        // Cria uma lista vazia de projetos
        List<Projeto> lista = new ArrayList<>();

        try {

            // Abre o arquivo para leitura
            BufferedReader br = new BufferedReader(new FileReader(ARQUIVO));

            // Variável que armazenará cada linha lida
            String linha;

            // Variáveis temporárias para guardar os dados
            String nomeProjeto = "";
            String nomeCliente = "";

            // Enquanto existir linha no arquivo
            while ((linha = br.readLine()) != null) {

                // Verifica se a linha começa com "Projeto: "
                if (linha.startsWith("Projeto: "))

                    // Remove "Projeto: " e pega apenas o nome
                    nomeProjeto = linha.replace("Projeto: ", "").trim();

                // Verifica se a linha começa com "Cliente: "
                else if (linha.startsWith("Cliente: "))

                    // Remove "Cliente: "
                    nomeCliente = linha.replace("Cliente: ", "").trim();

                // Verifica se encontrou o separador ---
                else if (linha.equals("---"))

                    // Cria um novo objeto Projeto
                    // e adiciona na lista
                    lista.add(new Projeto(nomeProjeto, nomeCliente));
            }

            // Fecha o BufferedReader
            br.close();

        } catch (Exception e) {

            // Caso o arquivo ainda não exista,
            // o sistema apenas ignora o erro
        }

        // Retorna a lista com todos os projetos
        return lista;
    }
}
