package racingcar.view;

public class ProgressView implements ViewInterface {

	public static void View(String carName,int carDistance){
		System.out.println(carName+" : "+"-".repeat(carDistance));

	}
}
