
public class RePlayer extends Player{
	
	public RePlayer()
	{
		super(1);
	}
	public RePlayer(int playerNum)
	{
		super(playerNum);
	}
	
	public void createShips()
	{
		BoatMaker make = new BoatMaker(getTurn());
		
		
	}

}
