import java.util.Scanner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

import java.awt.EventQueue;
import java.util.Arrays;

public class TextRunner {
	public static void main(String[]args)
	{

		Scanner scan = new Scanner(System.in);
		int winner = 0;
		int turn = 1;
		int[][] p1ships = new int[][]{ {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,1,1,1},
			 {1,1,1,1,1,1,1,3,3,3} };
			  
			  int[][] p2ships = new int[][]{ {3,3,3,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1},
					 {1,1,1,1,1,1,1,1,1,1} };
		
		Player p1 = new Player(1, p1ships);
		Player p2 = new Player(2, p2ships);
      
		
	  String[] q = {"1+2=","2+2=","3+2=","4+2="};
      String[] a = {"3","4","5","6"};
      Quiz addition = new Quiz(q,a);
		
		while (winner <1)
		{
			String xa = "";
			int ya = 0;
			
			if(turn == 1)
			{
            System.out.print("\n\nPlayer "+ turn + "!");
            if(addition.showTime())
            {
               System.out.print("\nCORRECT!");
				   System.out.print("\n"+p1.printEnemies());
				   System.out.print("\n\n"+p1.printMe());
            
				   System.out.print("\n"+"Choose Your Attacking Row!");
				   xa = scan.next();
				   System.out.print("Choose Your Attacking Collumn!");
				   ya = scan.nextInt();
				   if(p1.attack(p2, p2.convert(xa), ya))
				   {
				   	System.out.print("Hit!\n");
				   }else{
				   	System.out.print("Miss!\n");
				   }
            }
            else
            {
               System.out.print("\nINCORRECT!");
            }
            if(p1.checkWinner(p2))
            {
               System.out.print("\n\nPLAYER " + turn + " WINS!!!" + "\nGG!!!");
               winner = 1;
            }
            else
               turn = 2;
				
			}else{
            System.out.print("\n\nPlayer "+ turn + "!");
				if(addition.showTime())
            {
               System.out.print("\nCORRECT!");
				   System.out.print("\n"+p2.printEnemies());
				   System.out.print("\n\n"+p2.printMe());
            
				   System.out.print("\n"+"Choose Your Attacking Row!");
				   xa = scan.next();
				   System.out.print("Choose Your Attacking Collumn!");
				   ya = scan.nextInt();
				   if(p2.attack(p1, p1.convert(xa), ya))
				   {
				   	System.out.print("Hit!\n");
				   }else{
				   	System.out.print("Miss!\n");
				   }
            }
            else
            {
               System.out.print("\nINCORRECT!");
            }
            if(p2.checkWinner(p1))
            {
               System.out.print("\n\nPLAYER " + turn + " WINS!!!" + "\nGG!!!");
               winner = 1;
            }
            else
               turn = 1;
         }
      }
	  
	  scan.close();
      
   }//ends main
}//ends class
