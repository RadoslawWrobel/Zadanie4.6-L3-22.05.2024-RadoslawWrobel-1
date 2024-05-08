public class Student {

  private String Name;
  private String LastName; // Dodane
  private int AlbumNumber; // Dodane
  private int Age;

  public Student(String name, String lastName, int albumNumber, int age) { // Zmodyfikowane
    Name = name;
    LastName = lastName; // Dodane
    AlbumNumber = albumNumber; // Dodane
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetLastName() { return LastName; } // Dodane
  public int GetAlbumNumber() { return AlbumNumber; } // Dodane
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + LastName + " " + Integer.toString(AlbumNumber) + " " + Integer.toString(Age); // Zmodyfikowane
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4)  // Zmodyfikowane
      return new Student("Parse Error", "Parse Error", -1, -1); // Zmodyfikowane
    return new Student(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3])); // Zmodyfikowane
  }
}
