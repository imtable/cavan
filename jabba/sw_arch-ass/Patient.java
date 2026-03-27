// Patient class - stores information about one patient
// Based on the UML diagram from the assignment

package testdate;

public class Patient {

    // all variables are private so you cant change them directly from outside
    private String fullName;
    private Date dateOfBirth;
    private float height;   // height in metres
    private float weight;   // weight in kilograms

    // default constructor, sets some placeholder values so object is not empty
    public Patient() {
        fullName = "Unknown";
        dateOfBirth = new Date();  // uses default date which is 01/01/2000
        height = 0.0f;
        weight = 0.0f;
    }

    // second constructor, you pass all four values when creating the patient
    public Patient(String n, Date dob, float h, float w) {
        fullName = n;
        dateOfBirth = dob;
        height = h;
        weight = w;
    }

    // setters - just store the value that comes in
    public void setName(String s) {
        fullName = s;
    }

    public void setDateOfBirth(Date dob) {
        dateOfBirth = dob;
    }

    public void setHeight(float h) {
        height = h;
    }

    public void setWeight(float w) {
        weight = w;
    }

    // getters - just return the stored value
    public String getName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    // calculates BMI using formula from the assignment: weight / (height * height)
    public float calculateBMI() {
        // if height is 0 we cant divide, so return 0 to avoid crash
        if (height == 0) {
            return 0;
        }
        return weight / (height * height);
    }

    // returns all four patient fields as one string, used to print patient info
    public String toString() {
        return "Name:          " + fullName +
               "\nDate of Birth: " + dateOfBirth.toString() +
               "\nHeight:        " + height + "m" +
               "\nWeight:        " + weight + "kg";
    }
}
