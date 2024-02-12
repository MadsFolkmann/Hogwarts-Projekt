package src.edu.hogwarts.application;
import src.edu.hogwarts.data.HogwartsPerson;
import src.edu.hogwarts.data.HogwartsStudent;
import src.edu.hogwarts.data.HogwartsTeacher;

import java.util.*;

public class TeacherController {
    private int lastId = 0;
    private final Map<Integer, HogwartsTeacher> mapOfHogwartsTeacher = new HashMap<>();

    public HogwartsTeacher createHogwartsTeacher(HogwartsTeacher receivedHogwartsTeacher) {
        HogwartsTeacher hogwartsTeacher = new HogwartsTeacher(receivedHogwartsTeacher);
        hogwartsTeacher.setId(lastId++);
        mapOfHogwartsTeacher.put(hogwartsTeacher.getId(), hogwartsTeacher);
        return hogwartsTeacher;
    }

    public HogwartsTeacher getHogwartsTeacher(int id) {
        return mapOfHogwartsTeacher.get(id);
    }

    public void updateHogwartsTeacher(int id, HogwartsTeacher updatedHogwartsTeacher) {
        if (mapOfHogwartsTeacher.containsKey(id)) {
            mapOfHogwartsTeacher.put(id, updatedHogwartsTeacher);
        }
    }

    public void deleteHogwartsTeacher(int id) {
        mapOfHogwartsTeacher.remove(id);
    }

    public Collection<HogwartsTeacher> getAllHogwartsTeachers() {
        return new ArrayList<>(mapOfHogwartsTeacher.values());
    }

    public List<HogwartsTeacher> sortTeachers(Comparator<HogwartsPerson> comparator){
        List<HogwartsTeacher> list = new ArrayList<HogwartsTeacher>(mapOfHogwartsTeacher.values());
        list.sort(comparator);
        return list;
    }
}
