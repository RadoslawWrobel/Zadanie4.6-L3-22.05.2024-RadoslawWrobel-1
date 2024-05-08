public class Student {

  private String Name;
  private String LastName;
  private int AlbumNumber;
  private int Age;

  public Student(String name, String lastName, int albumNumber, int age) {
    Name = name;
    LastName = lastName;
    AlbumNumber = albumNumber;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetLastName() { return LastName; }
  public int GetAlbumNumber() { return AlbumNumber; }
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + LastName + " " + Integer.toString(AlbumNumber) + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4)
      return new Student("Parse Error", "Parse Error", -1, -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]));
  }
}
