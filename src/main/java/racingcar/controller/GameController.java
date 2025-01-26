package racingcar.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.view.InputView;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import racingcar.view.OutputView;
import racingcar.view.ProgressView;

public class GameController {
    public static List<String> CarList;
    public static Integer CarDistance;
    public List<Car> cars;

    public GameController(){
        CarList=InputView.InputCarList();
        CarDistance=InputView.InputCarDistance();
        //System.out.println(CarList);
        //System.out.println(CarDistance);
    }
    public void RacingGame(){
        gameStart();
        gameProgress();
        gameResult();
    }

    public void gameStart(){
        //System.out.println(Randoms.pickNumberInRange(0,9));
        //System.out.println(InputView.InputCarList());
        //Car a=new Car("df",2);
        cars= CarList.stream()
                .map(CarName->new Car(CarName,0))
                .collect(Collectors.toList());
    }
    public void gameProgress(){
        for(int i =0;i<CarDistance;i++){
            cars.stream()
                .forEach(cars -> cars.setCarDistance())
            ;
            cars.stream()
                .forEach(cars -> ProgressView.printProgress(cars.getCarName(),cars.getCarDistance()))
            ;
            System.out.println(" ");
        }


    }
    public void gameResult(){
        int maxDistance = cars.stream()
            .mapToInt(Car::getCarDistance)
            .max()
            .orElse(0);



        String winner = cars.stream()
            .filter(car -> car.getCarDistance() == maxDistance)
            .map(Car->Car.getCarName())
            .collect(Collectors.toList())
            .toString();
        OutputView.OutputVIew(String.join(", ", winner));
        //System.out.println("우승자: " + String.join(", ", winners));

    }


}
