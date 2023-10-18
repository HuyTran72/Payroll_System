import java.util.Date;

class Intern extends Developer {
    private double hourlyRate;

    public Intern() {
    }

    public Intern(String lastName, String firstName, String IDNumber, Date birthDate, double hourlyRate) {
        super(lastName, firstName, IDNumber, birthDate);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double monthlyEarning() {
        return hourlyRate * DeveloperInfo.INTERN_MONTHLY_HOURS_WORKED;
    }

    public String toString() {
        return super.toString() + "\nMonthly Salary: " + monthlyEarning();
    }
}