package consumer;

/**
 * Class ProductionData.
 * The JSON data is converted into
 * objects of this class.
 * @author Daniel
 *
 */
public class ProductionData {
	private String value;
	private String status;
	private String itemName;
	private long timestamp;
	
	/**
	 * Empty constructor.
	 */
	public ProductionData() {}
	
	/**
	 * toString method.
	 */
	@Override
	public String toString() {
		return value + " " + status + " " + itemName + " " + timestamp;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
