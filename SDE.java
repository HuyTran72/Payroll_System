import java.util.Date;

public class SDE extends Developer {
    public enum Level {
        I, II, III
    }

    private Level level;
    private Education education;

    public SDE(String lastName, String firstName, String IDNumber, Date birthDate, Level level, Education education) {
        super(lastName, firstName, IDNumber, birthDate);
        this.level = level;
        this.education = education;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public double monthlyEarning() {
        double baseSalary;
        switch (level) {
            case I:
                baseSalary = DeveloperInfo.DEV_MONTHLY_SALARY;
                break;
            case II:
                baseSalary = DeveloperInfo.DEV_MONTHLY_SALARY * 1.5;
                break;
            case III:
                baseSalary = DeveloperInfo.DEV_MONTHLY_SALARY * 2.0;
                break;
            default:
                throw new IllegalArgumentException("Invalid level");
        }
        return baseSalary + DeveloperInfo.STOCKS_PER_MONTH;
    }

    public String toString() {
        return super.toString() + "\nMonthly Salary: " + monthlyEarning();
    }
}
