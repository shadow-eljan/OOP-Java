package Theory;

public class iib {
    static{
        System.out.println("Runs before the constructor");
    };
    iib(){
        System.out.println("HEllo.");
    }

    public static void main(String[] args) {
        System.out.println("HI");
        iib i = new iib();
    }
}
