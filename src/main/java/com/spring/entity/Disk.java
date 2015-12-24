package com.spring.entity;

import java.sql.Timestamp;

public class Disk {
	private int id;
	private int hostId;
	private int readIops;
	private int writeIops;
	private int readRateMbytes;
	private int writeRateMbytes;
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
	public int getReadIops() {
		return readIops;
	}
	public void setReadIops(int readIops) {
		this.readIops = readIops;
	}
	public int getWriteIops() {
		return writeIops;
	}
	public void setWriteIops(int writeIops) {
		this.writeIops = writeIops;
	}
	public int getReadRateMbytes() {
		return readRateMbytes;
	}
	public void setReadRateMbytes(int readRateMbytes) {
		this.readRateMbytes = readRateMbytes;
	}
	public int getWriteRateMbytes() {
		return writeRateMbytes;
	}
	public void setWriteRateMbytes(int writeRateMbytes) {
		this.writeRateMbytes = writeRateMbytes;
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
