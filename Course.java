import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] students;
    private List<TeachingMaterial> materials;

    public Course(Subject subject, Teacher teacher, Student[] students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = new ArrayList<>(Arrays.asList(materials));
    }
    public Course(Subject subject, Student[] students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = null;
        this.students = students;
        this.materials = new ArrayList<>(Arrays.asList(materials));
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

    public List<TeachingMaterial> getMaterials() {
        return materials;
    }
        public void addTeachingMaterial(TeachingMaterial material) {
        materials.add(material);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Course:\n");
        result.append("Subject: ").append(subject.getName()).append("\n");
        if (teacher != null) {
            result.append("Teacher: ").append(teacher.getFullName()).append("\n");
        } else {
            result.append("Teacher: No teacher assigned\n");
        }
        result.append("Students: ").append(Arrays.toString(students)).append("\n");
        result.append("Materials: ").append(materials).append("\n");
        return result.toString();
    }
}
