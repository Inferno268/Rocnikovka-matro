import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Frame extends JFrame implements KeyListener{
	
	ImageIcon icon;
	JLabel label;
	
	Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		
		
		icon = new ImageIcon("C:\\Users\\marek\\eclipse-workspace\\SpaceInvaders\\output-onlinepngtools.png");
		label = new JLabel();
		
		label.setBounds(0, 0, 100, 100);
		label.setIcon(icon);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10, label.getY());
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'q': label.setLocation(label.getX()-10, label.getY()-10);
			break;
		case 'e': label.setLocation(label.getX()+10, label.getY()+10);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 32: label.setLocation(label.getX(), label.getY()-100);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Zm·Ëkl jste kl·vesu: " + e.getKeyCode()); 
	}

}
