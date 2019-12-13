package shop.fims.statistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalBudgetAnalysisController {

	@GetMapping("/statistics/festivalBudgetAnalysisView")
	public String FestivalBudgetAnalysisView() {
		return "statistics/festivalBudgetAnalysisView";
	}
}
