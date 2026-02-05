package Lab3;

public class ArrayTime {

        public static void main(String[] args) throws InterruptedException {

            // create an array to store Time objects
            Time[] times = new Time[5];

            // create a Time object every 5 seconds
            for (int i = 0; i < times.length; i++) {
                times[i] = new Time();
                System.out.println(times[i].toString());

                // wait for 5 seconds
                Thread.sleep(5000);
            }
        }

}
