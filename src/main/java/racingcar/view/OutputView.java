package racingcar.view;

import racingcar.util.Util;

public class OutputView implements ViewInterface {

	public static void View(String winner){
		System.out.println(Util.OutputViewWinner.getMessage()+winner);

	}

}
