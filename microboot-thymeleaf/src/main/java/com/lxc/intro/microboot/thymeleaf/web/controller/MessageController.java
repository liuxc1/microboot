package com.lxc.intro.microboot.thymeleaf.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxc.intro.microboot.thymeleaf.AbstractBaseController;
import com.lxc.intro.microboot.thymeleaf.domain.Member;

@Controller
@RequestMapping("/message")
public class MessageController extends AbstractBaseController {
	@RequestMapping("/show_member")//接受参数，跳转页面
	public String showMember(Model model){
		Member member=new Member(110L,"lxc",22,10000.0,new Date());
		model.addAttribute("member", member);
		return "message/show_member";
	}
	
	/**
	 * 6.1
	 */
	@RequestMapping("/show")//接受参数，跳转页面
	public String show(String url,String name,Model model){
		model.addAttribute("name", name);
		model.addAttribute("url", url);
		System.err.println(get("message.welcome.name",name));
		return "message/show_message";
	}
	@RequestMapping("/showStyle")//接受参数，跳转页面
	public String showStyle(String url,String name,Model model){
		model.addAttribute("name","<span style='color: red;'>" +name+"</span>");
		model.addAttribute("url", url);
		
		return "message/show_message_style";
	}
	@RequestMapping("/inner")//接受参数，跳转页面
	public String inner(HttpServletRequest request,Model model){
		//1.普通的model传递数据
		model.addAttribute("model_url", "www.lxc.com");
		//2.使用request传递对象
		request.setAttribute("request_url", "www.lxc.com");
		//3.使用session传递数据
		request.getSession().setAttribute("session_url", "www.lxc.com");
		//4.使用application传递数据
		request.getServletContext().setAttribute("application_url", "www.lxc.com");

		return "message/show_message_inner";
	}
	/**
	 * 6.5逻辑判断
	 */
	@RequestMapping("show_if")
	public String showIf(Model model){
		Member member=new Member(130L,"xxx",22,100000.0,new Date());
		model.addAttribute("member", member);
		return "message/show_if";
	}
	/**
	 * 6.6迭代数据 list集合
	 */
	@RequestMapping("/list")
	public String list(Model model){
		List<Member> list=new ArrayList<Member>();
		for (int i = 0; i < 10; i++) {
			Member member=new Member(i+0l,"xxx"+i,22,100000.0,new Date());
			list.add(member);
		}
		model.addAttribute("list", list);
		
		return "message/show_list";
	}
	/**
	 * 6.6迭代数据 map集合
	 */
	@RequestMapping("/map")
	public String map(Model model){
		Map<String,Member> map=new HashMap<String,Member>();
		for (int i = 0; i < 10; i++) {
			Member member=new Member(i+0l,"xxx"+i,22,100000.0,new Date());
			map.put(i+"",member);
		}
		model.addAttribute("map", map);
		return "message/show_list";
	}
	
	@RequestMapping("/set")
	public String set(Model model){
		Set<Integer> set1=new  HashSet<Integer>();
		Set<String> set2=new  HashSet<String>();
		for (int i = 0; i < 10; i++) {
			set2.add("lxc-"+i);
			set1.add(i);
		}
		model.addAttribute("set1", set1);
		model.addAttribute("set2", set2);
		model.addAttribute("myDate", new Date());
		
		return "message/show_set";
	}
	
}
