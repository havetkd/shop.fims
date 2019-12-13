package shop.fims.festival_budget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenditureExecutionController {
	
	@GetMapping("/festival_budget/expenditureExecutionView")
	public String ExpenditureExecutionView() {
		return "festival_budget/expenditureExecutionView";
	}
	
}
