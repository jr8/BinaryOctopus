package binaryOctopus;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class ClickableImageGrid extends JPanel {

	private final int gRows, gCols;	// nr rows, columns
	private ClickableImage[ ][ ] images;
	private GridLayout gbag = new GridLayout(8,8 );
	
	public ClickableImageGrid( int rows, int cols)
	{
		gRows = rows;
		gCols = cols;
		images = new ClickableImage[rows][ cols];
		setLayout(gbag);
		
	}

	// put image into box at specified (x, y)
	public void addImage( ClickableImage image, int x, int y)
	{
		image.setRow( x );
		image.setColumn(y);
		add(image);
		images[x][y] = image;
	}


	public void removeImage( int x, int y )
	{
		if (images[x][y] != null)
			images[x][y].setVisible( false );
	}
	
	public void clearImages( )
	{
		for (int r = 0; r < gRows; r++)
		for (int c = 0; c < gCols; c++)
			removeImage(r, c);
	}

	public void setBorder( int r, int c, Border border)
	{
		images[r][c].setBorder(border);
	}
}
	
	