package banco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

    private String nome;
    private ArrayList<ContaBancaria> contas;
    private ArrayList<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionar(ContaBancaria novaConta) {
        if (novaConta.getNumero() == 0) {
            System.out.println("Erro: conta tem que ter um número!");
        } else {
            this.contas.add(novaConta);
        }
    }

    public void adicionarCliente(Cliente cliente) {
        if ( clientes.stream().anyMatch(client -> client.getCod() == cliente.getCod())) {
            System.out.println("Erro: conta tem que ter um número!");
        } else {
            this.clientes.add(cliente);
        }
    }

    public ContaBancaria getConta(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public List<String[]> getAllContas() {
        return contas.stream().map(ContaBancaria::getArrayStringConta).collect(Collectors.toList());
    }
    
    public List<String[]> getAllClientes() {
        return clientes.stream().map(Cliente::getArrayStringCliente).collect(Collectors.toList());
    }
   
    public ContaBancaria getContaMaiorSaldo() {
        return contas.stream().max(Comparator.comparing(conta -> conta.getSaldo())).get();
    }

    public ContaBancaria getContaMenorSaldo() {
        return contas.stream().min(Comparator.comparing(conta -> conta.getSaldo())).get();
    }

    public double GetMediaContas() {
        return contas.stream().mapToDouble(ContaBancaria::getSaldo).sum() / contas.size();
    }

    public double GetMediaContasCorrente() {
        long size = contas.stream().filter(ContaBancaria -> ContaBancaria.getClass().equals(ContaCorrente.class)).count();
        return contas.stream()
                .filter(contaBancaria -> contaBancaria.getClass().equals(ContaCorrente.class))
                .mapToDouble(ContaBancaria::getSaldo)
                .sum() / size;
    }

    public double GetMediaContasPoupanca() {
        long size = contas.stream().filter(ContaPoupanca -> ContaPoupanca.getClass().equals(ContaPoupanca.class)).count();
        return contas.stream()
                .filter(contaBancaria -> contaBancaria.getClass().equals(ContaPoupanca.class))
                .mapToDouble(ContaBancaria::getSaldo)
                .sum() / size;
    }

    public void listarContas() {
        System.out.println("Banco: " + this.nome);
        System.out.println("Lista de contas...");
        for (ContaBancaria conta : contas) {
            System.out.println(conta.getInformacoes());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
