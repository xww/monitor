package com.spring.entity;

import java.sql.Timestamp;

public class AlarmDetail {	
	private int id;
	private int hostId;
	private int alarmRuleId;
	private String alarmRuleName;
	private String status;
	private String opratorIp;
	private String alarmLevel;
	private Host host;
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
	public int getAlarmRuleId() {
		return alarmRuleId;
	}
	public void setAlarmRuleId(int alarmRuleId) {
		this.alarmRuleId = alarmRuleId;
	}
	public String getAlarmRuleName() {
		return alarmRuleName;
	}
	public void setAlarmRuleName(String alarmRuleName) {
		this.alarmRuleName = alarmRuleName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOpratorIp() {
		return opratorIp;
	}
	public void setOpratorIp(String opratorIp) {
		this.opratorIp = opratorIp;
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
	public String getAlarmLevel() {
		return alarmLevel;
	}
	public void setAlarmLevel(String alarmLevel) {
		this.alarmLevel = alarmLevel;
	}
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	
	
}
