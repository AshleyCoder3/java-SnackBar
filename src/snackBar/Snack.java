package snackBar;

public class Snack {

  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  // Constructor

  public Snack(String name, int quantity, double cost, int vendingMachineId) {
    maxId++;
    id = maxId;

    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  // Getters and Setters
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return this.cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getVendingMachineId() {
    return this.vendingMachineId;
  }

  public void setVendingMachineId(int vendingMachineId) {
    this.vendingMachineId = vendingMachineId;
  }

  public int getQuantity() {
    return this.quantity;
  }

  // other methods
  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void buySnack(int quantity) {
    // if then
    this.quantity -= quantity;
  }

  // prolly this.
  // buySnack * this.cost?????
  public double getTotalCost(int quantity) {
    return this.cost * quantity;
  }
}
