package app;

public class Name {
  String lastName;
  String firstName;
  String patronymic;

  public Name(String firstName, String lastName, String patronymic) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.patronymic = patronymic;
  }

  @Override
  public String toString() {
    String str = "";
    if (lastName != null) {
      str += lastName;
    }
    str += " " + firstName;
    if (patronymic != null) {
      str += " " + patronymic;
    }
    return str;
  }
}
