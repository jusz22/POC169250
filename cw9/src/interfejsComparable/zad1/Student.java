package interfejsComparable.zad1;

public class Student implements Comparable<Student>{
    private String name;
    private double avgGrade;
    private int yearOfBirth;

    public Student(String name, double avgGrade, int yearOfBirth) {
        this.name = name;
        this.avgGrade = avgGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avgGrade=" + avgGrade +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        return Double.compare(this.avgGrade, obj.avgGrade);
    }
}
