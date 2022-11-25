package utils.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManageEmailTestAddresses {

    public String createEmailTestAddress(String emailAddress) {
        return splitEmailAddress(emailAddress) + currentDate() + "@flexshopper.com";
    }

    public String splitEmailAddress(String emailAddress) {
        String[] emailAddressSplit = emailAddress.split("@");
        String userName = emailAddressSplit[0];
        System.out.println("userName recovers: " + userName);
        return userName;
    }

    public String currentDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yymmddhhmm");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
        return strDate;
    }
}
