package shop.fims.facility.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacilityController {
	
	//모든시설분류리스트
	@GetMapping("/classificationList")
	public String selectClassification() {
		
		return "/facility/classificationList";
	}
	//모든시설분류등록
	@GetMapping("/classificationInsert")
	public String insertClassification() {
		
		return "/facility/classificationInsert";
	}
	//모든시설분류수정
	@GetMapping("/classificationUpdate")
	public String updateClassification() {
		
		return "/facility/classificationUpdate";
	}
	//모든시설분류삭제
	@GetMapping("/classificationDelete")
	public String delectClassification() {
		
		return "/facility/classificationDelete";
	}
	//보유시설리스트
	@GetMapping("/facilityList")
	public String selectFacility() {
		
		return "/facility/facilityList";
	}
	//보유시설등록
	@GetMapping("/facilityInsert")
	public String insertFacility() {
		
		return "/facility/facilityInsert";
	}
	//보유시설수정
	@GetMapping("/facilityUpdate")
	public String updateFacility() {
		
		return "/facility/facilityUpdate";
	}
	//보유시설삭제
	@GetMapping("/facilityDelete")
	public String delectFacility() {
		
		return "/facility/facilityDelete";
	}
	//임시시설설치및철거리스트
	@GetMapping("/temporaryList")
	public String selectTemporary() {
		
		return "/facility/temporaryList";
	}
	//임시시설설치및철거등록
	@GetMapping("/temporaryInsert")
	public String insertTemporary() {
		
		return "/facility/temporaryInsert";
	}
	//임시시설설치및철거수정
	@GetMapping("/temporaryUpdate")
	public String updateTemporary( ) {
		
		return "/facility/temporaryUpdate";
	}
	//임시시설설치및철거삭제
	@GetMapping("/temporaryDelete")
	public String delectTemporary() {
		
		return "/facility/temporaryDelete";
	}
	//시설안전점검후유지보수리스트
	@GetMapping("/maintenanceList")
	public String selectMaintenance() {
		
		return "/facility/maintenanceList";
	}
	//시설안전점검후유지보수등록
	@GetMapping("/maintenanceInsert")
	public String insertMaintenance() {
		
		return "/facility/maintenanceInsert";
	}
	//시설안전점검후유지보수수정 
	@GetMapping("/maintenanceUpdate")
	public String updateMaintenance() {
		
		return "/facility/maintenanceUpdate";
	}
	//시설안전점검후유지보수삭제 
	@GetMapping("/maintenanceDelete")
	public String delectMaintenance() {
		
		return "/facility/maintenanceDelete";
	}
	//안전점검리스트표
	@GetMapping("/checklistList")
	public String selectChecklist() {
		return "/facility/checklistList";
	}
}
