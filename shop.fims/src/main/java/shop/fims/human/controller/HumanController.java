package shop.fims.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HumanController {

	//인적사항 리스트
	@GetMapping("/human/humanList")
	public String selectHuman() {
		
		return "/human/humanList";
	}
	//인적사항 등록
	@GetMapping("/human/humanInsert")
	public String insertHuman() {
		
		return "/human/humanInsert";
	}
	
	//인적사항 수정
	@GetMapping("/human/humanUpdate")
	public String updateHuman() {
		
		return "/human/humanUpdate";
	}
	//인적사항 삭제
	@GetMapping("/human/humanDelete")
	public String delectHuman() {
		
		return "/human/humanDelete";
	}
	
}
