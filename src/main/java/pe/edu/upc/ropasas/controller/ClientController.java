package pe.edu.upc.ropasas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.ropasas.business.crud.ClientService;
import pe.edu.upc.ropasas.model.entity.Client;

@Controller
@RequestMapping("/clients")
public class ClientController {
	
	@Autowired
	private ClientService clientService;

	@GetMapping
	public String listClients(Model model) {
		
		try {
			List<Client> clients = clientService.getAll();
			model.addAttribute("clients", clients);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "clients/list-clients";
	}
}