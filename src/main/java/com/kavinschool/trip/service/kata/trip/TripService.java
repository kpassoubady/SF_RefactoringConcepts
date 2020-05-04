package com.kavinschool.trip.service.kata.trip;

import com.kavinschool.trip.service.kata.exception.UserNotLoggedInException;
import com.kavinschool.trip.service.kata.user.User;
import com.kavinschool.trip.service.kata.user.UserSession;

import java.util.ArrayList;
import java.util.List;

//Hard dependencies example
public class TripService {

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
        List<Trip> tripList = new ArrayList<Trip>();
        // dependency 1
        User loggedUser = UserSession.getInstance().getLoggedUser();
        boolean isFriend = false;
        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend.equals(loggedUser)) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend) {
                // dependency 2
                tripList = TripDAO.findTripsByUser(user);
            }
            return tripList;
        } else {
            throw new UserNotLoggedInException();
        }
    }
}
