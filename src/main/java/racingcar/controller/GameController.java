package racingcar.controller;

import java.util.stream.Collectors;
import racingcar.model.Car;
import racingcar.util.ExceptionHandler;
import racingcar.view.InputView;

import java.util.List;
import racingcar.view.OutputView;
import racingcar.view.ProgressView;

public class GameController implements GameControllerInterface {
    public static List<String> CarList;
    public static Integer CarDistance;
    public List<Car> cars;

    public GameController(){
        CarList=InputView.InputCarList();
        CarList.stream()
            .map(CarName-> ExceptionHandler.NameExceptionHandler(CarName))
            .collect(Collectors.toList());
        //ExceptionHandler.NameExceptionHandler("asddsasdsda");

        CarDistance=InputView.InputCarDistance();
        //System.out.println(CarList);
        //System.out.println(CarDistance);


    }
    public void RacingGame(){

        GameStart();
        GameProgress();
        GameResult();
    }




    @Override
    public void GameStart(){
        //System.out.println(Randoms.pickNumberInRange(0,9));
        //System.out.println(InputView.InputCarList());
        //Car a=new Car("df",2);
        cars= CarList.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }
    @Override
    public void GameProgress(){
        for(int i =0;i<CarDistance;i++){
            cars.stream()
                .forEach(cars -> cars.CarMove())
            ;
            cars.stream()
                .forEach(cars -> ProgressView.View(cars.getCarName(),cars.getCarDistance()))
            ;
            System.out.println(" ");
        }


    }
    @Override
    public void GameResult(){
        int maxDistance = cars.stream()
            .mapToInt(Car::getCarDistance)
            .max()
            .orElse(0);



        String winner = cars.stream()
            .filter(car -> car.getCarDistance() == maxDistance)
            .map(Car->Car.getCarName())
            .collect(Collectors.toList())
            .toString();
        OutputView.View(String.join(", ", winner));
        //System.out.println("우승자: " + String.join(", ", winners));

    }


}
