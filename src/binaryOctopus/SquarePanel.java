package binaryOctopus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class SquarePanel extends JPanel{

	private Dimension size = new Dimension(75, 75);
	private ClickableImage piece;	
	private int x, y;
	private GridBagLayout gbag = new GridBagLayout( );
	
	public SquarePanel(Color color, int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.setBackground(color);
		this.setLayout(gbag);
		this.setSize(size);
	}

}
