package com.app.model;

public class Address{

	private Integer addrId;
	private int houseNo;
	private String city;

	public Address() {
		super();
	}

	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", houseNo=" + houseNo + ", city=" + city + "]";
	}



}
