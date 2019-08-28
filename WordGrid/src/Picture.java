import java.awt.image.BufferedImage;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Picture extends BufferedImage 
{
	private Graphics graph;
	private Box[][] boxes;
	private  int N = 5 ;
	private int D;
	private static Random random = new Random();
	private static final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final Color CLEAR_COLOR = Color.white;
	
	public Picture(int n, int dimension) 
	{
		super(600, 600, TYPE_INT_ARGB);
		graph = getGraphics();
		Clear();
		N = n;
		D = dimension;
		initBoxes();
		Draw();
	}
	public void Draw() 
	{
		graph.setColor(Color.red);
		for(int x = 0; x < N; x++)
			for(int y = 0; y < N; y++)
				boxes[x][y].draw(getRandomLetter(), 
				x * (D + 1),
				y * (D + 1),
				D + 1, D + 1
			);
	}
	
	private void initBoxes()
	{
		boxes = new Box[N][N];
		for(int x = 0; x < N; x++)
			for(int y = 0; y < N; y++)
				boxes[x][y] = new Box(graph, D);
	}
	
	public void Clear() 
	{
		graph.setColor(CLEAR_COLOR);
		graph.fillRect(0, 0, getWidth(), getHeight());
	}
	
	private String getRandomLetter()
	{
		int index = random.nextInt(abc.length());
		return abc.substring(index, index + 1);
	}
}