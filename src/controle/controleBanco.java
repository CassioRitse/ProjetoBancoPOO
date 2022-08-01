/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import view.CaixaBancoView;
import banco.Banco;
import banco.ContaBancaria;
import banco.ContaCorrente;

/**
 *
 * @author Cássio Ritse
 */
public class controleBanco {
    private static CaixaBancoView BancoView;
    private static Banco InstanciaBanco;
    private List<String[]> contasBanco;
    private List<String[]> clientesBanco;
    private boolean listaClientes = true;

    public controleBanco(Banco insBanco) {
        this.InstanciaBanco = insBanco;
        this.clientesBanco = InstanciaBanco.getAllClientes();
        this.contasBanco = InstanciaBanco.getAllContas();

        BancoView = new CaixaBancoView();
        BancoView.setNomeBanco(InstanciaBanco.getNome());

        BancoView.getBtnSaldoMedio().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSaldoMedio();
            }
        });

        BancoView.getBtnMaiorSaldo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnMaiorSaldo();
            }
        });

        BancoView.getBtnMenorSaldo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnMenorSaldo();
            }
        });

        BancoView.getBtnMediaCCorrente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnMediaCCorrente();
            }
        });

        BancoView.getBtnMediaCPoupaca().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnMediaCPoupaca();
            }
        });

        BancoView.getBtnCard().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCard();
            }
        });

        BancoView.getLblNomeBanco().addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                voltarIndex();
            }
        });

        listarClientes();
        listarContas();

        BancoView.setVisible(true);

    }

    protected void btnSaldoMedio() {
        JOptionPane.showMessageDialog(null, "Média do Saldo de Todas as Contas: " + InstanciaBanco.GetMediaContas(), InstanciaBanco.getNome(), JOptionPane.PLAIN_MESSAGE, BancoView.getIconBanco());
    }

    protected void btnMaiorSaldo() {
        ContaBancaria CMS = InstanciaBanco.getContaMaiorSaldo();
        JOptionPane.showMessageDialog(null, CMS.getInformacoes(), InstanciaBanco.getNome(), JOptionPane.PLAIN_MESSAGE, BancoView.getIconBanco());
    }

    protected void btnMenorSaldo() {
        ContaBancaria CMS = InstanciaBanco.getContaMenorSaldo();
        JOptionPane.showMessageDialog(null, CMS.getInformacoes(), InstanciaBanco.getNome(), JOptionPane.PLAIN_MESSAGE, BancoView.getIconBanco());
    }

    protected void btnMediaCCorrente() {
        double mediaCCorrente = InstanciaBanco.GetMediaContasCorrente();
        JOptionPane.showMessageDialog(null, "Média do Saldo de Todas as Contas: " + mediaCCorrente, InstanciaBanco.getNome(), JOptionPane.PLAIN_MESSAGE, BancoView.getIconBanco());
    }

    protected void btnMediaCPoupaca() {
        double mediaCPopuca = InstanciaBanco.GetMediaContasPoupanca();
        JOptionPane.showMessageDialog(null, "Média do Saldo de Todas as Contas: " + mediaCPopuca, InstanciaBanco.getNome(), JOptionPane.PLAIN_MESSAGE, BancoView.getIconBanco());
    }

    protected void btnCard() {
        CardLayout cards = (CardLayout) BancoView.getMainCard().getLayout();
        
        if (listaClientes) {
            cards.show(BancoView.getMainCard(), "clientes");
            BancoView.getBtnCard().setText("Contas");
        } else {
            cards.show(BancoView.getMainCard(), "contas");
            BancoView.getBtnCard().setText("Clientes");
        }
        listaClientes = !listaClientes;

    }
    
    private void voltarIndex(){
        CardLayout cards = (CardLayout) BancoView.getMainCard().getLayout();
        cards.show(BancoView.getMainCard(), "index");
    }
    
    private void listarClientes() {
        DefaultTableModel tabelaClientes = (DefaultTableModel) BancoView.getTblClientes().getModel();
        clientesBanco.stream().forEach(client -> tabelaClientes.addRow(client));
    }

    private void listarContas() {
        DefaultTableModel tabelaContas = (DefaultTableModel) BancoView.getTblContas().getModel();
        contasBanco.stream().forEach(conta -> tabelaContas.addRow(conta));
    }

}
