package FinalPractice1;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Owner owner1 = new Owner("123456789", "John Doe", "johndoe@gmail.com");
		Owner owner2 = new Owner("987654321", "Jane Doe", "janedoe@gmail.com");

		Vehicle car1 = new Car("ABC-123", "Toyota", 2010, "white", owner1, 5, "gasoline");
		Vehicle car2 = new Car("XYZ-789", "Honda", 2015, "red", owner2, 4, "electric");
		Vehicle bike1 = new Motorcycle("DEF-456", "Yamaha", 2018, "black", owner1, 12);
		Vehicle truck1 = new Truck("KLM-789", "Yamaha", 2020, "blue", owner2, 102);
		Vehicle bike2 = new Motorcycle("GHI-789", "Suzuki", 2012, "yellow", owner1, 1);

		MainVehicleRegistry obj = new MainVehicleRegistry();
		obj.addVehicle(car1);
		obj.addVehicle(truck1);
		obj.addVehicle(car1);
		obj.addVehicle(bike2);
		obj.addVehicle(bike1);

		obj.findVehicleByLicenseNumber("ABC-123").hienThiThongTin();

		obj.removeVehiclesByManufacturer("Suzuki");
		System.out.println("\n\n\n");

		for (Vehicle vehicle : obj.getVehicles()) {
			vehicle.hienThiThongTin();
		}
		System.out.println("\n\n\n");
		System.out.println(obj.findManufacturerWithMostVehicles());

		obj.sortVehiclesByLicenseNumberDescending();
		for (Vehicle vehicle : obj.getVehicles()) {
			vehicle.hienThiThongTin();
		}
		
		Map<String, Integer> vehiclesByTypes = obj.countVehiclesByType();
		vehiclesByTypes.forEach((k, v) ->{
			System.out.println("Loại " + k + " - số lượng: " + v);
		});

	}

}
