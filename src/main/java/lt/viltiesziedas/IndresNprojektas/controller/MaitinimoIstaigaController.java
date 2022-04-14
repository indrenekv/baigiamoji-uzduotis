package lt.viltiesziedas.IndresNprojektas.controller;

import lt.viltiesziedas.IndresNprojektas.duomenubaze.entity.MaitinimoIstaiga;
import lt.viltiesziedas.IndresNprojektas.duomenubaze.repository.MaitinimoIstaigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MaitinimoIstaigaController
{
    @Autowired
    MaitinimoIstaigaRepository maitinimoIstaigaRepository;

    @GetMapping("/admin/istaigos_idejimas")
    String istaigosIdejimoAtvaizdavimas(Model model) {
        MaitinimoIstaiga maitinimoIstaiga = new MaitinimoIstaiga();
        model.addAttribute("maitinimoIstaiga", maitinimoIstaiga);
        return "istaigos_idejimas.html";
    }

    @PostMapping("/admin/istaiga_ideta")
    String istaigaPrideta(Model model, @ModelAttribute MaitinimoIstaiga maitinimoIstaiga) {
        System.out.println("maitinimoIstaiga = " + maitinimoIstaiga.getPavadinimas());
        maitinimoIstaigaRepository.save(maitinimoIstaiga);
        return "istaiga_prideta.html";
    }


    @GetMapping("/admin/istaigos_redagavimas/")
    String istaigosRedagavimoAtvaizdavimas(Model model)
}
