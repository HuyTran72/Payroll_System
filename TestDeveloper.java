import java.util.Date;

public class TestDeveloper {
    public static void main(String[] args) {
        Developer[] developers = new Developer[3];

        Education education = new Education("BS", "Software Engineering");

        developers[0] = new Intern("De Gea", "David", "1111", new Date(), 18);
        developers[1] = new SDE("Mpappe", "Killian", "2222", new Date(), SDE.Level.II, education);
        developers[2] = new Partime("Reus", "Marco", "3333", new Date(), 16, 15);

        for (Developer developer : developers) {
            System.out.println(developer.toString());
        }
    }
}
