import java.util.Objects;

public class Student {

       private int studentID;
       private String studentName;
       private String major;

    public int getStudentID() {
        return studentID;
    }
    public String getMajor() {
        return major;
    }
    public String getStudentName() {
        return studentName;
    }
     public Student(int studentID, String studentName, String major){
        this.studentID=studentID;
        this.studentName=studentName;
        this.major=major;
     }

    @Override
    public String toString() {
        return "Student ID: "+studentID+"\nStudent Name: "+studentName+"\nMajor:"+major;
    }
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null || getClass()!=obj.getClass())
            return false;
        Student other=(Student)obj;
        return this.studentID==other.studentID;
    }

    public int hashCode() {
        return Objects.hash(studentID);
    }


}
