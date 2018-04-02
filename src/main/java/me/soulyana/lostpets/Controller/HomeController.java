package me.soulyana.lostpets.Controller;

import me.soulyana.lostpets.Models.Pet;
import me.soulyana.lostpets.Repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    PetRepository petRepository;

    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }

    @RequestMapping("/list")
    public String listPets(Model model)
    {
        model.addAttribute("pets", petRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String petForm(Model model)
    {
        model.addAttribute("pet", new Pet());
        return "petform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Pet pet, BindingResult result)
    {
        if (result.hasErrors()) {
            return "petform";
        }
        petRepository.save(pet);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showPet(@PathVariable("id") long id, Model model) {
        model.addAttribute("pet", petRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updatePet(@PathVariable("id") long id, Model model) {
        model.addAttribute("pet", petRepository.findOne(id));
        return "petform";
    }

    @RequestMapping("/delete/{id}")
    public String deletePet(@PathVariable("id") long id, Model model) {
        petRepository.delete(id);
        return "redirect:/";
    }
}
