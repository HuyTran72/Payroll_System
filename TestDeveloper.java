public class TestDeveloper {
    public static void main(String[] args) {
        Developer[] developers = new Developer[3];

        Education education = new Education("MS", "Computer Science");

        developers[0] = new Intern("Doe", "John", "123", new Date(), 20);
        developers[1] = new SDE("Smith", "Alice", "456", new Date(), SDE.Level.II, education);
        developers[2] = new Partime("Johnson", "Robert", "789", new Date(), 15, 20);

        for (Developer developer : developers) {
            System.out.println(developer.toString());
        }
    }
}
