package getInformation;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.json.JSONObject;

import apis.Champion;


public class informationChampions implements ActionListener {
		private JTextField campo; 
		private JLabel champ;
		private JLabel title;
		private JLabel foto;
		public informationChampions(JTextField campo,JLabel champ,JLabel title,JLabel foto) {
			this.campo = campo;
			this.champ = champ;
			this.title = title;
			this.foto = foto;
		}
		public void actionPerformed(ActionEvent arg0) {
			Champion ApiExecutor = new Champion();
			try {
				JSONObject campeaoTotal = ApiExecutor.DadosAPI(campo.getText());
				JSONObject data = campeaoTotal.getJSONObject("data");
				JSONObject championLore = data.getJSONObject(campo.getText());
				
				String nomeChamp = championLore.getString("id");
				nomeChamp = String.format("%s", nomeChamp);
				champ.setText(nomeChamp);
				

				String lore = championLore.getString("lore");

				byte array[] = lore.getBytes("ISO-8859-1");
				lore = new String(array, "UTF-8");
				lore = String.format("<html>"+"Lore : %s"+"<html>", lore);
				title.setText(lore);
				
				String getImg = String.format("http://ddragon.leagueoflegends.com/cdn/img/champion/loading/%s_0.jpg", campo.getText());
				URL url = new URL(getImg);
				Image imagem = ImageIO.read(url);
				foto.setIcon(new ImageIcon(imagem));
				
			} catch (IOException e) {
				champ.setText("Don't Found");
				e.printStackTrace();
			}
		}
		public static ByteBuffer toByteBuffer(String content, String encode) {
		    Charset charset = Charset.forName(encode);
		    ByteBuffer bb = charset.encode(content);
		    return bb;
		}
}
