package com.mtyu.pojo;

public class DictVal {
	private String businessTypeId;
	private String busiId;
	private String busiValue;

	public String getBusinessTypeId() {
		return businessTypeId;
	}

	public void setBusinessTypeId(String businessTypeId) {
		this.businessTypeId = businessTypeId;
	}

	public String getBusiId() {
		return busiId;
	}

	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}

	public String getBusiValue() {
		return busiValue;
	}

	public void setBusiValue(String busiValue) {
		this.busiValue = busiValue;
	}

	public DictVal() {
	}

	public DictVal(String businessTypeId, String busiId) {
		this.businessTypeId = businessTypeId;
		this.busiId = busiId;
	}
}
