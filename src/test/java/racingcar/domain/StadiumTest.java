package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.utils.StubRandomNumberGenerator;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StadiumTest {
    private Stadium stadium;
    private int gameCount;
    private ByteArrayOutputStream outputMessage;


    @BeforeEach
    void setUp() {
        gameCount = 5;
        List<String> names = List.of("김희겸", "엄성준", "김현진");
        stadium = Stadium.of(gameCount, names);
        outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));
    }

    @Test
    void 경주_출력_테스트() {
        setUp();

        stadium.startRace();
        stadium.getUsers().forEach(user -> assertThat(user.getOutputMessage()).contains(user.getName() + " : "));
    }

    @Test
    void 경주_진행도_테스트() {
        setUp();
        User.setRandomNumberGenerator(new StubRandomNumberGenerator());
        stadium.startRace();

        stadium.getUsers().forEach(user ->{
            assertThat(user.getProceedCount()).isEqualTo(gameCount);
        });
    }

    @Test
    void 우승자_테스트() {
        setUp();
        assertThat(stadium.getWinner()).containsExactly(stadium.getUsers().get(2));
    }

    @Test
    void 결과_출력_테스트() {
        Stadium.displayResult(List.of(User.of("엄성준")));
        assertThat("최종 우승자 : 엄성준\r\n").isEqualTo(outputMessage.toString());
    }
}