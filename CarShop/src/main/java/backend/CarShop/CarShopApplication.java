package backend.CarShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import backend.CarShop.domain.CarEntity;
import backend.CarShop.domain.CarRepository;

@SpringBootApplication
public class CarShopApplication {

	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarShopApplication.class, args);
	}

	 public void init() {
        // Save some cars to the repository
        carRepository.save(new CarEntity("Toyota Camry", 2020, "New", "path/to/image1.jpg", 25000.00));
        carRepository.save(new CarEntity("Honda Civic", 2018, "Used", "path/to/image2.jpg", 18000.00));
        carRepository.save(new CarEntity("Ford Mustang", 2015, "Used", "path/to/image3.jpg", 35000.00));
    }


	
}
