package shop.fims.festival_committee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommitteeController {
	
	@GetMapping("/festival_committee/allCommitteeView")
	public String AllCommitteeView() {
		return "festival_committee/allCommitteeView";
	}
}
