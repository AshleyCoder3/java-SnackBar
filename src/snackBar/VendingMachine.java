package snackBar;

public class VendingMachine {

  //fields
  private static int maxId = 0;
  private int id;
  private String name;

  //constructor
  public VendingMachine(String name) {
    maxId++;
    id = maxId;

    this.name = name;
  }

  //getter/setters
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + "}";
  }
}
