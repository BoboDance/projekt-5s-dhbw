package app;

/**
 * Class Constants.
 * Contains all constants used
 * in the application.
 * @author Daniel
 *
 */
public class Constants {
	
	//testing
	//CAUTION: DON'T FORGET TO CHANGE DEPENDENCY.
	//SPOTIFY/KAFKA DOCKER WORKS WITH KAFKA VERSION 0.8.2.1 ONLY!
	public static boolean TEST_LOCAL = false;

	//kafka constants
	public static final int KAFKA_PORT = 2181;
	public static final String KAFKA_CONS_TOPIC_PRODDATA = "prodData";
	
	//kafka producer constants
	public static final int KAFKA_BROKER_PORT = 9092;
	public static final String KAFKA_PROD_TOPIC_MANUFACTURING_DATA = "manufacturingData";
	public static final String KAFKA_PROD_TOPIC_ERP_DATA = "erpData";
	
	//activeMQ constants
	public static final int AMQ_PORT = TEST_LOCAL ? 32768 : 61616;
	public static final String AMQ_TOPIC = "m_orders";
	
	//file system constants
	public static final String PATH_SPECTRAL_ANALYSIS = TEST_LOCAL ? "/Users/Daniel/Documents/tmp/" : "/temp/";
	
	//mongodb constants
	public static final int MONGO_PORT = 27017;
	public static final String DATABASE_NAME = "oip_taktstrasse";
	public static final String DATABASE_COLLECTION_NAME = "manufacturingData";
	
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
