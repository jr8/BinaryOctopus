package binaryOctopus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.Border;

public class Board extends JPanel {
	
	
	private final int numRows, numCols;
	private SquarePanel[ ][ ] squares;
	private GridLayout gbag = new GridLayout(8,8 );
	
	public Board(int numRows, int numCols) {
		// TODO Auto-generated constructor stub
		this.numRows = numRows;
		this.numCols = numCols;
		squares = new SquarePanel[numRows][ numCols];
		setLayout(gbag);
		initializeBoard();
	}
	
	private void initializeBoard()
	{
		boolean isBlack = true;
		
		for(int i = 0; i <= numCols -1; i++)
		{
			isBlack = !isBlack;
			for(int j = 0; j <= numRows - 1; j++)
			{
				if(isBlack == true)
				{
					SquarePanel nextSquare = new SquarePanel(Color.BLACK, i, j);
					squares[i][j] = nextSquare;
					add(nextSquare);
					isBlack = false;
				}
				else
				{
					SquarePanel nextSquare = new SquarePanel(Color.ORANGE, i, j);
					squares[i][j] = nextSquare;
					add(nextSquare);
					isBlack = true;
				}
			}
		}
	}

	// put image into box at specified (x, y)
//	public void addImage( ClickableImage image, int x, int y)
//	{
//		image.setRow( x );
//		image.setColumn(y);
//		add(image);
//		squares[x][y] = image;
//	}







}
