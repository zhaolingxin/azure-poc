package lingxin.zhao.azure_poc;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/greetings")
public class BasicController {
	
	
	@GetMapping(value = "/hello-world", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public ResponseEntity<String> helloWorld() {
		
		return ResponseEntity.ok("Hello World");
		
	}


}
