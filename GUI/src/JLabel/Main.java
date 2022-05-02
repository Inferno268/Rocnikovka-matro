package JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("noBitches2.png"); //vytvoøí oobrázek
		Border border = BorderFactory.createLineBorder(Color.pink,3); //vytvoøí rámeèek
		
		JLabel label = new JLabel(); //vytvoøí label
		label.setText("Brácho jsi teplej?"); //pøidá text do labelu
		label.setIcon(image); //pøidá obrázek
		label.setHorizontalTextPosition(JLabel.CENTER); //nastaví text LEFT,CENTER,RIGHT vùèi obrázku
		label.setVerticalTextPosition(JLabel.TOP); //nastaví text TOP,CENTER,BOTTOM vùèi obrázku
		label.setForeground(Color.cyan); //nastaví barvu textu, jde taky pomocí RGB
		label.setFont(new Font("MV Boli",Font.BOLD,20)); //nastaví font textu 
		label.setIconTextGap(30); //nastaví mezeru mezi textem a obrázkem
		label.setBackground(Color.black); //nastaví barvu pozadí
		label.setOpaque(true); //zviditelní barvu pozadí
		label.setBorder(border); //nastaví rámeèek
		
		
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label); //pøidá label do framu

		
	}

}
