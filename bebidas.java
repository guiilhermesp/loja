import javax.swing.JOptionPane;
public class bebidas {
    public static void main (String[] args) {

        for (int j = 0; j < 5; j++) {

            String sugestao, escolha, decicao;
            int vodka, cachaca, whisky, tequila, agua, gin, pvodka, pcachaca, pwhisky, ptequila, pagua, pgin, preco;
            vodka = 0;
            cachaca = 0;
            whisky = 0;
            tequila = 0;
            agua = 0;
            gin = 0;

            sugestao = JOptionPane.showInputDialog("Gostaria de saber a sugest�o da casa? sim/nao");
            
            char sugestaochar = sugestao.charAt(0);

            if (sugestaochar == 's') {
                JOptionPane.showMessageDialog(null, "social com amigos -> vodka, gin, tequila \n" +
                "churrasco -> vodka e cacha�a \n" +
                "degusta��o -> whisky e tequila" );
            };

            for (int i = 0; i < 6; i++) {
            
            escolha = JOptionPane.showInputDialog("Temos vodka (12 reais) \n cacha�a (15 reais) \n whisky (50 reais) \n tequila (45 reais) \n �gua (5) \n gin (15 reais). \n o que voc� deseja?");
            
            char escolhachar = escolha.charAt(0);

                switch (escolhachar) {
                    case 'v':
                        vodka = Integer.parseInt(JOptionPane.showInputDialog("Quantas vodkas voc� vai querer?"));
                        break;
                    case 'c':
                        cachaca = Integer.parseInt(JOptionPane.showInputDialog("Quantas cacha�as voc� vai querer?"));
                        break;
                    case 'w':
                        whisky = Integer.parseInt(JOptionPane.showInputDialog("Quantos whiskys voc� vai querer?"));
                        break;
                    case 't':
                        tequila = Integer.parseInt(JOptionPane.showInputDialog("Quantas tequilas voc� vai querer?"));
                        break;
                    case 'a':
                        agua = Integer.parseInt(JOptionPane.showInputDialog("Quantas �guas voc� vai querer?"));
                        break;
                    case 'g':
                        gin = Integer.parseInt(JOptionPane.showInputDialog("Quantas gin voc� vai querer?"));
                        break;
                };
                if (vodka > 7) {
                    JOptionPane.showMessageDialog(null, "n�o temos essa quantidade dispon�vel em estoque, temos 7 vodkas a venda.");
                    vodka = Integer.parseInt(JOptionPane.showInputDialog("Quantas voce vai querer?"));
                };
                if (cachaca > 15) {
                    JOptionPane.showMessageDialog(null, "n�o temos essa quantidade dispon�vel em estoque, temos 15 cacha�as a venda.");
                    cachaca = Integer.parseInt(JOptionPane.showInputDialog("Quantas voce vai querer?"));
                };
                if (whisky > 19) {
                    JOptionPane.showMessageDialog(null, "n�o temos essa quantidade dispon�vel em estoque, temos 9 whiskys a venda.");
                    whisky = Integer.parseInt(JOptionPane.showInputDialog("Quantas voce vai querer?"));
                };
                if (tequila > 12) {
                    JOptionPane.showMessageDialog(null, "n�o temos essa quantidade dispon�vel em estoque, temos 12 tequilas a venda.");
                    tequila = Integer.parseInt(JOptionPane.showInputDialog("Quantas voce vai querer?"));
                };
                if (agua > 25) {
                    JOptionPane.showMessageDialog(null, "n�o temos essa quantidade dispon�vel em estoque, temos 25 �guas a venda.");
                    agua = Integer.parseInt(JOptionPane.showInputDialog("Quantas voce vai querer?"));
                };
                if (gin > 16) {
                    JOptionPane.showMessageDialog(null, "n�o temos essa quantidade dispon�vvel em estoque, temos 16 gins a venda.");
                    gin = Integer.parseInt(JOptionPane.showInputDialog("Quantas voce vai querer?"));
                };
            };

            pvodka = vodka * 12;
            pcachaca = cachaca * 15;
            pwhisky = whisky * 50;
            ptequila = tequila * 45;
            pagua = agua * 5;
            pgin = gin * 15;
            preco = (pvodka) + (pcachaca) + (pwhisky) + (ptequila) + (pagua) + (pgin);

            decicao = JOptionPane.showInputDialog("� tudo que desejas? sim/nao");

            char decicaochar = decicao.charAt(0);

            if ( decicaochar == 's') {
                JOptionPane.showMessageDialog(null, "O valor total da sua compra �: " + preco);
            } else {
                JOptionPane.showMessageDialog(null, "Pe�o perd�o pela nossa equipe por n�o conseguirmos lhe atender da forma desejada, caso queira voltar em breve, ser� bem vindo.");
            };
        };
    };
};