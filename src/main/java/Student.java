public class Student extends Human {
    private String schoolName, rollNo;
    private int std;

    @Override
    public String toString() {
        return "No String for you";
    }

    public Student(int height, int weight, int age, String name, String gender, String dateOfBirth ) {
        super(height, weight, age, name, gender, dateOfBirth);
    }
}
