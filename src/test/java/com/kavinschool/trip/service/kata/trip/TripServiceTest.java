package com.kavinschool.trip.service.kata.trip;

import com.kavinschool.trip.service.kata.exception.UserNotLoggedInException;
import com.kavinschool.trip.service.kata.user.User;
import com.kavinschool.trip.service.refactored.TripServiceRefactored;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.kavinschool.trip.service.kata.trip.UserBuilder.anUser;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TripServiceTest {

    private final User NON_LOGGED_USER = null;
    private final User UNUSED_USER = new User();
    private final User LOGGED_USER = new User();

    private TripServiceRefactored tripService;

    @Before
    public void initialise() {
        tripService = createTripService();
    }

    @Test(expected = UserNotLoggedInException.class) public void
    shouldThrowExceptionIfUserIsNotLoggedIn() throws Exception {
        tripService.getFriendTrips(NON_LOGGED_USER, UNUSED_USER);
    }

    @Test public void
    shouldNotReturnTripsWhenLoggedUserIsNotAFriend() throws Exception {
        List<Trip> friendTrips = tripService.getFriendTrips(LOGGED_USER, anUser().build());

        assertTrue(friendTrips.isEmpty());
    }

    @Test public void
    shouldReturnTripsWhenLoggedUserIsAFriend() throws Exception {
        User john = anUser().friendsWith(LOGGED_USER)
                .withTrips(new Trip(), new Trip())
                .build();

        List<Trip> friendTrips = tripService.getFriendTrips(LOGGED_USER, john);

        assertThat(friendTrips, is(equalTo(john.trips())));
    }

    private TripServiceRefactored createTripService() {
        return new TripServiceRefactored() {
            @Override
            protected List<Trip> findTripsForFriend(User user) {
                return user.trips();
            }
        };
    }
}