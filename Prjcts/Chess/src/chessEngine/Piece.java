package chessEngine;
public abstract class Piece
{
	protected Position position;
	protected int horizntlMove, vertclMove;
	private char symbol;
	fractions fraction;
	
	public enum fractions {WHITE, BLACK};
	public Piece()
	{
		position = new Position();
		symbol = '*';
		fraction = fractions.WHITE;
	}
	
	public Piece(Position position)
	{
		this();
		this.position = position;
	}
	
	Piece(char symbol, Position position, fractions fraction)
	{
		this.symbol = symbol;
		this.position = position;
		this.fraction = fraction;
	}
	
	public boolean move(Position pos)
	{
		if(isMoveValid(pos))
		{
			position = pos;
			return true;
		}
		return false;
	}
	
	public boolean isMoveValid(Position pos)
	{
		return true;
	}
	
	public char getSymbol()
	{
		return symbol;
	}
	
	public Position getPosition()
	{
		return position;
	}
	
	public int getHorizntl()
	{
		return position.getHorizntl();
	}
	
	public int getVertcl()
	{
		return position.getVertcl();
	}
}