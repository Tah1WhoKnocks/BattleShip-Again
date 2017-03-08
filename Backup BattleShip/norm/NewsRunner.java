package norm;

public class NewsRunner {

	public static void main(String[] args) {
		
		boolean endIt = true;
		
		breitbart trumpdump = new breitbart();
		buzzfeed triggerwarning = new buzzfeed();
		triggerwarning.setVisible(true);
		
		while(endIt){
			if(!trumpdump.isVisible())
				triggerwarning.setVisible(true);
			if(!triggerwarning.isVisible())
				trumpdump.setVisible(true);
		}

	}

}
