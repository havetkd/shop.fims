package shop.fims.statistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountAnalysisController {

	@GetMapping("/statistics/accountAnalysisView")
	public String AccountAnalysisView() {
		return "statistics/accountAnalysisView";
	}
}
