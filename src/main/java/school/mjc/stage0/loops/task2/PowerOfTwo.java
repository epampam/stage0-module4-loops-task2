package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        int number = 0;
        while (number <= power) {
            System.out.println(1 << number);
            number++;
        }
    }
}
