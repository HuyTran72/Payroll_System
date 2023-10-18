import java.util.Date;

public class Partime extends Intern {
    private int hoursWorkedPerWeek;

    public Partime(String lastName, String firstName, String IDNumber, Date birthDate, double hourlyRate, int hoursWorkedPerWeek) {
        super(lastName, firstName, IDNumber, birthDate, hourlyRate);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public double monthlyEarning() {
        return super.monthlyEarning() * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHours worked per month: " + hoursWorkedPerWeek * 4 +
                "\nMonthly Salary: " + monthlyEarning();
    }
}

