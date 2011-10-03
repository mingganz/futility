package futility;

public class ActionRunnable implements Runnable {

	private Client mClient;
//	private Timer mTimer;
	
	public ActionRunnable(Client client){
		mClient = client;
	}
	
	/**
	 * Respond during the current timestep
	 */
	@Override
	public void run() {
        mClient.act();
        mClient.resetKnowledge();
	}
}