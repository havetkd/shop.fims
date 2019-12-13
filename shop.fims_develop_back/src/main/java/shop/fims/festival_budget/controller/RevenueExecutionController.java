package shop.fims.festival_budget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevenueExecutionController {

	@GetMapping("/festival_budget/revenueExecutionView")
	public String RevenueExecutionView() {
		return "festival_budget/revenueExecutionView";
	}
}
