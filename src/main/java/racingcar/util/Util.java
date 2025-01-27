package racingcar.util;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import racingcar.view.OutputView;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum Util {
	InputCarListMessage("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
	InputCarDistance("시도할 회수는 몇회인가요?"),
	CarNameException("이름이 길어유"),
	OutputViewWinner("최종 우승자 : ");
	String message;


}
