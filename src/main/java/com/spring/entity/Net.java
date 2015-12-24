package com.spring.entity;

import java.sql.Timestamp;

public class Net {
	private int id;
	private int hostId;
	private int rxRateKbytes;
	private int txRateKbytes;	
	private Timestamp createdAt;
	private Timestamp updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHostId() {
		return hostId;
	}
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	public int getRxRateKbytes() {
		return rxRateKbytes;
	}
	public void setRxRateKbytes(int rxRateKbytes) {
		this.rxRateKbytes = rxRateKbytes;
	}
	public int getTxRateKbytes() {
		return txRateKbytes;
	}
	public void setTxRateKbytes(int txRateKbytes) {
		this.txRateKbytes = txRateKbytes;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
