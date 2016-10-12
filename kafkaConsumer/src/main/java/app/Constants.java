package app;

/**
 * Class Constants.
 * Contains all constants used for initialization
 * of the application.
 * @author Daniel
 *
 */
public class Constants {

	//kafka constants
	public static final int KAFKA_PORT = 2181;
	public static final String KAFKA_TOPIC = "prodData";
	
	//activeMQ constants
	public static final int AMQ_PORT = 32774;
	public static final String AMQ_TOPIC = "m_orders";
	public static final String AMQ_QUEUE_NAME = "TestQueue";
	
	/**
	 * Returns ip address according
	 * to the operating system.
	 * @return
	 */
	public static String getIPAddress() {
		return (System.getProperty("os.name").toLowerCase().matches("(.*)windows(.*)")) 
			? "192.168.99.100" : "127.0.0.1";
	}
	
	/**
	 * Private constructor prevents
	 * instantiations of this class.
	 */
	private Constants() {}
}