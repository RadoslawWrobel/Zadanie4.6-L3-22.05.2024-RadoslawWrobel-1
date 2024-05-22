public class Service {
  public void addStudent(Student student) throws IOException {
    var f = new FileWriter("db.txt", true);
    var b = new BufferedWriter(f);
    b.append(student.ToString());
    b.newLine();
    b.close();
  }
  public Collection<Student> getStudents() throws IOException {
    var ret = new ArrayList<Student>();
    var f = new FileReader("db.txt");
    var reader = new BufferedReader(f);
    String line = "";
    while (true) {
      line = reader.readLine();
      if(line == null)
        break;
      ret.add(Student.Parse(line));
    }
    reader.close();
    return ret;
  }
  public void addStudent(String imie, String nazwisko, int albumNumber, int age, String DataUrodzenia) throws IOException {
    if (!DataUrodzenia.matches("^(\\d{2}).(\\d{2}).(\\d{4})$")) {
      System.out.println("Nieprawidłowy format daty. Wprowadź datę w formacie DD.MM.RRRR.");
      return;
    }
    var f = new FileWriter("db.txt", true);
    var b = new BufferedWriter(f);
    b.append(imie + " " + nazwisko + " " + albumNumber + " " + age + " " + DataUrodzenia);
    b.newLine();
    b.close();
    System.out.println("Nowy student został dodany.");
  }
  public Student findStudentByName(String name) {
    return null;
  }
}