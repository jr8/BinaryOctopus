package binaryOctopus;

import javax.swing.*;
import java.awt.*;

public class ClickableImage extends JButton {

	private int row, column;
	private boolean clicked;

	public ClickableImage( ImageIcon icon )
	{
		super( icon );
		setClicked( false );
	}
	
	public void setRow (int row)
		{ this.row = row; }
	public void setColumn( int column )
		{ this.column = column; }
	public int getRow( )
		{ return row; }
	public int getColumn( )
		{ return column; }
	public void setClicked( boolean b)
		{ clicked = b; }
	public boolean getClicked( )
		{ return clicked; }

}
