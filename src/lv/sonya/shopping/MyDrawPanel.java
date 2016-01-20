package lv.sonya.shopping;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {

	private BufferedImage myPicture;

	public MyDrawPanel() {
		try {
			myPicture = ImageIO.read(new File(
					"C:\\Users\\Raznaya\\Documents\\Work_2014\\Java\\Workspace\\Practice\\src\\lv\\sonya\\shopping\\me.jpg"));
		} catch (IOException ex) {
			// handle exception...
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		// g.setColor(Color.orange);
		// g.fillRect(20, 50, 100, 100);

		super.paintComponent(g);
		g.drawImage(myPicture, 0, 0, null); // see javadoc for more info on the
											// parameters
	}

}
