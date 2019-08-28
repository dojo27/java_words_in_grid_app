import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame 
{
	private Panel panel;
	
	public Panel getPanel()
	{
		return panel;
	}
	
	public Frame(String caption) 
	{
		super(caption);
		setSize(800, 600);
		showFrame();
		init();
	}
	private void showFrame() 
	{
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	public void init() 
	{
		panel = new Panel();
		add(BorderLayout.CENTER, panel);
		pack();
	}
}
