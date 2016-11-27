import java.io.IOException;
import java.util.Scanner;
public class Main {
//tribikram adr
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TicTacToe2D verson.
		Scanner scan=new Scanner(System.in); //initializing the Scanner class
		boolean result=true; //initializing the game terminating condition
		
		//game board configuration
		/*(1,1)(1,2)(1,3)
		 *(2,1)(2,2)(2,3)
		 *(3,1)(3,2)(3,3)
		*/
		int turn=0;  //determine whether its player 1 or 2's turn.
		
		
		
		TicTac2D game=new TicTac2D();  //instansiate
		
		String rowcol; //parameter that will passed around in the game
		
		while (result==true){
			
			if (turn%2==0){
			game.gameBoard();
			System.out.println();
			System.out.print("Player 1, It's your turn. Select (x,y) > ");
			rowcol=scan.next();
			game.player1(rowcol);
			}
			else{
			game.gameBoard();
			System.out.println();
			System.out.print("Player 2, It's your turn. Select (x,y) > ");
			rowcol=scan.next();
			game.player2(rowcol);
			}
			
			result=game.getWin();         //passes condition that will determine the game is to be terminated or not
			turn +=1;
			System.out.print("\n");;
		}
			
			
			
			
			
			
			
			
			
			
	//	}
		
		
		
	}

}
