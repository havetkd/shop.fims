package shop.fims.OperateController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Oprate_SystemMnageController {
	
	@GetMapping("/oprate_systemmanage/SystemManageView")
	public String SystemManageView() {
		return "/oprate_systemmanage/SystemManageView";
		
	}
	
}