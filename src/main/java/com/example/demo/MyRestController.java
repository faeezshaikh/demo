package com.example.demo;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}


@RestController
@RequestMapping("/")
public class MyRestController {


	@RequestMapping("/rate")
	public String getRate() {


				
		//name of view
		return "AmerenView";
	}
	
	 private final AtomicLong counter = new AtomicLong();
	
	 private static final String template = "Hello, %s!";
	 
	 @RequestMapping("/greeting")
	    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	    }

	 
		

	
}




	



