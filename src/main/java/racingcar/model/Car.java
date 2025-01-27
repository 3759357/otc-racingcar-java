package racingcar.model;
import camp.nextstep.edu.missionutils.Randoms;
public class Car extends CarAbstract {
    private final String CarName;
    private int CarDistance=0;

    public Car(String carName) {
        this.CarName = carName;

        //System.out.println("완성");
    }
    public void setCarDistance(){
        if(Randoms.pickNumberInRange(0,9)>4){
            this.CarDistance=this.CarDistance+1;
            //System.out.println("sadasd");
        }

    }
    @Override
    public String getCarName(){
        return this.CarName;
    }
    @Override
    public int getCarDistance(){
        return this.CarDistance;
    }

    @Override
    public void CarMove() {
        if(Randoms.pickNumberInRange(0,9)>4){
            this.CarDistance=this.CarDistance+1;

        }
    }
}
