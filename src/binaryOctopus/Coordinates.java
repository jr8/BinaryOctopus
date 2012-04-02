package binaryOctopus;

/**
* The coordinates class encapsulate the row and column of 
* one cell in a 2-D coordinate system.
*
* Class Invariant: 
* The row and column are nonnegative 
* Coordinate objects are immutable
 */
public class Coordinates 
{
	//Coordinates only constist of a row and col #
	private int row, column;
	
	/**
	 * Constructor Method
	 * Pre-Condition: none
	 * Post-Condition: 
	 */
	public Coordinates(int row, int column)
	{
		//checks for class invariance
		if(row >= 0 && column >= 0)
		{
			this.row = row;
			this.column = column;
		}
		//exits program if a negative coordinate is entered
		else
		{
			System.exit(0);
		}
	}

	/**
	 * Accessor Method 
	 * Pre-Condition: none
	 * Post-Condition: Returns row of coordinate
	 */
	public int getRow() 
	{
		return row;
	}

	/**
	 * Accessor Method 
	 * Pre-Condition: none
	 * Post-Condition: Returns col of coordinate
	 */
	public int getColumn() 
	{
		return column;
	}

	//unit testing
	public static void main(String[] args) 
	{
		Coordinates c = new Coordinates(0,0);
		System.out.println("Coordinate(0,0)");
		System.out.println("Testing getCol: " + c.getColumn());
		System.out.println("Testing getRow: " + c.getRow());
		
		//test class invariance
		Coordinates c2 = new Coordinates(0,-1);
		System.out.println("Coordinate(0,0)");
		System.out.println("Testing getCol: " + c2.getColumn());
		System.out.println("Testing getRow: " + c2.getRow());
	}

}
