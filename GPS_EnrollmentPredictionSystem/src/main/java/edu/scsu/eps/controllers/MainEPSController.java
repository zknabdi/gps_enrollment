/**
 * 
 */
package edu.scsu.eps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author znabd
 *
 */
@Controller
public class MainEPSController {

	@GetMapping("/")
	public String showMainPage() {
		return "index";
	}
}
