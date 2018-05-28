package com.lxc.intro.microboot.upload.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxc.intro.microboot.upload.domain.User;
import com.lxc.intro.microboot.upload.service.IMemberService;

@Controller
public class MemberController {
	@Autowired
	private IMemberService service; 
	
	@ResponseBody
	@RequestMapping("/get")
	public User get(String id){
		
		return service.get(id);
	}
	@ResponseBody
	@RequestMapping("/println")
	public String println(){
		service.printlt();
		return "ok";
	}
	
	
	@RequestMapping("/member_add_pre")
	public String memberAddPre() {

		return "member/member_addPre";
	}

	@ResponseBody
	@RequestMapping(value = "/member_add", method = RequestMethod.POST)
	public Object memberAdd(User user) {

		return user;

	}
}
