package shop.fims.festival_account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	
	@GetMapping("/festival_account/accountMemberView")
	public String AccountMember() {
		return "festival_account/accountMemberView";
	}
	
	@GetMapping("/festival_account/allAccountView")
	public String AllAccountView() {
		return "festival_account/allAccountView";
	}
	
	@GetMapping("/festival_account/approvalAccountView")
	public String ApprovalAccountView() {
		return "festival_account/approvalAccountView";
	}
	
}
