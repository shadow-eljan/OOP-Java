package Theory;

public class ReturnType {
    public String hello(){
        return "HELLO.";
    }

    static String world(){
        return "WORLD.";
    }
    public static void main(String[] args) {
        System.out.println(world());
    }
}
