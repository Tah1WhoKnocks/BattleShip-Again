import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class GuiRunner {
	public static void main(String[]args)
	{
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		
		String[] q = {"1+2=","2+2=","3+2=","4+2="};
	    String[] a = {"3","4","5","6"};
	    
	    Quiz addition = new Quiz(q,a);
	    
	    int winner = 0;
	    int turn = 1;
	   
	  
		//something like this ok?	
	    BoatMaker boatMake = new BoatMaker();
			boatMake.initialize();
			boatMake.getFrame().setVisible(true);
			int shiptotal = 0;
			while(shiptotal<10){
				for(int c = 0;c <boatMake.getShipShape().length;c++)
				{
					for(int b = 0;b<boatMake.getShipShape()[c].length;b++)
					{
						if(boatMake.getShipShape()[c][b].isSelected())
						{
							p1.setShips(c, b);
							shiptotal++;
						}
					}	
				}
			}
			
			
			
			
			
	    while(winner==0){
	    	
	    			
	    			
	    			
	    	
	    }
			
		
			
		
	}
	
}
