package utils.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ManageEmailTestAddresses {

    public String createEmailTestAddress(String emailAddress) {
        if(emailAddress.contains("approve")) {
            return currentDate() + ".approve@flexshopper.com";
        }

        if (emailAddress.contains("deny")) {
            return currentDate() + ".deny@flexshopper.com";
        }

        if (emailAddress.contains("qamanual")) {
            return currentDate() + ".qamanual@flexshopper.com";
        }

        return splitEmailAddress(emailAddress) + currentDate() + ".approve@flexshopper.com";
    }

    public String splitEmailAddress(String emailAddress) {
        String[] emailAddressSplit = emailAddress.split("@");
        String userName = emailAddressSplit[0];
        System.out.println("userName recovers: " + userName);
        return userName;
    }

    public String currentDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("mmddhhmmss");
        String strDate = dateFormat.format(date);
        System.out.println("Converted String: " + strDate);
        return strDate;
    }
}
