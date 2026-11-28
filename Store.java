
package Interfaces;

interface Member {
    void callback();
}

public class Store {

    Member mem[] = new Member[100];
    int count = 0;

    // Register customer
    void register(Member m) {
        mem[count++] = m;
    }

    // Invite all registered customers
    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

class Customer implements Member {

    String name;

    // Constructor
    Customer(String n) {
        name = n;
    }

    // Implement interface method
    @Override
    public void callback() {
        System.out.println("Customer called : " + name);
    }

    public static void main(String[] args) {

        Store s = new Store();

        Customer c1 = new Customer("John");
        Customer c2 = new Customer("David");

        s.register(c1);
        s.register(c2);
        s.inviteSale();

    }
}

