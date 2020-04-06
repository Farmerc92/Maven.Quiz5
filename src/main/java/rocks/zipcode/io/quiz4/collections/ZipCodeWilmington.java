package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private ArrayList<Student> cohort = new ArrayList<>();
    public void enroll(Student student) {
        cohort.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return cohort.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student s : cohort){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> map = new LinkedHashMap<>();
        for (Student s : cohort){
            map.put(s, s.getTotalStudyTime());
        }
        return map;
    }
}
