##Acoplamento_Example

#Neste exemplo, a classe Order está fortemente acoplada à classe Customer, pois depende dela para imprimir o nome do cliente no método printOrder().
#No entanto, isso pode ser facilmente resolvido tornando o método printOrder() mais genérico e aceitando um objeto Customer como parâmetro:


public void printOrder(Customer customer) {
    System.out.println("Order for " + customer.getName() + ":");
    for (String item : items) {
        System.out.println("- " + item);
    }
}

Dessa forma, a classe Order não está mais fortemente acoplada à classe Customer, e pode ser usada com qualquer objeto Customer.
