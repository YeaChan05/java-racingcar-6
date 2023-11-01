package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class SingleDigitNumberGenerator extends RandomNumberGenerator{
    @Override
    public int pickNumberInRange(int startInclusive, int endInclusive) {
        return Randoms.pickNumberInRange(startInclusive, endInclusive);
    }
}
