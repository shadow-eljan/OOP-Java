package Practical;

public class TutionFee {
    public static void main(String[] args) {
        double RM = 10000;
        double rate = 5;
        double time = 10;
        for (int i = 1; i <=time ; i++) {
            RM += (rate/100)*RM;
        }
        System.out.println("In ten years, tuition fee will be RM "+RM);
    }
}
