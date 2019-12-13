package shop.fims.festival_announcement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FesAnnController {
	
	@GetMapping("/festival_announcement/announcementView")
	public String AnnouncementView() {
		return "festival_announcement/announcementView";
	}
}
