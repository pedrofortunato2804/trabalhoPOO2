package Interface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import apis.getClick;


public class interfaceMain extends interfaMain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel cards;
	
	public interfaceMain(int x, int y, int widght, int height, String color,JPanel cards) {
		super(x, y, widght, height, color);
		this.cards = cards;
		inicializar();
	}
	
	public void inicializar() {
		JLabel voltar = criarLabels(100,540,80,15,10,"Voltar");
		voltar.addMouseListener(new getClick(cards,"Principal"));
		this.add(voltar);
	}
	
	public JLabel criarLabels(int x,int y,int widght,int height,int tamanhoLetra,String conteudo) {
		JLabel Label = new JLabel(conteudo);
		Label.setFont(new Font("Tahoma",Font.BOLD,tamanhoLetra));
		Label.setForeground(Color.BLACK);
		Label.setBounds(x,y,widght,height);
		return Label;
	}
}
