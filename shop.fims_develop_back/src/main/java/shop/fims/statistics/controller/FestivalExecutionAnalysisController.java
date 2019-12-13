package shop.fims.statistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalExecutionAnalysisController {

	@GetMapping("/statistics/festivalExecutionAnalysisView")
	public String FestivalExecutionAnalysisView() {
		return "statistics/festivalExecutionAnalysisView";
	}
}
