package src.edu.hogwarts.application;
import src.edu.hogwarts.data.HogwartsPerson;
import src.edu.hogwarts.data.HogwartsStudent;

import java.util.*;

public class StudentController {
    private int lastId = 0;
    private final Map<Integer, HogwartsStudent> mapOfHogwartsStudent = new HashMap<>();

    public HogwartsStudent createHogwartsStudent(HogwartsStudent receivedHogwartsStudent){
        HogwartsStudent hogwartsStudent = new HogwartsStudent(receivedHogwartsStudent);
        hogwartsStudent.setId(lastId++);
        mapOfHogwartsStudent.put(hogwartsStudent.getId(), hogwartsStudent);
        return hogwartsStudent;
    }

    public HogwartsStudent getHogwartsStudent(int id) {
        return mapOfHogwartsStudent.get(id);
    }

    public void updateHogwartsStudent(int id, HogwartsStudent updatedHogwartsStudent) {
        if (mapOfHogwartsStudent.containsKey(id)) {
            mapOfHogwartsStudent.put(id, updatedHogwartsStudent);
        }
    }

    public void deleteHogwartsStudent(int id) {
        mapOfHogwartsStudent.remove(id);
    }

    public Collection<HogwartsStudent> getAllHogwartsStudent() {
        return new ArrayList<>(mapOfHogwartsStudent.values());
    }

    public List<HogwartsStudent> sortStudents(Comparator<HogwartsPerson> comparator){
        List<HogwartsStudent> list = new ArrayList<>(mapOfHogwartsStudent.values());
        list.sort(comparator);
        return list;
    }
}
