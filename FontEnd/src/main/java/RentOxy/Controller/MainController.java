package RentOxy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import RentOxy.Model.DataOxy;

@Controller
@RequestMapping("/oxy")
public class MainController {
	
	private RestTemplate rest = new RestTemplate();
	
	@GetMapping("/thueOxy")
	public String donDangKyThueOxy(Model model) {
		
		DataOxy donDangKy = new DataOxy();
		model.addAttribute("donDangKy",donDangKy);
		return "DangKyThueOxy";
	}
	
	@PostMapping("/dangkythueOxy")
	public String dangKyThueOxy(DataOxy donDangKy) {
		rest.postForObject("http://localhost:8080/donDangKy", donDangKy, DataOxy.class);
		return "redirect:/oxy/thueOxy";
	}
}
