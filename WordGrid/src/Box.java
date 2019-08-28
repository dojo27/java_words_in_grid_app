import java.awt.Font;
import java.awt.Graphics;

public class Box 
{
	private Graphics graph;
	private Font font;
	private int D;
	public Box(Graphics gr, int dimension) 
	{
		graph = gr;
		D = dimension;
		font = new Font("Tahoma", font.PLAIN, D / 2);
		gr.setFont(font);
	}
	public void draw(String letter, int x, int y, int sx, int sy) 
	{
		final int FONT_WIDTH = graph.getFontMetrics().stringWidth(letter);
		final int FONT_HEIGHT = graph.getFontMetrics().getHeight();
		graph.drawString(letter, x + 2 + (sx - FONT_WIDTH) / 2,
								 y - 5 + (sy + FONT_HEIGHT) / 2);
		graph.drawRect(x, y, sx - 1, sy - 1);
	}
}