package racingcar.utils;

public class StubRandomNumberGenerator extends RandomNumberGenerator{
    @Override
    public int pickNumberInRange(int startInclusive, int endInclusive) {
        return 5;
    }
}
