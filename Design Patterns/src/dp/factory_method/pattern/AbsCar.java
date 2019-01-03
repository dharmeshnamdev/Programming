package dp.factory_method.pattern;

public abstract class AbsCar {
	protected int engineNo;
	protected String color;
	
	public abstract void drive();
	
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "AbsCar [engineNo=" + engineNo + ", color=" + color + "]";
	}
}
