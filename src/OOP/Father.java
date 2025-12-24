package OOP;

public class Father {
    void father(){
        System.out.println("I am father");
    }

    public static void main(String[] args) {
        Father f = new Son();
        f.father();
    }
}
