import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		
		ImageIcon image = new ImageIcon("Rocket2.png");
		
		this.setVisible(true);	//d�ky tomu to vid�
		this.setTitle("Runtera"); //tittle
		this.setSize(500,250);	//nastaven� velikosti
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit z appky
		this.setResizable(false); //nem��e� m�nit velikost more 
		this.setIconImage(image.getImage()); //nastav� favicon
		this.getContentPane().setBackground(Color.cyan);//m�n� background barvu m��e� d�t i RGB nebo v hexa hodot�ch
	}
}
