package controle;

import banco.Banco;
import util.DataProvider;

/**
 *
 * @author Cássio Ritse
 */
public class main {

    private static controleBanco Inicio; 
            
    public static void main(String[] args) {
        Banco BancoAtual = new DataProvider().criarBanco("Banco BlackBerry");
        Inicio = new controleBanco(BancoAtual);
    }
}
