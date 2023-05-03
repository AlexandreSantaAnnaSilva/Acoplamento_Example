// Exemplo da utilização do Acoplamento em Java

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class Order {
    private Customer customer;
    private String[] items;

    public Order(Customer customer, String[] items) {
        this.customer = customer;
        this.items = items;
    }

    public void printOrder() {
        System.out.println("Order for " + customer.getName() + ":");
        for (String item : items) {
            System.out.println("- " + item);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Smith", "john.smith@example.com");
        String[] items = {"Shirt", "Pants", "Shoes"};
        Order order = new Order(customer, items);
        order.printOrder();
    }
}
