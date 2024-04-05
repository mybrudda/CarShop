package backend.CarShop;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import backend.CarShop.domain.CarEntity;
import backend.CarShop.domain.CarRepository;
import backend.CarShop.domain.Category;
import backend.CarShop.domain.CategoryRepository;

@SpringBootApplication
public class CarShopApplication {

    private static final Logger log = LoggerFactory.getLogger(CarShopApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository carRepository, CategoryRepository cRepository) {
        return (args) -> {
            log.info("Adding demo data to the database...");
            // Create and save categories
            Category sedanCategory = new Category("Sedan");
            Category truckCategory = new Category("Truck");
            Category suvCategory = new Category("SUV");

            cRepository.save(sedanCategory);
            cRepository.save(truckCategory);
            cRepository.save(suvCategory);

            // Create and save cars with assigned categories
            CarEntity car1 = new CarEntity("Toyota Camry", 2020, "New", "path/to/image1.jpg", 25000.0, sedanCategory);
            CarEntity car2 = new CarEntity("Ford F-150", 2018, "Used", "path/to/image2.jpg", 28000.0, truckCategory);
            CarEntity car3 = new CarEntity("Jeep Wrangler", 2021, "New", "path/to/image3.jpg", 40000.0, suvCategory);

            carRepository.save(car1);
            carRepository.save(car2);
            carRepository.save(car3);

            log.info("Demo data added successfully!");
        };
    }
}