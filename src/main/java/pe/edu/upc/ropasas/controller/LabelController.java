package pe.edu.upc.ropasas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.ropasas.business.crud.LabelService;
import pe.edu.upc.ropasas.model.entity.Label;

@Controller
@RequestMapping("/labels")
public class LabelController {
	
	@Autowired
	private LabelService labelService;

	@GetMapping
	public String listLabels(Model model) {
		
		try {
			List<Label> labels = labelService.getAll();
			model.addAttribute("labels", labels);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "labels/list-labels";
	}
}