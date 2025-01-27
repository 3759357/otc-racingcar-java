package racingcar.model;

abstract class CarAbstract implements CarInterface{
	@Override
	public abstract String getCarName();
	@Override
	public abstract int getCarDistance();
	@Override
	public abstract void CarMove();

}
