public class Human {
    private int height, weight, age;
    private String name, gender;
    private String dateOfBirth;

    public Human(int height, int weight, int age, String name, String gender, String dateOfBirth) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "height = " + height + ", weight= " + weight + ", age = " + age + ", name= '" + name + ", gender= '" + gender + ", dateOfBirth= '" + dateOfBirth;
    }

    public static void main(String[] args) {
        Human human1 = new Human(10, 10, 10, "Test Name", "Male", "10-10-10");
        Student student = new Student(10, 10, 10, "Test Name", "Male","");
        System.out.println(human1);
        System.out.println(student);
    }
}
