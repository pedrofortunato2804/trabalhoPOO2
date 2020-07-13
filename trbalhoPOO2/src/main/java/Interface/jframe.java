package Interface;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class jframe extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x,y;
	
	public jframe(int x,int y) {
		this.x = x;
		this.y = y;
		inicializar();
	}
	
	public void inicializar(){
		this.setLayout(null);
		this.setBounds(0,0,x,y);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setUndecorated(true);
	}
}
