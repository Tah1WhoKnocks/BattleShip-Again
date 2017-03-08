import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	   
	   /*p1.makeBoats();
	   p2.makeBoats();*/
	    
	    MainGrid player1=new MainGrid();;
	    MainGrid player2=new MainGrid();;
	   
	   /*while(winner==0){
	    	if(turn==1){
	    		player1.setSelf(p1);
	    		player1.setOpponent(p2);
	    		player1.getFrame().setVisible(true);
	    	}
	    	player1.getFrame().setVisible(false);
			player1.getFrame().dispose();
	    	
	    	if(turn==2){
	    		player2.setSelf(p2);
	    		player2.setOpponent(p1);
	    		player2.getFrame().setVisible(true);
	    	}
	    	player2.getFrame().setVisible(false);
			player2.getFrame().dispose();
	    
	    
	   }*/
	    
	    player1.setSelf(p1);
		player1.setOpponent(p2);
		player1.getFrame().setVisible(true);
			
		
			
		
	}
	
}
