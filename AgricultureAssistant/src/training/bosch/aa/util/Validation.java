package training.bosch.aa.util;


import java.sql.Date;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    private String username;
    private String password;
    private String role;

    public static boolean validateForLogin(String un, String pw) {
        Pattern pForUn =
            Pattern.compile("\\D([a-z]|[A-Z]|[0-9])*"); //First char not digit, rest can be anything
        Matcher mun = pForUn.matcher(un);
        boolean bun = mun.matches();

        Pattern pForPw =
            Pattern.compile("([a-z]|[A-Z]|[0-9])*"); //First char not digit, rest can be anything
        Matcher mpw = pForPw.matcher(pw);
        boolean bpw = mpw.matches();
        return bun && bpw;
    }

    public static boolean validateForCreateUsers(String un, String pw)
    {
        boolean a = Validation.validateForLogin(un, pw);
		return a;
       


    }
    public static boolean validateForPersonalInfo(String name, String phone,
            String un, String pw) {
boolean a = Validation.validateForLogin(un, pw);
Pattern pForName =
Pattern.compile("([a-z]|[A-Z])*"); //First char not digit, rest can be anything
Matcher mun = pForName.matcher(name);
boolean bname = mun.matches();

Pattern pForPh =
Pattern.compile("([0-9]{10})|([0-9]{4}-[0-9]{8})"); //First char not digit, rest can be anything
Matcher mph = pForPh.matcher(phone);
boolean bph = mph.matches();
return bname && bph && a;


}


    public static boolean validateDate(Date date) {
        Pattern pForDate = Pattern.compile("DD-MM-YYYY");
        
                
        Matcher mdate = pForDate.matcher(String.valueOf(date));
        boolean bdate = mdate.matches();


        return bdate;

    }

    public static boolean validateTime(Date time) {

        Pattern pForTime = Pattern.compile("HOUR:MINUTE:SECONDS PM");
        Matcher mtime = pForTime.matcher(String.valueOf(time));
        boolean btime = mtime.matches();

        return btime;

    }


}

