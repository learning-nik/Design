package com.locker.domain;

public class Locker {

	private String id;

	private Location location;

	private LockerStatus status;

	private LockerSize size;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public LockerStatus getStatus() {
		return status;
	}

	public void setStatus(LockerStatus status) {
		this.status = status;
	}

	public LockerSize getSize() {
		return size;
	}

	public void setSize(LockerSize size) {
		this.size = size;
	}


	public enum LockerStatus {

		AVAILABLE, OCCUPIED;

	}

	public enum LockerSize {

		SMALL, MEDIUM, LARGE
	}

}
