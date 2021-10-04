package Ex14;

import java.util.Arrays;

public class School {
    int id;
    Teacher[] teachers;
    String schoolName;
    String managerName;

    public School(int id, Teacher[] teachers, String schoolName, String managerName) {
        this.id = id;
        this.teachers = teachers;
        this.schoolName = schoolName;
        this.managerName = managerName;
    }

    public boolean isTeacherInSchool(Teacher t) {
        for (Teacher tempCher : teachers) {
            if (tempCher.id == t.id) {
                return true;
            }
        }
        return false;
    }

    public boolean isTeacherInSchool(int teacherID) {
        for (Teacher tempCher : teachers) {
            if (tempCher.id == teacherID) {
                return true;
            }
        }
        return false;
    }

    public int countHowMuchTeachersHaveDegree() {
        int counter = 0;
        for (Teacher t : teachers) {
            if (t.academicDegree) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "School [id=" + id + ", managerName=" + managerName + ", schoolName=" + schoolName + ", teachers="
                + Arrays.toString(teachers) + "]";
    }

}
