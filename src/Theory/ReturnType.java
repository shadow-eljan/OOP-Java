package Theory;

public class ReturnType {
    String hello(){
        return "HELLO.";
    }

    static String world(){
        return "WORLD.";
    }
    void hi(){
        System.out.println("HI");
    }
    public static void main(String[] args) {
        System.out.println(world());
        ReturnType r = new ReturnType();
        r.hi();
        System.out.println(r.hello());
    }
}
