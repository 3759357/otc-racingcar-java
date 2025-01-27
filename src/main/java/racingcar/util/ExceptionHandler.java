package racingcar.util;

import java.util.Optional;

public class ExceptionHandler {
	public static Optional<String> NameExceptionHandler(String carName){
		if(carName.length()>5){
			System.out.println(Util.CarNameException.getMessage());
			throw new RuntimeException(Util.CarNameException.getMessage());

		}
		return Optional.empty();
	}

}
