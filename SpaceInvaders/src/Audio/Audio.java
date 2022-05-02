package Audio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio {
	Scanner sc = new Scanner(System.in);
	String response = "";
	
	
	public Audio()throws LineUnavailableException, UnsupportedAudioFileException, IOException{
	
		File file = new File("Song.wav");
	
		AudioInputStream audio = AudioSystem.getAudioInputStream(file);
	
		Clip clip = AudioSystem.getClip();
	
		clip.open(audio);
		
		clip.start();
	
	 

	}
}
