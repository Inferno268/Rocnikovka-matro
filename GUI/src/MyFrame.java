import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame(){
		
		ImageIcon image = new ImageIcon("Rocket2.png");
		
		this.setVisible(true);	//díky tomu to vidíš
		this.setTitle("Runtera"); //tittle
		this.setSize(500,250);	//nastavení velikosti
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit z appky
		this.setResizable(false); //nemùžeš mìnit velikost more 
		this.setIconImage(image.getImage()); //nastaví favicon
		this.getContentPane().setBackground(Color.cyan);//mìní background barvu mùžeš dát i RGB nebo v hexa hodotách
	}
}
