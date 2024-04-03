package backend.CarShop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import backend.CarShop.domain.CarEntity;
import backend.CarShop.domain.CarRepository;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;


    @GetMapping("/cars")
    public String getCars(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "cars";
    }
   
    @GetMapping("/addcar")
    public String showCarForm(Model model){
        model.addAttribute("car", new CarEntity());
        return "AddCar";
    }

    @PostMapping("/savecar")
    public String saveCar(CarEntity car) {
        carRepository.save(car);
        return "redirect:carlist";
    }

}
