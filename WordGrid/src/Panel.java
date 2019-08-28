import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel 
{
	private Picture picture;
	
	public Picture getPicture()
	{
		return picture;
	}
	
	public Panel() 
	{
		super();
		picture = new Picture(10, 100);
		setPreferredSize(new Dimension(600, 400));
	}
	@Override
	public void paint(Graphics gr) 
	{
		gr.drawImage(picture, 0, 0, this);
	}
}
