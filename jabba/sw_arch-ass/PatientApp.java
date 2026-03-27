// PatientApp - this is the main class to test everything
// Creates some Patient objects and prints their info and BMI

package testdate;

public class PatientApp {

    public static void main(String[] args) {

        System.out.println("===== Patient Record System =====\n");

        // creating patient 1 using the constructor with all parameters
        Date dob1 = new Date(1990, 4, 15);
        Patient p1 = new Patient("Sarah Murphy", dob1, 1.65f, 68.0f);

        // patient 2, this one should come out overweight in BMI
        Date dob2 = new Date(1985, 11, 3);
        Patient p2 = new Patient("James O'Brien", dob2, 1.78f, 92.5f);

        // patient 3 - using default constructor first, then setting values one by one
        // this tests that setters work properly
        Patient p3 = new Patient();
        p3.setName("Emily Clarke");
        p3.setDateOfBirth(new Date(2001, 7, 22));
        p3.setHeight(1.55f);
        p3.setWeight(48.0f);   // she is underweight based on BMI

        // patient 4, this one should be obese category
        Date dob4 = new Date(1975, 2, 9);
        Patient p4 = new Patient("Tom Walsh", dob4, 1.70f, 105.0f);

        // put all patients in array so we can loop through them easy
        Patient[] patients = { p1, p2, p3, p4 };

        for (Patient p : patients) {
            System.out.println("---------------------------------");

            // print all attributes first before we calculate anything
            System.out.println(p.toString());

            // now calculate BMI
            float bmi = p.calculateBMI();

            // figure out which category this BMI falls into
            // ranges are taken from the table in the assignment brief
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            System.out.printf("BMI:           %.2f%n", bmi);  // two decimal places
            System.out.println("Category:      " + category);
            System.out.println();
        }

        // now testing the Date validation to make sure bad inputs are rejected
        System.out.println("=================================");
        System.out.println("Date Validation Tests:\n");

        // test 1 - both values completely wrong
        System.out.println("Test 1 - month 13 and day 45:");
        Date t1 = new Date(2020, 13, 45);
        System.out.println("Result: " + t1 + "\n");

        // test 2 - february doesnt have 31 days ever
        System.out.println("Test 2 - 31st February 2021 (not a leap year):");
        Date t2 = new Date(2021, 2, 31);
        System.out.println("Result: " + t2 + "\n");

        // test 3 - 2020 is a leap year so 29 february should be accepted
        System.out.println("Test 3 - 29th February 2020 (leap year, should work):");
        Date t3 = new Date(2020, 2, 29);
        System.out.println("Result: " + t3 + "\n");

        // test 4 - april only has 30 days so 31 should be rejected
        System.out.println("Test 4 - 31st April 2022:");
        Date t4 = new Date(2022, 4, 31);
        System.out.println("Result: " + t4);
    }
}
