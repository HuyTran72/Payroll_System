import java.util.Date;

interface DeveloperInfo {
    double DEV_MONTHLY_SALARY = 15000;
    int INTERN_MONTHLY_HOURS_WORKED = 150;
    double STOCKS_PER_MONTH = 2000;
}

abstract class Developer {
    private String lastName;
    private String firstName;
    private String IDNumber;
    private Date birthDate;

    public Developer(String lastName, String firstName, String IDNumber, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.IDNumber = IDNumber;
        this.birthDate = birthDate;
    }

    public abstract double monthlyEarning();

    public String toString() {
        return "ID Employee number: " + IDNumber +
                "\nEmployee name: " + firstName + " " + lastName +
                "\nBirth date: " + birthDate;
    }
}