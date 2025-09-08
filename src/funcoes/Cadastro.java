package funcoes;

import javax.swing.JOptionPane;
import objetos.Cliente;
import objetos.Conta;
import objetos.ContaCorrente;
import objetos.ContaPoupanca;
import telas.Janela;

public class Cadastro {
    private Janela janela;

    public Cadastro(Janela janela) {
        this.janela = janela;
    }

    public void consultar() {
        System.out.println("Botão 'Consultar' pressionado. Atualizando...");
        janela.getJbAtualizar().setEnabled(true);
        JOptionPane.showMessageDialog(janela, "Consulta realizada! Atualize seus dados.", "Consulta",
                JOptionPane.INFORMATION_MESSAGE);

    }

    public void atualizar() {
        System.out.println("Botão 'atualizar' pressionado. Coletando dados...");

        Cliente cliente = new Cliente(
                janela.getJtfNome().getText(),
                janela.getJtfEndereco().getText(),
                janela.getJtfTelefone().getText(),
                janela.getJtfCpf().getText());

        Conta conta = null;
        String agencia = janela.getJtfAgencia().getText();
        String numeroConta = janela.getJtfConta().getText();

        if (janela.getJrbCorrente().isSelected()) {
            conta = new ContaCorrente(agencia, numeroConta);
            System.out.println("Criando uma Conta Corrente.");
        } else if (janela.getJrbPoupanca().isSelected()) {
            conta = new ContaPoupanca(agencia, numeroConta);
            System.out.println("Criando uma conta Poupança");
        }

        if (conta != null) {
            gravar(cliente, conta);
        } else {
            System.err.println("Nenhum tipo de conta selecionado!");
            JOptionPane.showMessageDialog(janela, "Por favor, selecione um tipo de conta.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void gravar(Cliente cliente, Conta conta) {
        String dados = "--- DADOS ATUALIZADOS ---\n\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "CPF: " + cliente.getCpf() + "\n" +
                "Endereço: " + cliente.getEndereco() + "\n" +
                "Telefone: " + cliente.getTelefone() + "\n" +
                "Agência: " + conta.getAgencia() + "\n" +
                "Conta: " + conta.getNumero() + "\n" +
                "Tipo: " + (conta instanceof ContaCorrente ? "Conta Corrente" : "Conta Poupança") + "\n" +
                "Saldo Inicial: R$ " + conta.getSaldo();

        System.out.println(dados);
        JOptionPane.showMessageDialog(janela,
                "Dados Atualizados com sucesso!\n (Verifique o console para mais detalhes)", "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void fechar() {
        System.out.println("Botão 'Fechar' pressionado. Fechando aplicação...");
        System.exit(0);
    }
}
