package model.entities;

public abstract class Device {
	
	private Integer serialNumber;

	public Device(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void processDoc(String doc);

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}
}