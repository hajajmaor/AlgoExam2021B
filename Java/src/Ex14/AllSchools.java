package Ex14;

import java.util.Arrays;

public class AllSchools {
    School[] schools;

    public AllSchools(School[] schools) {
        this.schools = schools;
    }

    public void printWhereTecherTeach(int teachId) {
        for (School school : schools) {
            if (school.isTeacherInSchool(teachId)) {
                System.out.println(school.schoolName);
            }
        }
    }

    public String printMostDegreeadedSchool() {
        School tempSchool = this.schools[0];
        int max = tempSchool.countHowMuchTeachersHaveDegree();
        int temp;
        for (int i = 1; i < schools.length; i++) {
            temp = this.schools[i].countHowMuchTeachersHaveDegree();
            if (temp > max) {
                max = temp;
                tempSchool = this.schools[i];
            }
        }
        return tempSchool.schoolName;
    }

    @Override
    public String toString() {
        return "AllSchools [Schools=" + Arrays.toString(schools) + "]";
    }

}