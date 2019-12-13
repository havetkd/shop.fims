package shop.fims.festival_budget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevenueBudgetController {

	@GetMapping("/festival_budget/revenueBudgetView")
	public String ExpenditureBudgetView() {
		return "festival_budget/revenueBudgetView";
	}
}
