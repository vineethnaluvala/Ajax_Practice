package in.vini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxDemo {

	@GetMapping("/")
	public String load() {
		return "index";
	}
	
	@GetMapping("/getMsg")
	@ResponseBody
	public String getMsg(@RequestParam("name") String name) {
		
		String msg =   name + " ,  welcome to ajax";
		
		return msg;
	}
	
	@GetMapping("/drop")
	@ResponseBody
	public String dropdown(@RequestParam("selectDrop") String name) {
		
		String msg =   "you have chosen " + name ;
		
		return msg;
	}
}
