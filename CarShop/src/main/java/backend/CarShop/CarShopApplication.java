package backend.CarShop;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import backend.CarShop.domain.CarEntity;
import backend.CarShop.domain.CarRepository;

@SpringBootApplication
public class CarShopApplication {

    private static final Logger log = LoggerFactory.getLogger(CarShopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository carRepository) {
        return (args) -> {
            log.info("Adding demo data to the database...");
            CarEntity car1 = new CarEntity("Toyota Camry", 2020, "New", "path/to/image1.jpg", 25000.0);
            CarEntity car2 = new CarEntity("Honda Civic", 2018, "Used", "path/to/image2.jpg", 18000.0);
            CarEntity car3 = new CarEntity("BMW X5", 2021, "New", "path/to/image3.jpg", 60000.0);

            carRepository.save(car1);
            carRepository.save(car2);
            carRepository.save(car3);

            log.info("Demo data added successfully!");
        };
    }
}