package Ex14;

public class Teacher {
    int id;
    String name;
    boolean academicDegree;

    public Teacher(int id, String name, boolean academicDegree) {
        this.id = id;
        this.name = name;
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher [have academicDegree=" + academicDegree + ", id=" + id + ", name=" + name + "]";
    }

}
