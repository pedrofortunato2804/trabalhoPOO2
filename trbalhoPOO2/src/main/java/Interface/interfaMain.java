package Interface;

import java.awt.Color;

import javax.swing.JPanel;

public class interfaMain extends JPanel{

	private static final long serialVersionUID = 1L;
	int x,y,widght,height;
	String color;
	
	public interfaMain(int x,int y,int widght,int height,String color) {
		this.x = 500;
		this.y = 500;
		this.widght = widght;
		this.height = height;
		this.color = color;
		this.setBackground(Color.decode("#D8FBF4"));
		this.setBounds(x,y,widght,height);
		this.setLayout(null);
	}
	
}