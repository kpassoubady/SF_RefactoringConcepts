package com.kavinschool.trip.service.refactored;

import com.kavinschool.trip.service.kata.exception.UserNotLoggedInException;
import com.kavinschool.trip.service.kata.trip.Trip;
import com.kavinschool.trip.service.kata.trip.TripDAO;
import com.kavinschool.trip.service.kata.user.User;

import java.util.ArrayList;
import java.util.List;

public class TripServiceRefactored {

	public List<Trip> getFriendTrips(User loggedUser, User friend) throws UserNotLoggedInException {
		validate(loggedUser);
		return (friend.isFriendsWith(loggedUser)) 
						? findTripsForFriend(friend)
					    : new ArrayList<Trip>();
	}

	private void validate(User loggedUser) throws UserNotLoggedInException {
		if (loggedUser == null) throw new UserNotLoggedInException();
	}

	protected List<Trip> findTripsForFriend(User friend) {
		return TripDAO.findTripsByUser(friend);
	}
}
