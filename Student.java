public class Student {
  private String firstName;
  private String lastName; 
  private int grade; 
  public static int totalStudents;

  public Student(String fName, String lName, int grade)
  {
        firstName = firstName;
        lastName = lastName;
        this.grade = grade;
	totalStudents++;
  }

  public String toString()
  {
       return firstName + " " + lastName;
  }

  public int getGrade()
  {
	return grade;
  }

    
}
