package es.uah.aut.srg.micobs.util;

public class StringValue {

	public String getString() {
		return theString;
	}

	public void setString(String string) {
		this.theString = string;
	}

	public boolean isRaw() {
		return isRaw;
	}

	public void setRaw(boolean isRaw) {
		this.isRaw = isRaw;
	}

	public String theString;
	public boolean isRaw;
	
	public StringValue(String theString, boolean isRaw) {
		super();
		this.theString = theString;
		this.isRaw = isRaw;
	}
	
	@Override
	public String toString() {
		return theString;
	}
	
}