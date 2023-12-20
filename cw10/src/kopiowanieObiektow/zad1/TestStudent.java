package kopiowanieObiektow.zad1;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("ala", 21, 4.5);
        Student student1 = student.clone();
        System.out.println(student);
        System.out.println(student1);

        student1.setGrade(3.5);
        System.out.println(student);
        System.out.println(student1);
    }
}
