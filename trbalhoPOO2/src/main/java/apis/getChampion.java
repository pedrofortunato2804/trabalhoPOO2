package apis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Interface.interfaMain;
import getInformation.informationChampions;

public class getChampion extends interfaMain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel cards;
	public getChampion(int x, int y, int widght, int height, String color,JPanel cards) {
		super(x, y, widght, height, color);
		this.cards = cards;
		inicializar();
	}
	private void inicializar() {
		JLabel nome = criarLabels(260,10,200,50,15,"Digite o nome do Campeão");
		this.add(nome);
		
		JTextField nomeCampeao = criarTextField(260, 50, 180, 30,"Digite o nome");
		
		nomeCampeao.addFocusListener(new getChampions(nomeCampeao,"Digite o nome"));
		this.add(nomeCampeao);
		
		JLabel nomeChamp = criarLabels(10,150,200,60,20,"");
		this.add(nomeChamp);
		
		JLabel loreChamp = criarLabels(30,200,500,300,18,"");
		this.add(loreChamp);
		
		JLabel fotoChamp = criarLabels(774,0,308,560,10,"");
		this.add(fotoChamp);
		
		JButton botao = criarButton(300,90,100,25,"Clique Aqui");
		botao.addActionListener(new informationChampions(nomeCampeao,nomeChamp,loreChamp,fotoChamp));
		this.add(botao);
		JLabel voltar = criarLabels(60,60,80,1000,20,"Voltar");
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
	
	public JTextField criarTextField(int x,int y, int widght,int height,String conteudo) {
		JTextField TextField = new JTextField(conteudo);
		TextField.setBounds(x, y, widght, height);
		TextField.setBackground(Color.decode("#DFDDDD"));
		TextField.setForeground(Color.BLACK);
		TextField.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(),
				BorderFactory.createEmptyBorder(0, 20, 0, 0)));
		return TextField;
	}
	
	public JButton criarButton(int x, int y,int widght,int height,String conteudo) {
		JButton botao = new JButton(conteudo);
		botao.setBounds(x, y, widght, height);
		return botao;
	}
}
