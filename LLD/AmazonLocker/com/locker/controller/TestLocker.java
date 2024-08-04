package com.locker.controller;

import com.locker.domain.Locker;
import com.locker.domain.Location;
import com.locker.domain.Locker.LockerSize;
import com.locker.domain.Locker.LockerStatus;

public class TestLocker {

	private static LockerController lockerController = new LockerController();

	public static void main(String[] args) {

		System.out.println("I AM HERE");

		// Add lockers

		lockerController.addLocker(buildLocker());
		lockerController.addLocker(buildLocker());

		// Find Locker for a order

		final Locker availableLocker = lockerController.getLockerByLocation(new Location(123.01d, 112.67d));

		// Assign Locker to a order

		final int lockerCode = lockerController.assignLockerToOrder("123", availableLocker.getId());

		// Take Order from a locker
		
		

		// Expire items from a locker

		//

	}

	private static Locker buildLocker() {

		Locker locker = new Locker();
		locker.setStatus(LockerStatus.AVAILABLE);
		locker.setSize(LockerSize.SMALL);

		Location location = new Location(123.01d, 112.67d);
		locker.setLocation(location);
		return locker;
	}

}
