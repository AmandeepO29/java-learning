package ClassAndObject;

public class Course {
    static int maxCapacity =100;
    String courseName;
    int enrollments;
    String [] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments]= studentName;
        enrollments++;
    }
    void unenrollStudents(String studentName){
        int j = -1;
        for(int i=0;i<enrollments;i++)
        {
            if(studentName.equals(enrolledStudents[i]));

            // here we cannot use studentName==enrolledStudents[i] !!!!!!
            
            j=i;
            break;
        }
        for (int k=j;k<enrollments-1;k++){
            enrolledStudents[k]=enrolledStudents[k+1];
        }
        enrollments-- ;
    }
}
