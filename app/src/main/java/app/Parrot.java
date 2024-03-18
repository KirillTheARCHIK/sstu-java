package app;

public class Parrot extends Bird {
  private String text;

  public Parrot(String text) {
    setText(text);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  void Sing() {
    int i1 = (int) (Math.random() * text.length());
    int i2 = i1;
    while (i2 == i1) {
      i2 = (int) (Math.random() * text.length());
    }
    if (i1 > i2) {
      var temp = i1;
      i1 = i2;
      i2 = temp;
    }
    char temp1 = text.charAt(i1);
    char temp2 = text.charAt(i2);
    var newText = text.substring(0, i1) + temp2 + text.substring(i1 + 1, i2) + temp1
        + (i2 < text.length() - 1 ? text.substring(i2 + 1, text.length()) : "");
    System.out.println(newText);
  }
}
