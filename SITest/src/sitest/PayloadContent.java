package sitest;

public class PayloadContent {

	private String dummyText;

	private int dummyInt;

	public PayloadContent(String dummyText, int dummyInt) {
		super();
		this.dummyText = dummyText;
		this.dummyInt = dummyInt;
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("PayloadContent [dummyText=").append(dummyText).append(", dummyInt=").append(dummyInt).append("]");
		return buffer.toString();
	}

}
