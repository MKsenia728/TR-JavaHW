package hw221012;

public class Timer {

    int SECONDSINDAY = 24;
    int STARTWORKTIME = 9;
    int ENDWORKTIME = 17;

    private int counterSec(int hour,int min,int sec) {
        return sec + min * 60 + hour * 60 * 60;
    }

    private boolean isItTime(String timeString) {
        if ((timeString.length() == 8) && (timeString.charAt(2) == ':' && timeString.charAt(5) == ':') && (convertFromStringToSeconds(timeString) <= counterSec(SECONDSINDAY,0,0))){
            return true;
        }
        System.out.println("Неверно задано время");
        return false;
    }

    private boolean isItWorkTime(String timeString) {
        if (isItTime(timeString)) {
            if (convertFromStringToSeconds(timeString) >= counterSec(STARTWORKTIME,0,0) && convertFromStringToSeconds(timeString) <= counterSec(ENDWORKTIME,0,0)) {
                return true;
            } else {
                System.out.println("Заданное время не в рабочем диапазоне, отдыхайте!");
            }
        }
        return false;
    }

    private int convertFromStringToSeconds(String timeString) {
        int hour = Integer.valueOf(timeString.substring(0,2));
        int min = Integer.valueOf(timeString.substring(3,5));
        int sec = Integer.valueOf(timeString.substring(6));
        return counterSec(hour,min,sec);
    }

    public int counterSecToWorkEnd (String timeString) {
        if (isItWorkTime(timeString)) {
            return counterSec(ENDWORKTIME,0,0) - convertFromStringToSeconds(timeString);
        }
        System.out.println("Начинайте все с начала.");
        return -1;
    }
}
