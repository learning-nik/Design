package com.locker.controller;

import com.locker.domain.Location;
import com.locker.domain.Locker;
import com.locker.service.LockerService;

public class LockerController {

	private LockerService lockerService = new LockerService();

	public Locker addLocker(Locker locker) {
		return lockerService.addLocker(locker);
	}

	public Locker getLockerByLocation(Location location) {

		return lockerService.getAvailableLockerByLocation(location);

	}

	public int assignLockerToOrder(String orderId, String lockerId) {

		return lockerService.assignLocker(orderId, lockerId);

	}

	public void getOrderFromLocker(String lockerId, int lockerCode) {

		lockerService.getOrderFromLocker(lockerId, lockerCode);
	}

}
