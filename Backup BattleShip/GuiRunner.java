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
	   
	  
		//sjp
	   p1.makeBoats();
	   p2.makeBoats();
	   
	   
	  
			
			
			
	    while(winner==0){
	    	
	    			
	    			
	    			
	    	
	    }
			
		
			
		
	}
	
}
