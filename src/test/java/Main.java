public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registerd = true;
        long expected = 30;
        long actual = service.calculate(amount, registerd);
        boolean passed = actual == expected;
        System.out.println(passed);

        long bonysOverLimitFotRegisterd = service.calculate(1_000_000_60, true);
        System.out.println(bonysOverLimitFotRegisterd);

        long bonysBelowLimitFotRegisterd = service.calculate(10000_60, false);
        System.out.println(bonysOverLimitFotRegisterd);

        long bonysOverLimitFotUnRegisterd = service.calculate(1_000_000_60, true);
        System.out.println(bonysOverLimitFotRegisterd);
    }
}
