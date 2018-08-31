public class Test {
    private Main subject = new Main();

    public void run() {
        assertEqual("calc(1, 10)",
                    this.subject.calc(1, 10), 20);
        assertEqual("calc(100, 200)",
                    this.subject.calc(100, 200), 125);
        assertEqual("calc(201, 210)",
                    this.subject.calc(201, 210), 89);
        assertEqual("calc(900, 1000)",
                    this.subject.calc(900, 1000), 174);
        assertEqual("calc(1, 10000)",
                    this.subject.calc(1, 10000), 262);
        assertEqual("calc(724852, 724070)",
                    this.subject.calc(724852, 724070), 362);

    }

    public static void assertEqual(String desc, int sub, int exp) {
        if (sub == exp) {
            System.out.println(desc + " passed.");
        } else {
            System.err.println(desc + " failed.");
            System.err.println("  expected: " + exp);
            System.err.println("       got: " + sub);
        }

    }

    public static void main(String[] args) {
        new Test().run();
    }
}
