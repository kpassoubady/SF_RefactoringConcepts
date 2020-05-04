package com.kavinschool.trip.service.kata.trip;

import com.kavinschool.trip.service.kata.exception.DependendClassCallDuringUnitTestException;
import com.kavinschool.trip.service.kata.user.User;

import java.util.List;

public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new DependendClassCallDuringUnitTestException(
				"TripDAO should not be invoked on an unit test.");
	}
	
}