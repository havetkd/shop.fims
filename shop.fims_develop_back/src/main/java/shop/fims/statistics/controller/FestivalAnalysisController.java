package shop.fims.statistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalAnalysisController {

	@GetMapping("/statistics/festivalAnalysisView")
	public String FestivalAnalysisView() {
		return "statistics/festivalAnalysisView";
	}
}
