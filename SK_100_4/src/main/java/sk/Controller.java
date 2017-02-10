package sk;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String index(){
		return "index.html";
	}
	
	@RequestMapping("/test")
	public String index1(){
		return "index_temp.html";
	}
}
