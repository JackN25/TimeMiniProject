public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(10, 11, 12);
        System.out.print("Expected output: [10:11:12]\nActual Output: ");
        System.out.println(time1 + "\n");
        time1.tick();
        System.out.print("Expected output: [10:11:13]\nActual Output: ");
        System.out.println(time1 + "\n");
        time1.tick();
        System.out.print("Expected output: [10:11:14]\nActual Output: ");
        System.out.println(time1 + "\n");
        time1.tick();
        System.out.print("Expected output: [10:11:15]\nActual Output: ");
        System.out.println(time1 + "\n");
        time1.tick();
        System.out.print("Expected output: [10:11:16]\nActual Output: ");
        System.out.println(time1 + "\n");
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.print("Expected output: [10:11:24]\nActual Output: ");
        System.out.println(time1 + "\n");
        Time time2 = new Time(23, 59, 58);
        System.out.print("Expected output: [23:59:58]\nActual Output: ");
        System.out.println(time2 + "\n");
        time2.tick();
        System.out.print("Expected output: [23:59:59]\nActual Output: ");
        System.out.println(time2 + "\n");
        time2.tick();
        System.out.print("Expected output: [00:00:00]\nActual Output: ");
        System.out.println(time2 + "\n");
        time2.tick();
        System.out.print("Expected output: [00:00:01]\nActual Output: ");
        System.out.println(time2 + "\n");
        Time time3 = new Time(9, 8, 7);
        System.out.print("Expected output: [09:08:07]\nActual Output: ");
        System.out.println(time3 + "\n");
        time3.tick();
        System.out.print("Expected output: [09:08:08]\nActual Output: ");
        System.out.println(time3 + "\n");
        time3.tick();
        System.out.print("Expected output: [09:08:09]\nActual Output: ");
        System.out.println(time3 + "\n");
        time3.tick();
        System.out.print("Expected output: [09:08:10]\nActual Output: ");
        System.out.println(time3);
        Time time4 = new Time(10, 14, 43);
        System.out.print("Expected output: [10:14:43]\nActual Output: ");
        System.out.println(time4 + "\n");
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.print("Expected output: [18:45:12]\nActual Output: ");
        System.out.println(time4 + "\n");
        System.out.print("Expected output: [08:30:29]\nActual Output: ");
        System.out.println(time5 + "\n");
        Time time6 = new Time(7, 20, 0);
        time4.add(time6);
        System.out.print("Expected output: [02:05:12]\nActual Output: ");
        System.out.println(time4 + "\n");



    }
}
