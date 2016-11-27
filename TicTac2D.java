
public class TicTac2D {
	
	String[][] tic=new String[3][3];
	
	
	public TicTac2D()
	
	{
		
		for (int i=0;i<3;i++)
		
		{
			for(int j=0;j<3;j++)
			{
				tic[i][j]="-";                    //constructor creating the array
			}
			
		}
		
		
		
		
		
	}

		public String toString(){
			String board="";
			for(int i=0;i<3;i++)
			{
				
				for(int j=0;j<3;j++)
				{
					
						board=board+(((tic[i][j]))+" ");
					
					
				}
				
				board="   "+board+"\n"+"         ";                                     //creating a string verson of the board
			}
			return board;
		}
	
	
	public void gameBoard()
	{
		System.out.print("Current game board state"+"\n"+toString());
		                                                                               //printing out the board
	}
	
	public void player1(String rowcol)
	{
		if(rowcol.equals("1,1") && tic[0][0].equals("-"))
		
		{
			
			tic[0][0]="O";               //adding values to the array for player 1
			
		}
		
		else if(rowcol.equals("1,2") && tic[0][1].equals("-"))
			
		{
			tic[0][1]="O";
		}
		
		else if(rowcol.equals("1,3") && tic[0][2].equals("-"))
			
		{
			tic[0][2]="O";
		}
		else if(rowcol.equals("2,1") && tic[1][0].equals("-"))
	
		{
			tic[1][0]="O";
		}
		else if(rowcol.equals("2,2") && tic[1][1].equals("-"))
			
		{
			tic[1][1]="O";
		}
		else if(rowcol.equals("2,3") && tic[1][2].equals("-"))
	
		{
			tic[1][2]="O";
		}
		else if(rowcol.equals("3,1") && tic[2][0].equals("-"))
			
		{
			tic[2][0]="O";
		}
		else if(rowcol.equals("3,2") && tic[2][1].equals("-"))
	
		{
			tic[2][1]="O";
		}
		else if(rowcol.equals("3,3") && tic[2][2].equals("-"))
	
		{
			tic[2][2]="O";
		}
		else
		{
			System.out.print("Not allowed, better luck next time cheater");
		}
	}
	
	
	public void player2(String rowcol)
	
	{                                                                   //adding values in the array
		if(rowcol.equals("1,1") && tic[0][0].equals("-"))
			
		{
			
			tic[0][0]="X";
			
		}
		
		else if(rowcol.equals("1,2") && tic[0][1].equals("-"))
			
		{
			tic[0][1]="X";
		}
		
		else if(rowcol.equals("1,3") && tic[0][2].equals("-"))
			
		{
			tic[0][2]="X";
		}
		else if(rowcol.equals("2,1") && tic[1][0].equals("-"))
	
		{
			tic[1][0]="X";
		}
		else if(rowcol.equals("2,2") && tic[1][1].equals("-"))
			
		{
			tic[1][1]="X";
		}
		else if(rowcol.equals("2,3") && tic[1][2].equals("-"))
	
		{
			tic[1][2]="X";
		}
		else if(rowcol.equals("3,1") && tic[2][0].equals("-"))
			
		{
			tic[2][0]="X";
		}
		else if(rowcol.equals("3,2") && tic[2][1].equals("-"))
	
		{
			tic[2][1]="X";
		}
		else if(rowcol.equals("3,3") && tic[2][2].equals("-"))
	
		{
			tic[2][2]="X";
		}
		else
		{
			System.out.print("Not allowed, better luck next time cheater");
		}
		
	}
	
	public boolean getWin()
	
	{
		if((tic[0][0].equals("O") && tic[0][1].equals("O") && tic[0][2].equals("O"))||
		   (tic[1][0].equals("O") && tic[1][1].equals("O") && tic[1][2].equals("O"))||
		   (tic[2][0].equals("O") && tic[2][1].equals("O") && tic[2][2].equals("O"))||
		   (tic[0][0].equals("O") && tic[1][1].equals("O") && tic[2][2].equals("O"))||
		   (tic[0][2].equals("O") && tic[1][1].equals("O") && tic[2][0].equals("O"))||
		   (tic[0][0].equals("O") && tic[1][0].equals("O") && tic[2][0].equals("O"))||          //checking condition for player 1
		   (tic[0][1].equals("O") && tic[1][1].equals("O") && tic[2][1].equals("O"))||
		   (tic[0][2].equals("O") && tic[1][2].equals("O") && tic[2][2].equals("O")))
		{
			
		playoneWinner();	
		return false;	
			
		}
		else if   ((tic[0][0].equals("X") && tic[0][1].equals("X") && tic[0][2].equals("X"))||
				   (tic[1][0].equals("X") && tic[1][1].equals("X") && tic[1][2].equals("X"))||
				   (tic[2][0].equals("X") && tic[2][1].equals("X") && tic[2][2].equals("X"))||
				   (tic[0][0].equals("X") && tic[1][1].equals("X") && tic[2][2].equals("X"))||
				   (tic[0][2].equals("X") && tic[1][1].equals("X") && tic[2][0].equals("X"))||           //checking condition for player 2
				   (tic[0][0].equals("X") && tic[1][0].equals("X") && tic[2][0].equals("X"))||
				   (tic[0][1].equals("X") && tic[1][1].equals("X") && tic[2][1].equals("X"))||
				   (tic[0][2].equals("X") && tic[1][2].equals("X") && tic[2][2].equals("X")))
				{
					
				
			 	playtwoWinner();
				return false;	
					
				}
		else if(drawCondition()){
			drawGame();
			return false;
		}
		
		else
		{
			return true;
		}
	}
	
	private boolean drawCondition()
	{
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)           //draw game condition
			{
				if(tic[i][j].equals("-"))
				{
					count +=1;
				}
			}
		}
		if(count!=0){
			return false;
		}
		else
		{
			return true;
		}
	}
	
	private void drawGame()
	{
		gameBoard(); 
		System.out.println("");//print dargame
		System.out.print("The game ended as a draw");
	}

	private void playoneWinner(){
		gameBoard();     //player 1 wins
		System.out.println("");
		System.out.print("Player one has won");
	}
	private void playtwoWinner(){
		gameBoard();          //player 2 wins
		System.out.println("");
		System.out.print("Player 2 has won");
	}
	
	}
