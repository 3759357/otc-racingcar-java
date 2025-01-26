package racingcar.model;
import camp.nextstep.edu.missionutils.Randoms;
public class Car {
    private final String CarName;
    private int CarDistance;

    public Car(String carName,int carDistance) {
        this.CarName = carName;
        this.CarDistance = carDistance;
        System.out.println("완성");
    }
    public void setCarDistance(){
        if(Randoms.pickNumberInRange(0,9)>4){
            this.CarDistance=this.CarDistance+1;
            //System.out.println("sadasd");
        }

    }
    public String getCarName(){
        return this.CarName;
    }
    public int getCarDistance(){
        return this.CarDistance;
    }
}
