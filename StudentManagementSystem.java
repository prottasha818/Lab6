import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student(11234561, "Ayoishee", "IIT");
        Student s2 = new Student(12345671, "Miti", "CSE");
        Student s3 = new Student(98765431, "Irin", "EEE");
        Student s4 = new Student(11112222, "Usraat", "Fine arts");
        Student s5 = new Student(11114444, "Munni", "CSE");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        System.out.println("All Students:\n");
        for (Student student : students) {
            System.out.println(student);
        }

        Student newStudent = new Student(1234567, "Moneka", "ISRT");
        students.add(2, newStudent);

        System.out.println("After adding a student the list: ");
        for (Student student : students) {
            System.out.println(student);
        }
        students.remove(3);
        System.out.println("After removing a student the list: ");
        for (Student student : students) {
            System.out.println(student);
        }
        //Hashset
        Set<Student> enrolledstudents = new HashSet<>();
        enrolledstudents.addAll(students);


        boolean addedAgain = enrolledstudents.add(s1);
        System.out.println("Student 1 is added:" + (addedAgain ? "Yes" : "No"));


        boolean isEnrolled = enrolledstudents.contains(s2);
        System.out.println("Student 2 is Enrolled: " + (isEnrolled ? "Yes" : "No"));

        System.out.println("Enrolled students: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.getStudentID(), student);
        }

        // Retrieve a student by ID
        int searchId = 11114444;
        if (studentMap.containsKey(searchId)){
            Student found = studentMap.get(searchId);
            System.out.println("\nStudent found for ID " + searchId + ": " + found);
        }
        else {
            System.out.println("\nStudent with ID " + searchId + " not found.");
        }
    }
}