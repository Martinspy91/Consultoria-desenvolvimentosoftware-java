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
 * Classe que representa um Colaborador.
 * Atributos privados com getters/setters.
 * Responsável pela persistência em TXT (salvarTXT / lerTodos).
 */

// Criação da classe Colaborador
public class Colaborador {

    // Constante que guarda o nome do arquivo TXT
    // static = pertence à classe
    // final = não pode ser alterado
    private static final String ARQUIVO = "colaboradores.txt";

    // ── Atributos privados ──────────────────────────────────

    // Guarda o nome do colaborador
    private String nome;

    // Guarda o cargo do colaborador
    private String cargo;

    // Guarda o salário do colaborador
    private double salario;

    // Guarda o email do colaborador
    private String email;

    // ── Construtor ─────────────────────────────────────────

    // Construtor da classe
    // É executado quando criamos um objeto Colaborador
    public Colaborador(String nome, String cargo, double salario, String email) {

        // Salva o nome recebido no atributo nome
        this.nome = nome;

        // Salva o cargo recebido no atributo cargo
        this.cargo = cargo;

        // Salva o salário recebido no atributo salario
        this.salario = salario;

        // Salva o email recebido no atributo email
        this.email = email;
    }

    // ── Getters e Setters ──────────────────────────────────

    // Método GET
    // Retorna o nome do colaborador
    public String getNome() {
        return nome;
    }

    // Método SET
    // Altera o nome do colaborador
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método GET
    // Retorna o cargo do colaborador
    public String getCargo() {
        return cargo;
    }

    // Método SET
    // Altera o cargo do colaborador
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método GET
    // Retorna o salário do colaborador
    public double getSalario() {
        return salario;
    }

    // Método SET
    // Altera o salário do colaborador
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método GET
    // Retorna o email do colaborador
    public String getEmail() {
        return email;
    }

    // Método SET
    // Altera o email do colaborador
    public void setEmail(String email) {
        this.email = email;
    }

    // @Override indica que estamos sobrescrevendo
    // um método da classe Object
    @Override

    // Método toString()
    // Define o que será mostrado quando o objeto for exibido
    public String toString() {

        // Retorna o nome do colaborador
        return nome;
    }

    // ── Persistência TXT ───────────────────────────────────

    /**
     * Salva este objeto no TXT.
     * append = true significa que os dados antigos não serão apagados.
     */

    // Método responsável por salvar os dados no arquivo TXT
    public void salvarTXT() throws Exception {

        // Cria um FileWriter para escrever no arquivo
        // true = adiciona informações sem apagar o conteúdo anterior
        FileWriter fw = new FileWriter(ARQUIVO, true);

        // Cria um PrintWriter para facilitar a escrita
        PrintWriter pw = new PrintWriter(fw);

        // Escreve o nome no arquivo
        pw.println("Nome: " + nome);

        // Escreve o cargo no arquivo
        pw.println("Cargo: " + cargo);

        // Escreve o salário no arquivo
        pw.println("Salario: " + salario);

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
     * Lê todos os colaboradores do TXT
     * e retorna uma lista de objetos Colaborador.
     */

    // Método static
    // Pode ser usado sem criar objeto
    public static List<Colaborador> lerTodos() {

        // Cria uma lista vazia de colaboradores
        List<Colaborador> lista = new ArrayList<>();

        try {

            // Abre o arquivo para leitura
            BufferedReader br = new BufferedReader(new FileReader(ARQUIVO));

            // Variável que guardará cada linha lida
            String linha;

            // Variáveis temporárias para armazenar os dados
            String nome = "";
            String cargo = "";
            String email = "";

            // Variável para armazenar o salário
            double salario = 0;

            // Enquanto existir linha no arquivo
            while ((linha = br.readLine()) != null) {

                // Verifica se a linha começa com "Nome: "
                if (linha.startsWith("Nome: "))

                    // Remove "Nome: " e pega apenas o nome
                    nome = linha.replace("Nome: ", "").trim();

                // Verifica se a linha começa com "Cargo: "
                else if (linha.startsWith("Cargo: "))

                    // Remove "Cargo: "
                    cargo = linha.replace("Cargo: ", "").trim();

                // Verifica se a linha começa com "Salario: "
                else if (linha.startsWith("Salario: "))

                    // Remove "Salario: "
                    // e converte o texto para double
                    salario = Double.parseDouble(
                            linha.replace("Salario: ", "").trim()
                    );

                // Verifica se a linha começa com "Email: "
                else if (linha.startsWith("Email: "))

                    // Remove "Email: "
                    email = linha.replace("Email: ", "").trim();

                // Verifica se encontrou o separador ---
                else if (linha.equals("---"))

                    // Cria um novo objeto Colaborador
                    // e adiciona na lista
                    lista.add(new Colaborador(nome, cargo, salario, email));
            }

            // Fecha o BufferedReader
            br.close();

        } catch (Exception e) {

            // Caso o arquivo não exista ainda,
            // o sistema apenas ignora o erro
        }

        // Retorna a lista com todos os colaboradores
        return lista;
    }
}
