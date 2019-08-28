import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Program 
{
	private Frame frame;
	
	public static void main(String[] args) 
	{
		Program program = new Program();
		program.start();
	}

	public void start() 
	{
		frame = new Frame("Words in boxes...");
		savePicture();
	}
	
	public void savePicture()
	{
		File file = new File("words.png");
		try {
			ImageIO.write(frame.getPanel().getPicture(), "png", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}