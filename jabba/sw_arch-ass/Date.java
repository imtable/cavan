// This is Date class. It keeps day, month and year of a date.

package testdate;

public class Date {

    // three variables to store the date
    private int year, month, day;

    // this constructor takes year month and day and saves them
    // I call setMonth and setDay here so validation runs automatic
    public Date(int year, int month, int day) {
        this.year = year;
        setMonth(month);   // month must go first before day check
        setDay(day);       // day check needs month to be already set
    }

    // default constructor, just sets some safe date so nothing breaks
    public Date() {
        this.year = 2000;
        this.month = 1;
        this.day = 1;
    }

    // this method returns how many days the current month actually has
    // needed so we dont accept day 31 in april for example
    private int daysInMonth() {
        switch (month) {
            case 2:
                // february is special because of leap years
                // leap year = can divide by 4, but not by 100, unless also by 400
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;  // leap year, february has 29 days
                } else {
                    return 28;  // normal year
                }
            case 4: case 6: case 9: case 11:
                return 30;  // april june september november have 30
            default:
                return 31;  // all the rest have 31
        }
    }

    // getters just return the value, nothing special
    public int getYear()  { return this.year; }
    public int getMonth() { return this.month; }
    public int getDay()   { return this.day; }

    public void setYear(int year) {
        this.year = year;
    }

    // month must be between 1 and 12, otherwise we set it to 1
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            // bad month value, print message and use 1 instead
            System.out.println("Invalid month: " + month + ". Month set to 1.");
            this.month = 1;
        }
    }

    // day must fit into the month, for example february cant have 30 days
    public void setDay(int day) {
        if (day >= 1 && day <= daysInMonth()) {
            this.day = day;
        } else {
            // day doesnt fit this month so we set to 1 and tell user
            System.out.println("Invalid day: " + day + " for " + month + "/" + year + ". Day set to 1.");
            this.day = 1;
        }
    }

    // this method lets you change all three fields at same time
    // also uses setters so validation still works
    public void setDate(int year, int month, int day) {
        this.year = year;
        setMonth(month);
        setDay(day);
    }

    // returns date as string, format is MM/DD/YYYY with zeros in front if needed
    public String toString() {
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}
