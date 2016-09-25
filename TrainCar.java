
public class TrainCar {
	
	private String name;
	private String cargo;
	private TrainCar nextCar;
	
	public TrainCar(String name, String cargo) {
		this.name = name;
		this.cargo = cargo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public TrainCar getNextCar() {
		return nextCar;
	}

	public void setNextCar(TrainCar nextCar) {
		this.nextCar = nextCar;
	}
	
	public boolean hasNextCar() {

		return !(nextCar == null);

	}
	

}
