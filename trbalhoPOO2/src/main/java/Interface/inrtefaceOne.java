package Interface;


import java.awt.CardLayout;

import javax.swing.JPanel;

import apis.getChampion;

public class inrtefaceOne extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int larguraTela;
	int alturaTela;
	JPanel janela;
	CardLayout cardLayout;
	public inrtefaceOne(int larguraTela,int alturaTela,JPanel janela) {
		this.alturaTela = alturaTela;
		this.larguraTela = larguraTela;
		this.janela = janela;
		iniciar();
				
	}
	public void iniciar() {
		cardLayout = new CardLayout();
		this.setLayout(cardLayout);
		
		Menu menuPrincipal = new Menu(0,0,larguraTela,alturaTela,"#ECE9E9",this,janela);
		getChampion plano1 = new getChampion(0,0,50,50,"#ECE9E9",this);
		
		this.add(menuPrincipal,"Principal");
		this.add(plano1,"champs");
		this.setBounds(0, 0, larguraTela, alturaTela);
		
		cardLayout.show(this, "Principal");
		janela.add(this,"Principal");
	}
}
