package com.javawit.calculator;


class Response
{
	private String status;
	private String result;
	private long transid;
	public String getStatus() {
	return status;
	}
	public void setStatus(String status) {
	this.status = status;
	}
	public String getResult() {
	return result;
	}
	public void setResult(String result) {
	this.result = result;
	}
	public long getTransid() {
	return transid;
	}
	public void setTransid(long transid) {
	this.transid = transid;
	}
}