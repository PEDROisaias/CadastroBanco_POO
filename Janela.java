
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Janela extends JFrame {
    public Janela() {
        super("Java Swing - Desenvolvimento de Sistemas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 255);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);

        // private void centralizar() {
        // Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // Dimension janela = getSize();
        // if (janela.height > screen.height)
        // setSize(janela.width, screen.height);
        // if (janela.width > screen.width)
        // setSize(screen.width, janela.height);
        // setLocation((screen.width - janela.width) / 2,
        // (screen.height - janela.height) /2);
        // }

        // Agencia
        JLabel jlAgencia = new JLabel();
        jlAgencia.setText("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        JTextField jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtfAgencia);

        // Conta
        JLabel jlConta = new JLabel();
        jlConta.setText("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta)

        JTextField jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtfConta);

        // Separador
        JSeparator jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // Dados Clientes
        JLabel jlNome = new JLabel();
        jlNome.setText("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        JTextField jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        JLabel jlEndereco = new JLabel();
        jlEndereco.setText("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        JTextField jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        JLabel jlTelefone = new JLabel();
        jlTelefone.setText("Telefone");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);

        JTextField jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        getContentPane().add(jtfTelefone);

        JLabel jlCpf = new JLabel();
        jlCpf.setText("CPF");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);

        JTextField jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        getContentPane().add(jtfCpf);

        JRadioButton jrbCorrente = new JRadioButton();
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setSelected(false);
        getContentPane().add(jrbCorrente);

        JRadioButton jrbPoupanca = new JRadioButton();
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setSelected(false);
        getContentPane().add(jrbCorrente);

        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // Separador dos dados do cliente dos botoes da janela
        JSeparator jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // Botoes de Acao da janela
        JButton jbConsultar = new JButton();
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic("S");
        getContentPane().add(jbConsultar);

        JButton jbAtualizar = new JButton();
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic("A");
        jbAtualizar.setEnabled(false);
        getContentPane().add(jbAtualizar);

        JButton jbFechar = new JButton();
        jbFechar.setBounds(225, 190, 100, 23);
        jbAtualizar.setMnemonic("F");
        getContentPane().add(jbAtualizar);

        
    }

    public static void main(String args[]) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}