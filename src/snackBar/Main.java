package snackBar;

public class Main {

  private static void info() {
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolate = new Snack("Chocolate", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());

    System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
    System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");

    System.out.println("Customer Jane buys 3 Sodas");
    soda.buySnack(3);
    jane.buySnack(soda.getTotalCost(3));
    System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
    System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");
    /*
    Jane buys 1 Pretzel
      [X] Print Jane's cash on hand
      [X] Print quantity of Pretzel
  */
    System.out.println("Jane buys 1 Pretzel");
    pretzel.buySnack(1);
    jane.buySnack(pretzel.getTotalCost(1));
    System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
    System.out.println(
      "Quantity of Pretzel is " + pretzel.getQuantity() + "\n"
    );
    /*
   Bob buys 2 sodas
      [X] Print Bob's cash on hand
      [X] Print quantity of soda
  */
    System.out.println("Bob buys 2 sodas");
    soda.buySnack(2);
    bob.buySnack(soda.getTotalCost(2));
    System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
    System.out.println("Quantity of soda is " + soda.getQuantity() + "\n");
    /*
    Jane finds $10.00 and add's it to her cash on hand
      [X] Print Jane's cash on hand
  */
    System.out.println("Jane finds $10");
    jane.addCash(10.00);
    System.out.println("Jane's cash on hand is " + jane.getCashOnHand() + "\n");
    /*
    Jane buys 1 chocolate bar
      [X] Print Jane's cash on hand
      [X] Print quantity of chocolate bar
  */
    System.out.println("Jane buys 1 chocolate bar");
    chocolate.buySnack(1);
    jane.buySnack(chocolate.getTotalCost(1));
    System.out.println("Jane's cash on hand is " + jane.getCashOnHand());
    System.out.println(
      "Quantity of chocolate is " + chocolate.getQuantity() + "\n"
    );
    /*
    Add 12 more pretzels
      [X] Print quantity of pretzels
  */
    System.out.println("Add 12 more pretzels");
    pretzel.addQuantity(12);
    System.out.println(
      "Quantity of Pretzel is " + pretzel.getQuantity() + "\n"
    );
    /*
    Bob buys 3 pretzels
      [] Print Bob's cash on hand
      [] Print quantity of pretzel
  */
    System.out.println("Bob buys 3 pretzels");
    pretzel.buySnack(3);
    bob.buySnack(pretzel.getTotalCost(3));
    System.out.println("Bob's cash on hand is " + bob.getCashOnHand());
    System.out.println(
      "Quantity of pretzel is " + pretzel.getQuantity() + "\n"
    );
  }

  //method header
  public static void main(String[] args) {
    info();
  }
}
