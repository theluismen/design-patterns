package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Testing Singleton ==");

        Singleton singleton  = Singleton.getInstance();

        System.out.println( singleton.welcomeMsg() );
    }
}