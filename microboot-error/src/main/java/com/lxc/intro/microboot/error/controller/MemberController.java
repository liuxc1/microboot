package com.lxc.intro.microboot.error.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxc.intro.microboot.error.AbstractBaseController;
import com.lxc.intro.microboot.error.model.Member;

@Controller
@RequestMapping("/member")
public class MemberController extends AbstractBaseController {
	@RequestMapping(value = "/add_pre", method = RequestMethod.GET)
	public String addMemberPre() {
		//System.out.println(10/0);
		return "member/add_pre";
	}
	@ResponseBody
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Object add(@Valid Member me,BindingResult bindingResult) {
		if(bindingResult.hasErrors()){//表示提交的数据出现了错误
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.err.println("错误code:" + objectError.getCode() + "，错误信息："+objectError.getDefaultMessage());
			}
			return bindingResult.getAllErrors();
		}else{
			return me;
		}
	}
	
}
