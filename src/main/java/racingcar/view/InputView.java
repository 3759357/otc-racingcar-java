package racingcar.view;

import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.Util;

public class InputView implements InputInterface {

    public static List<String> InputCarList(){
        System.out.println(Util.InputCarListMessage.getMessage());
        String input = Console.readLine();

        return Arrays.stream(input.split(",")).toList();
    }

    public static int InputCarDistance(){
        System.out.println(Util.InputCarDistance.getMessage());
        String input = Console.readLine();

        return Integer.parseInt(input);
    }
}
