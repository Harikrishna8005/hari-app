package demo.web.app.demo.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAdd {
	@GetMapping("/add")
	
	public int addition() {
		
		int a=20;
		int b=30;
		int c= a+b;
		return c;
	}

}
