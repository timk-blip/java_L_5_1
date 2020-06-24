import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registerd = true;
        long expected = 30;
        long actual = service.calculate(amount, registerd);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000000_60;
        boolean registerd = true;
        long expected = 500;
        long actual = service.calculate(amount, registerd);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registerd = false;
        long expected = 10;
        long actual = service.calculate(amount, registerd);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000000_60;
        boolean registerd = false;
        long expected = 500;
        long actual = service.calculate(amount, registerd);
        assertEquals(expected, actual);
    }
}