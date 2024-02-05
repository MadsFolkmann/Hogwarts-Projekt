import java.util.Arrays;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] students;
    private TeachingMaterial[] materials;

    public Course(Subject subject, Teacher teacher, Student[] students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Course:\n");
        result.append("Subject: ").append(subject.getName()).append("\n");
        result.append("Teacher: ").append(teacher.getFullName()).append("\n");
        result.append("Students: ").append(Arrays.toString(students)).append("\n");
        result.append("Materials: ").append(Arrays.toString(materials)).append("\n");
        return result.toString();
    }
}
