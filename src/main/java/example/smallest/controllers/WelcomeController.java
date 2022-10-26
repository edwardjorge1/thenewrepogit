package example.smallest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		//Flux
		
		
		
		
		return "I LEARNED EVERYTHING IN THE DOCKER STUFF, BASTION , VPC , EC2 , COCK , LOAD BALANCER, BINDING PORTS, NAT GATEWAY, NAVIGATING DOCKERHUB AS WELL AS GITHUB AND PORNHUB"; //"application/json" mean this is a text not a redirect
	}
}
