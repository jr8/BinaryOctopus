package binaryOctopus;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class CheckersGui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckersGui gui = new CheckersGui();

	}
	 Dimension boardSize = new Dimension(600, 600);
		private final int numRows = 8;
		private final int numCols = 8;
		//private Game game = new Game(numRows, numCols);
		private String gameName = "Checkers";
		
		
		private JFrame mainFrame;
	
		private ClickableImage pieceSelected;
		
		
		Board board = null;
		
		Border clickedPiece = BorderFactory.createLineBorder(Color.RED, 3);
		
		// Constructor creates all GUI components
		public CheckersGui( ) 
		{
			mainFrame = new JFrame( );
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainFrame.setLayout(new BorderLayout());
			mainFrame.setSize(700, 700);
			mainFrame.setLocation(200, 10);
			
		
			board = new Board(numRows, numCols);
			//initBoard();				method to set board
			mainFrame.add(board, BorderLayout.CENTER);

			// create the panel that holds the buttons
			JPanel jpButtons = new JPanel( );
			jpButtons.setLayout( new GridLayout(1, 5));
			Border btnBorder = BorderFactory.createRaisedBevelBorder();
			Dimension btnDimension = new Dimension(50, 50);
			Font btnFont = new Font("Times New Roman", Font.BOLD, 24);
			
			// make the GUI visible
			mainFrame.setTitle(gameName);
			mainFrame.setVisible(true);

		}
}
