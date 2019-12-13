package shop.fims.human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController {

	//축제업무별배치인원리스트
	@GetMapping("/work/workingpeopleList")
	public String selectWorkingpeople() {
		
		return "/work/workingpeopleList";
	}
	//축제업무분류리스트
	@GetMapping("/work/workcategoryList")
	public String selectWorkCategory() {
		
		return "/work/workcategoryList";
	}
	//축제업무분류등록
	@GetMapping("/work/workcategoryInsert")
	public String insertWorkCategory() {
		
		return "/work/workcategoryInsert";
	}
	//축제업무분류수정
	@GetMapping("/work/workcategoryUpdate")
	public String updateWorkCategory() {
		
		return "/work/workcategoryUpdate";
	}
	//축제업무분류삭제
	@GetMapping("/work/workcategoryDelete")
	public String delectWorkCategory() {
		
		return "/work/workcategoryDelete";
	}
	//축제업무리스트
	@GetMapping("/work/workdivisionList")
	public String selectWorkDivision() {
		
		return "/work/workdivisionList";
	}
	//축제업무등록
	@GetMapping("/work/workdivisionInsert")
	public String insertWorkDivision() {
		
		return "/work/workdivisionInsert";
	}
	//축제업무수정
	@GetMapping("/work/workdivisionUpdate")
	public String updateWorkDivision() {
		
		return "/work/workdivisionUpdate";
	}
	//축제업무삭제
	@GetMapping("/work/workdivisionDelete")
	public String delectWorkDivision() {
		
		return "/work/workdivisionDelete";
	}
}
