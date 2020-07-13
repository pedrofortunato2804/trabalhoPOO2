package main;

import Interface.interfaMain;
import Interface.jframe;
import Interface.subMenu;

public class mainClass {
	//Criamos duas constantes para representar o tamanho que queremos para nosso programa
	private static final int larguraTela = 1080;
	private static final int alturaTela = 720;
	//Instanciamos  um objeto do tipo JFramee
	jframe janela;
	interfaMain menuPrincipal;

	public static void main(String[] args) {
		//Criamos um objeto do tipo JFramee
		jframe janela = new jframe(larguraTela,alturaTela);
		
		
		subMenu painelPrincipal = new subMenu(larguraTela,alturaTela,janela);
		painelPrincipal.iniciar();
		//Definimos como visivel
		janela.setVisible(true);

	}
}
