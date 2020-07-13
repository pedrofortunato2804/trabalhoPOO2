package Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import apis.getClick;


public class Menu extends interfaMain{
	private JPanel cards;
	private JPanel menu;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Menu(int x, int y, int widght, int height, String color,JPanel cards,JPanel menu) {
		super(x, y, widght, height, color);
		this.cards = cards;
		this.menu = menu;
		inicializar();
	}
	
	private void inicializar() {
		JLabel MenuPrincipal = criarLabels(190,10,250,30,30,"Menu Principal");
		this.add(MenuPrincipal);
		
		JLabel escolha1 = criarLabels(150,180,400,30,20," ESCOLHER O CAMPEÃO");
		this.add(escolha1);
		
		JLabel escolha3 = criarLabels(173,320,400,30,20,"VOLTAR");
		this.add(escolha3);
		
		escolha1.addMouseListener(new getClick(cards,"champs"));
		escolha3.addMouseListener(new getClick(menu,"MENU"));
	
	}
	
	
	public JLabel criarLabels(int x,int y,int widght,int height,int tamanhoLetra,String conteudo) {
		JLabel Label = new JLabel(conteudo);
		Label.setFont(new Font("Tahoma",Font.BOLD,tamanhoLetra));
		Label.setForeground(Color.BLACK);
		Label.setBounds(x,y,widght,height);
		return Label;
	}	

}