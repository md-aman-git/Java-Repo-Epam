package com.epam.stumgmt.restcontroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.epam.stumgmt.entity.GenderVO;
import com.epam.stumgmt.entity.IP;
import com.epam.stumgmt.entity.UserVO;
import com.epam.stumgmt.service.UserService;

@RestController
public class UserRestController {
	@Autowired
	UserService userService;
	@PostMapping("userAdd")
	public ResponseEntity<String> getUsers(@RequestBody UserVO userVO) {
		userService.addUser(userVO);
		System.out.println("Post mapping... in rest controller...");
		return new ResponseEntity<>("User Created!!!", HttpStatus.CREATED);
		
		//for demo of headers
//		HttpHeaders header = new HttpHeaders();
//		header.add("Details", "One user header added");
//		return ResponseEntity.status(HttpStatus.CREATED).headers(header).body("User Added!!!");
		
//		To demonstrate response body and status code
//		return ResponseEntity.ok("Successfully saved!!!");
	}
	
	@GetMapping("/predictGender/{name}") 
	public String predictGender(@PathVariable String name) {
		RestTemplate restTemplate = new RestTemplate();
		String REST_SERVICE_URI = "https://api.genderize.io/?name=" + name;
		GenderVO genderVO = restTemplate.getForObject(REST_SERVICE_URI, GenderVO.class);
//		System.out.println("GenderVO : " + genderVO);
		return genderVO.toString();
	}
	
	@GetMapping("/ipInfo/{ipAddress}")
	public String ipFy(@PathVariable String ipAddress) {
		RestTemplate restTemplate = new RestTemplate();
		String REST_SERVICE_URI = "https://ipinfo.io/" + ipAddress + "/geo";
//		RequestEntity<IP> reqE = new RequestEntity<IP>(HttpMethod.GET, uri);
//		ResponseEntity<IP> ip = restTemplate.exchange(reqE, IP.class);
//		System.out.println("IP : " + ip.toString());
		ResponseEntity<IP> responseEntity = 
				restTemplate.exchange(REST_SERVICE_URI, HttpMethod.GET, null, IP.class);
		return responseEntity.getBody().toString();
	}
}
