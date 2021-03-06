import java.util.Scanner;
import chessEngine.Game;

public class ConsoleChess
{
	private Game game;
	private Scanner input;
	
	public ConsoleChess()
	{
		input = new Scanner(System.in);
		game = new Game();
	}
	
	public void start()
	{
		System.out.println(welcomeMessage());
		String from = null, to = null;
		while(from != "stop" || to != "stop")
		{
			System.out.println(game.getTurn() + "'s turn.");
			drawBoard();
			from = input.next();
			to = input.next();
			if(!game.makeMove(from, to))
				System.out.println("WRONG MOVE!");
			if(game.isGameOver())
				break;
		}
		input.close();
		System.out.println(game.getTurn() + " Win!");
	}
	
	private void drawBoard()
	{
		char[][] board = game.getBoard();
		String drawnBoard = "   A   B   C   D   E   F   G   H  \n";
		for(int i = 7; i >= 0; i--)
		{			
			drawnBoard += "  _______________________________\n" + (i + 1) + "|";
			for(int j = 0; j < 8; j++)
			{
				drawnBoard += " " + board[i][j] + " |";
			}
			drawnBoard += (i + 1) + "\n";			
		}
		drawnBoard += "  _______________________________\n";
		drawnBoard += "   A   B   C   D   E   F   G   H  ";
		System.out.println(drawnBoard);
	}
	
	
	private String welcomeMessage()
	{
		String welcome = "Hello";
		return welcome;
	}
}
