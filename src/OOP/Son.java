package OOP;

public class Son extends Father{
    void son(){
        System.out.println("I am son.");
    }
    void father(){
        System.out.println("My father is rich.");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.father();
        s.son();

        Father f = new Son();
        Father fr = new Father();
        fr.father();
        f.father();
    }
}
