package com.locker.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.locker.domain.Location;
import com.locker.domain.Locker;
import com.locker.domain.Locker.LockerStatus;
import com.locker.domain.LockerEntry;

public class LockerService {

	private List<Locker> lockerList = new ArrayList<>();

	private List<LockerEntry> lockerEntryList = new ArrayList<>();

	public Locker addLocker(Locker locker) {

		locker.setId(UUID.randomUUID().toString());
		lockerList.add(locker);
		return locker;

	}

	// locker whos's status is available and are the same location.
	public Locker getAvailableLockerByLocation(Location location) {

		return lockerList.stream().filter(
				locker -> locker.getLocation().equals(location) && locker.getStatus().equals(LockerStatus.AVAILABLE))
				.findFirst().get();

	}

	// assign locker to an order.
	public int assignLocker(String orderId, String lockerId) {

		// validate lockerDetails

		validateBeforeAssigningLocker(orderId, lockerId);

		// add locker to the lockerEntryList

		LockerEntry lockerEntry = new LockerEntry();
		lockerEntry.setLockerId(lockerId);
		lockerEntry.setOrderId(orderId);
		lockerEntry.setAssignedAt(System.currentTimeMillis());

		long numOfMillIn3Days = 3 * 3600 * 1000;

		lockerEntry.setAssignedTill(System.currentTimeMillis() + numOfMillIn3Days);

		lockerEntry.setLockerCode(1);

		lockerEntryList.add(lockerEntry);

		// change locker status to not available in lockerList

		for (Locker locker : lockerList) {
			if (locker.getId().equals(lockerId)) {
				locker.setStatus(LockerStatus.OCCUPIED);
				break;
			}
		}

		// give code back to user

		return 1;

	}
	
	// unlock locker and get order.
	
	public void getOrderFromLocker(String lockerId , int lockerCode) {
		
		// validate the locker code 
		
		// open the locker .
		
		// change the locker status
		
	}

	// check if locker is available
	// check if orderSize and lockerSize match

	private void validateBeforeAssigningLocker(String orderId, String lockerId) {

		Locker locker = lockerList.stream().filter(l -> l.getId().equals(lockerId)).findFirst().get();
		if (!locker.getStatus().equals(LockerStatus.AVAILABLE)) {

			throw new RuntimeException("Locker is not Available");
		}

		// getOrder Details and if (locker.getSize< order.getSize()) 
		// throw exception.

	}

}
