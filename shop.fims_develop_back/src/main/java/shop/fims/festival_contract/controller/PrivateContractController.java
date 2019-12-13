package shop.fims.festival_contract.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivateContractController {

	@GetMapping("/festival_contract/privateContractView")
	public String PrivateContractView() {
		return "festival_contract/privateContractView";
	}
}
