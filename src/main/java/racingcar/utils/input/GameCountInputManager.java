package racingcar.utils.input;

import camp.nextstep.edu.missionutils.Console;

import java.util.NoSuchElementException;

/**
 * 게임 횟수 입력
 */
public class GameCountInputManager implements InputManager<Integer>{
    private static final GameCountInputManager INSTANCE=new GameCountInputManager();
    private GameCountInputManager(){}
    public static GameCountInputManager getInstance() {
        return INSTANCE;
    }
    @Override
    public Integer input() {
        try{
            String input = Console.readLine();
            if (Integer.parseInt(input) < 0)
                throw new IllegalArgumentException();
            return Integer.parseInt(input);
        }catch (NumberFormatException | NoSuchElementException | IllegalStateException e){
            throw new IllegalArgumentException();
        }
    }
}