package Interface;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.PanelSubMenu;

public class subMenu extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int larguraTela;
	int alturaTela;
	JFrame janela;
	CardLayout cardLayout2;
	public subMenu(int larguraTela,int alturaTela,JFrame janela) {
		this.alturaTela = alturaTela;
		this.larguraTela = larguraTela;
		this.janela = janela;
				
	}
	public void iniciar() {
		
		cardLayout2 = new CardLayout();
		this.setLayout(cardLayout2);
		
		inrtefaceOne jogo = new inrtefaceOne(larguraTela,alturaTela,this);
		PanelSubMenu menu = new PanelSubMenu(0,0,larguraTela,alturaTela,"#ECE9E9",this);
		
		this.add(jogo,"JOGO");
		this.add(menu,"MENU");
		this.setBounds(0, 0, larguraTela, alturaTela);
		
		
		/*JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(getImage("lol.jpg"));
        lblNewLabel.setBounds(35, 29, 61, 53);
        
        add(lblNewLabel);*/
		
		cardLayout2.show(this, "MENU");
		janela.add(this,"MENU");
	}
	
	/*private ImageIcon getImage(String imagem) {
        return new ImageIcon(getClass().getResource("trbalhoPOO2/src/main/java/img/"+imagem));
	}*/
}
