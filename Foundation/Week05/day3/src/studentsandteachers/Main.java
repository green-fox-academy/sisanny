package studentsandteachers;

public class Main {
  public static void main(String[] args) {
    Teachers teacher = new Teachers("Riel");
    Students student = new Students("Anna");
    student.question("Riel");
    teacher.teach("Anna");
  }
}
