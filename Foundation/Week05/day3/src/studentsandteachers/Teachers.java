package studentsandteachers;

public class Teachers {
  private String nameOfTeacher;

  public Teachers (String nameOfTeacher) {
    this.nameOfTeacher = nameOfTeacher;
  }

  public void answer(String nameOfTeacher) {
    System.out.println(nameOfTeacher + ", the teacher, is answering the question");
  }

  public void teach(String nameOfStudent) {
    Students student = new Students(nameOfStudent);
      student.learn(nameOfStudent);
  }
}
