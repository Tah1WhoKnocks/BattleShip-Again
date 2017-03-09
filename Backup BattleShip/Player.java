import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.JFrame;

public class Player {
	private int turn;
	
	//0 is hit ship
	//1 is no ship
	//>1 is a ship
	private int[][] ships;
	
	
	//0 is hit ship
	//1 is missed ship
	//2 is unknown
	private int[][] enemies;
	
	public Player(int i)
	{
		 ships = new int[][]{ {1,1,1,1,1,3},
			 {1,1,1,1,1,3},
			 {1,1,1,1,1,1},
			 {1,1,1,1,1,1},
			 {1,1,1,1,1,1},
			 {1,1,1,1,1,1},};
		 enemies = new int[][] { {2,2,2,2,2,2},
			 {2,2,2,2,2,2},
			 {2,2,2,2,2,2},
			 {2,2,2,2,2,2},
			 {2,2,2,2,2,2},
			 {2,2,2,2,2,2}};
		turn = i;
		
	}
	
	
	
	public Player(int i,int[][] v)
	{
		 turn = i; 
		 ships = v;
		 enemies = new int[][] { {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2},
			 {2,2,2,2,2,2,2,2,2,2} };
		
		
	}
	
	
	//Self Explanatory
	public int[][] getShips()
	{
		return ships;
	}
	
	public int[][] getEnemies()
	{
		return enemies;
	}
	public int getTurn()
	{
		return turn;
	}
	
	public void setShips(int x,int y)
	{
		ships[x][y] = 2;
	}
	//Here we have the attack method, it uses the receive attack method, and changes the two arrays
	//Whether or not there is a ship.
	
	public boolean attack(Player p, int x, int y)
	{
		y-=1;
		if(p.recieveAttack(x, y))
		{
			enemies[x][y] = 0;
			return true;
		}else{
			enemies[x][y] = 1;
			return false;
		}
	}
   
	//Make boats!
	public void makeBoats()
	{
		 BoatMaker boatMake = new BoatMaker();
			boatMake.initialize();
			boatMake.getFrame().setVisible(true);
			int shiptotal = 0;
			while(shiptotal<7){
				for(int c = 0;c <boatMake.getShipShape().length;c++)
				{
					for(int b = 0;b<boatMake.getShipShape()[c].length;b++)
					{
						if(boatMake.getShipShape()[c][b].isSelected() && ships[c][b] != 2)
						{
							setShips(c, b);
							shiptotal++;
						}
					}	
				}
			}
			boatMake.getFrame().setVisible(false);
			boatMake.getFrame().dispose();
		
	}
	//makes the window does the stuff to attack
	public void attackGui(Player p, Player o)
	{
		int x = 0;
		int y = 0;
		String name;
		
		MainGrid grid = new MainGrid(p,o);
		grid.initialize();
		grid.getFrame().setVisible(true);
		
			boolean pressed = false;
			while(pressed == false){
				for(int c = 0;c < grid.getListThem().length;c++)
				{
					if(grid.getListThem()[c].isSelected())
					{
						name = grid.getListThem()[c].getText();
						x = convert(name.substring(0,1));
						y = Integer.parseInt(name.substring(1,2));
						
					pressed = true;
					}
					
						
				}
			}
			attack(o,x,y);
			grid.getFrame().setVisible(false);
			grid.getFrame().dispose();
		
	}
   public boolean recieveAttack(int x, int y)
	{
      //y-=1;
		if(ships[x][y]>1)
		{
			ships[x][y] = 0;
			return true;
		}else{
			return false;
		}
	}
	
	public int convert(String s)
	{
		int row;
			if(s.toLowerCase().equals("a"))
			{
				row = 0;
			}else if(s.toLowerCase().equals("b")){
				row = 1;
			}else if(s.toLowerCase().equals("c")){
				row =2;
			}else if(s.toLowerCase().equals("d")){
				row = 3;
			}else if(s.toLowerCase().equals("e")){
				row = 4;
			}else{
				row = 5;
			}
				
		return row;
	}
	
	//Builds the text grid, eventually will implement swing.
	public String printMe()
	{
      String[] rows = {"A","B","C","D","E","F","G","H","I","J"};
		String full = "   1 2 3 4 5 6 7 8 9 10";
		for(int a = 0;a<ships.length;a++)
		{
			if (a<rows.length)
			{
				full+="\n"+(rows[a])+"  ";	
			}
			
			for(int b = 0;b<ships[a].length;b++)
			{
				full+= ships[a][b]+" ";
			}
		}
		return full;
	}
	
	public String printEnemies()
	{
		String[] rows = {"A","B","C","D","E","F","G","H","I","J"};
		String full = "   1 2 3 4 5 6 7 8 9 10";
		for(int a = 0;a<enemies.length;a++)
		{
			if (a<rows.length)
			{
				full+="\n"+(rows[a])+"  ";	
			}
			
			for(int b = 0;b<enemies[a].length;b++)
			{
				full+= enemies[a][b]+" ";
			}
		}
		return full;
	}
   
   public boolean checkWinner(Player p)//returns true if target player has no remaining ships
   {
      int count = 0;
      
      for(int r = 0; r<p.getShips().length; r++)
         for(int c = 0; c<p.getShips()[r].length; c++)
            if(p.getShips()[r][c]>1)
               count++;
      
      if(count==0)
         return true;
         
      return false;
   }
	
	
}

