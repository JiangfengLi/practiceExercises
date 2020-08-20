package practiceOOP;

/** A class that represents a student that has a name and an id */
public class Student implements Comparable<Student> { // compares students based on name
    // Instance variables:
    private String name; // student's name
    private int id; // student's id

    /**
     * Constructor for class Student
     * @param name name of the student
     * @param id integer id of the student
     */
    public Student(String name, int id) {
        // TODO: initialize instance variables name and id
        this.name = name;
        this.id = id;
    }

    /*
     * Getter for the name
     * @return name of the student
     */
    public String getName() {
        // TODO: return name
        return name; // change
    }

    /**
     * Getter for the id
     * @return student id
     */
    public int getId() {
        // TODO: return id
        return id; // change
    }

    /**
     * Return a string representation of the student
      * @return string that contains name and id, separated by comma
     */
    public String toString() {
        // TODO: return a string that contains the name and the id,
        // separated by comma
        return name + "," + id; // remember to change this
    }

    /**
     * Compares this student with the otherStudent by name. If names are equal, compares by id.

     * @param otherStudent another student
     * @return a negative number if this.name comes before otherStudent's name in English alphabet,
     *           or if the names are equal and this.id < otherStudent.id
     *         0, if names are the same and ids are the same
     *         a positive number if this.name comes after otherStudents's name or if the names are the same,
     *           and this.id > otherStudent.id
     */
    public int compareTo(Student otherStudent) {
        // TODO:  compare students by name
        // HINT: use String's compareTo method to do the comparison in one line
        int comp = this.name.compareTo(otherStudent.name);
        if(comp != 0) return comp;
        // TODO: if names are same, compare by id
        return this.id - otherStudent.id; // remember to change this
    }
}
