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
// Serve para trabalhar com listas de objetos
import java.util.List;

/**
 * Classe que representa um Cliente.
 * Atributos privados com getters/setters.
 * Responsável pela persistência em TXT (salvarTXT / lerTodos).
 */

// Criação da classe Cliente
public class Cliente {

    // Constante que guarda o nome do arquivo TXT
    // static = pertence à classe
    // final = valor não pode ser alterado
    private static final String ARQUIVO = "clientes.txt";

    // ── Atributos privados ──────────────────────────────────

    // Guarda o nome do cliente
    private String nome;

    // Guarda o nome da empresa
    private String empresa;

    // Guarda o telefone do cliente
    private String telefone;

    // Guarda o email do cliente
    private String email;

    // ── Construtor ─────────────────────────────────────────

    // Construtor da classe
    // É executado quando um objeto Cliente é criado
    public Cliente(String nome, String empresa, String telefone, String email) {

        // this.nome representa o atributo da classe
        // nome representa o valor recebido no parâmetro
        this.nome = nome;

        // Salva a empresa recebida
        this.empresa = empresa;

        // Salva o telefone recebido
        this.telefone = telefone;

        // Salva o email recebido
        this.email = email;
    }

    // ── Getters e Setters ──────────────────────────────────

    // Método GET
    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método SET
    // Altera o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método GET
    // Retorna a empresa do cliente
    public String getEmpresa() {
        return empresa;
    }

    // Método SET
    // Altera a empresa do cliente
    public void setEmpresa(String e) {
        this.empresa = e;
    }

    // Método GET
    // Retorna o telefone do cliente
    public String getTelefone() {
        return telefone;
    }

    // Método SET
    // Altera o telefone do cliente
    public void setTelefone(String t) {
        this.telefone = t;
    }

    // Método GET
    // Retorna o email do cliente
    public String getEmail() {
        return email;
    }

    // Método SET
    // Altera o email do cliente
    public void setEmail(String email) {
        this.email = email;
    }

    // @Override indica que estamos sobrescrevendo
    // um método da classe Object
    @Override

    // Método toString()
    // Define o que será mostrado quando o objeto for exibido
    public String toString() {

        // Retorna o nome do cliente
        return nome;
    }

    // ── Persistência TXT ───────────────────────────────────

    /**
     * Salva este objeto no TXT
     * append = true significa que NÃO apaga os dados anteriores
     */

    // Método responsável por salvar os dados no arquivo TXT
    public void salvarTXT() throws Exception {

        // Cria um FileWriter para escrever no arquivo
        // true = adiciona informações sem apagar as antigas
        FileWriter fw = new FileWriter(ARQUIVO, true);

        // Cria um PrintWriter para facilitar a escrita
        PrintWriter pw = new PrintWriter(fw);

        // Escreve o nome no arquivo
        pw.println("Nome: " + nome);

        // Escreve a empresa no arquivo
        pw.println("Empresa: " + empresa);

        // Escreve o telefone no arquivo
        pw.println("Telefone: " + telefone);

        // Escreve o email no arquivo
        pw.println("Email: " + email);

        // Linha separadora entre registros
        pw.println("---");

        // Fecha o PrintWriter
        pw.close();

        // Fecha o FileWriter
        fw.close();
    }

    /**
     * Lê todos os clientes do TXT
     * e retorna uma lista de objetos Cliente.
     */

    // Método static
    // Pode ser chamado sem criar objeto
    public static List<Cliente> lerTodos() {

        // Cria uma lista vazia de clientes
        List<Cliente> lista = new ArrayList<>();

        try {

            // Abre o arquivo para leitura
            BufferedReader br = new BufferedReader(new FileReader(ARQUIVO));

            // Variável que vai guardar cada linha lida
            String linha;

            // Variáveis temporárias para armazenar os dados
            String nome = "";
            String empresa = "";
            String telefone = "";
            String email = "";

            // Enquanto existir linha no arquivo
            while ((linha = br.readLine()) != null) {

                // Verifica se a linha começa com "Nome: "
                if (linha.startsWith("Nome: "))

                    // Remove o texto "Nome: " e guarda somente o nome
                    nome = linha.replace("Nome: ", "").trim();

                // Verifica se a linha começa com "Empresa: "
                else if (linha.startsWith("Empresa: "))

                    // Remove "Empresa: "
                    empresa = linha.replace("Empresa: ", "").trim();

                // Verifica se a linha começa com "Telefone: "
                else if (linha.startsWith("Telefone: "))

                    // Remove "Telefone: "
                    telefone = linha.replace("Telefone: ", "").trim();

                // Verifica se a linha começa com "Email: "
                else if (linha.startsWith("Email: "))

                    // Remove "Email: "
                    email = linha.replace("Email: ", "").trim();

                // Verifica se encontrou o separador ---
                else if (linha.equals("---"))

                    // Cria um novo objeto Cliente
                    // e adiciona na lista
                    lista.add(new Cliente(nome, empresa, telefone, email));
            }

            // Fecha o BufferedReader
            br.close();

        } catch (Exception e) {

            // Caso o arquivo ainda não exista,
            // o programa simplesmente ignora o erro
        }

        // Retorna a lista com todos os clientes
        return lista;
    }
}