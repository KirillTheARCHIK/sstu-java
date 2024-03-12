package app;

public class Name {
  final String firstName;
  String lastName;
  String patronymic;

  public Name(String firstName) throws Exception {
    if (firstName == null || firstName == "") {
      throw new Exception();
    }
    this.firstName = firstName;
  }

  public Name(String firstName, String lastName) throws Exception {
    this(firstName);
    this.lastName = lastName;
  }

  public Name(String firstName, String lastName, String patronymic) throws Exception {
    this(firstName, lastName);
    this.patronymic = patronymic;
  }

  @Override
  public String toString() {
    String str = "";
    if (lastName != null) {
      str += lastName + " ";
    }
    str += firstName;
    if (patronymic != null) {
      str += " " + patronymic;
    }
    return str;
  }
}
