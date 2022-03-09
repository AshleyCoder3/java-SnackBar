package snackBar;

import java.util.Objects;

public class Customer {

  //fields
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  //constructor
  public Customer(String name, double cashOnHand) {
    maxId++;
    id = maxId;

    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCashOnHand() {
    return this.cashOnHand;
  }

  public void addCash(double newCash) {
    this.cashOnHand += newCash;
  }

  public void buySnack(double totalCost) {
    this.cashOnHand = this.cashOnHand - totalCost;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer customer = (Customer) o;
    return (
      id == customer.id &&
      Objects.equals(name, customer.name) &&
      cashOnHand == customer.cashOnHand
    );
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cashOnHand);
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", name='" +
      getName() +
      "'" +
      ", cashOnHand='" +
      getCashOnHand() +
      "'" +
      "}"
    );
  }
}
