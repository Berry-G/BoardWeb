package com.kyc.board;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello(Model model)
	{
		model.addAtrribute("naem");
	}

}
