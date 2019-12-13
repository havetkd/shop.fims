package shop.fims.festival_budget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenditureBudgetController {

	
	@GetMapping("/festival_budget/expenditureBudgetView")
	public String ExpenditureBudgetView() {
		return "festival_budget/expenditureBudgetView";
	}
	

}
