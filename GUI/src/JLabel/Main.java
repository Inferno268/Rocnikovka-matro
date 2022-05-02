package JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("noBitches2.png"); //vytvo�� oobr�zek
		Border border = BorderFactory.createLineBorder(Color.pink,3); //vytvo�� r�me�ek
		
		JLabel label = new JLabel(); //vytvo�� label
		label.setText("Br�cho jsi teplej?"); //p�id� text do labelu
		label.setIcon(image); //p�id� obr�zek
		label.setHorizontalTextPosition(JLabel.CENTER); //nastav� text LEFT,CENTER,RIGHT v��i obr�zku
		label.setVerticalTextPosition(JLabel.TOP); //nastav� text TOP,CENTER,BOTTOM v��i obr�zku
		label.setForeground(Color.cyan); //nastav� barvu textu, jde taky pomoc� RGB
		label.setFont(new Font("MV Boli",Font.BOLD,20)); //nastav� font textu 
		label.setIconTextGap(30); //nastav� mezeru mezi textem a obr�zkem
		label.setBackground(Color.black); //nastav� barvu pozad�
		label.setOpaque(true); //zviditeln� barvu pozad�
		label.setBorder(border); //nastav� r�me�ek
		
		
		
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(label); //p�id� label do framu

		
	}

}
