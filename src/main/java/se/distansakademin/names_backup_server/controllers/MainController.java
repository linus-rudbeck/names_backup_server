package se.distansakademin.names_backup_server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import se.distansakademin.names_backup_server.models.NamesBackup;
import se.distansakademin.names_backup_server.services.NamesBackupService;

@Controller
public class MainController {

    private final NamesBackupService service;

    public MainController(NamesBackupService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHomePage(Model model){
        var backups = service.getAll();
        model.addAttribute("backups", backups);
        model.addAttribute("backup", new NamesBackup());
        return "home";
    }

    @PostMapping
    public String postBackup(@ModelAttribute NamesBackup backup){
        service.add(backup);
        return "redirect:/";
    }

}
