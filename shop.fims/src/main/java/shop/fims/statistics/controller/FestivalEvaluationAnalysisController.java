package shop.fims.statistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FestivalEvaluationAnalysisController {

	@GetMapping("/statistics/festivalEvaluationAnalysisView")
	public String FestivalEvaluationAnalysisView() {
		return "statistics/festivalEvaluationAnalysisView";
	}
}
