package main;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;

import Interface.close;
import Interface.interfaMain;
import apis.getClick;

public class PanelSubMenu extends interfaMain{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JPanel cards;
	public PanelSubMenu(int x, int y, int widght, int height, String color,JPanel cards) {
		super(x, y, widght, height, color);
		this.cards = cards;
		inicializar();
		
	}
		public void inicializar() {
			JLabel MenuPrincipal = criarLabels(425,10,250,30,30,"Menu Principal");
			this.add(MenuPrincipal);
			
			JLabel escolha1 = criarLabels(425,180,400,30,20,"ESCOLHER CAMPEÃO");
			this.add(escolha1);
			
			JLabel escolha2 = criarLabels(480,600,400,30,20, "SAIR");
			this.add(escolha2);
			
			escolha1.addMouseListener(new getClick(cards,"JOGO"));
			escolha2.addMouseListener(new close());
			
		}
		
		public JLabel criarLabels(int x,int y,int widght,int height,int tamanhoLetra,String conteudo) {
			JLabel Label = new JLabel(conteudo);
			Label.setFont(new Font("Gotham",Font.BOLD,tamanhoLetra));
			Label.setForeground(Color.BLACK);
			Label.setBounds(x,y,widght,height);
			return Label;
		}

}
