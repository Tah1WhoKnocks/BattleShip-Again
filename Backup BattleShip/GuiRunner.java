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
	   
	    MainGrid player1=new MainGrid(p1, p2);
	    //player1.getFrame().setVisible(true);
	    
	   while(winner == 0)
	   {
	    
	    p1.attackGui(p1, p2);
	    if(p1.checkWinner(p2)){
	    	winner=1;
	    }
	    
	    p2.attackGui(p2, p1);
	    if(p2.checkWinner(p1)){
	    	winner=2;
	    }
	    
	    
	   }
	 }
}
