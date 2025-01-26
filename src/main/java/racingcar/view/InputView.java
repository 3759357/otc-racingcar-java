package racingcar.view;

import java.util.Arrays;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static List<String> InputCarList(){
        System.out.println("자동차들:");
        String input = Console.readLine();

        return Arrays.stream(input.split(",")).toList();
    }
    public static int InputCarDistance(){
        System.out.println("횟수:");
        String input = Console.readLine();

        return Integer.parseInt(input);
    }
}
