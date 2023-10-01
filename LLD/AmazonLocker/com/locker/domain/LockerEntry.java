package com.locker.domain;

public class LockerEntry {

	private String orderId;

	private String lockerId;

	private long assignedAt;

	private long assignedTill;

	private int lockerCode;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getLockerId() {
		return lockerId;
	}

	public void setLockerId(String lockerId) {
		this.lockerId = lockerId;
	}

	public long getAssignedAt() {
		return assignedAt;
	}

	public void setAssignedAt(long assignedAt) {
		this.assignedAt = assignedAt;
	}

	public long getAssignedTill() {
		return assignedTill;
	}

	public void setAssignedTill(long assignedTill) {
		this.assignedTill = assignedTill;
	}

	public int getLockerCode() {
		return lockerCode;
	}

	public void setLockerCode(int lockerCode) {
		this.lockerCode = lockerCode;
	}

}
