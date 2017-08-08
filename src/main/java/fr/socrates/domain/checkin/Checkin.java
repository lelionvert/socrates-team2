package fr.socrates.domain.checkin;

import java.util.*;

/**
 * Created by lenovo_14 on 08/08/2017.
 */
public class Checkin {

    private static final int COLD_FOOD_HOUR = 21;
    List coldFood = new ArrayList();

    public List getColdFoodCount() {
        return coldFood;
    }

    public void addCheckinParticipant(Date entranceDate, int participantID) {

        Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
        calendar.setTime(entranceDate);   // assigns calendar to given date
        if (calendar.get(Calendar.HOUR_OF_DAY) > COLD_FOOD_HOUR) {
            coldFood.add(participantID);
        }


    }
}
