package com.lyf.quiet.controller;

import com.lyf.quiet.entities.Department;
import com.lyf.quiet.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/depart")
public class DepartController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/doAddUpdateDepart")
	public String doAddUpdateDepart(String depaName, Department depart){
		if (depart != null) {
			departmentService.updateByPrimaryKey(depart);
			return "redirect:selectAll";
		}
		depart = new Department();
		depart.setDepaName(depaName);
		int insert = departmentService.insert(depart);
		return "redirect:selectAll";
	} 
	
	@RequestMapping("/addUpdateDepart")
	public String addUpdateDepart(String tag, Integer depaId, Map<String, Object> map){
		if(tag.equals("add")){
			return "add";
		}
		if (tag.equals("update")) {
			Department department = departmentService.selectByPrimaryKey(depaId);
			map.put("depart", department);
			return "update";
		}
		if (tag.equals("delete")) {
			departmentService.deleteByPrimaryKey(depaId);
			return "redirect:selectAll";
		}
		return "error";
	}
	
	@RequestMapping("/selectAll")
	public String selectAll(Map<String, Object> map){
		List<Department> list = departmentService.selectAll();
		map.put("list", list);
		return "list";
	}
}
