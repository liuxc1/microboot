package com.lxc.intro.microboot.swagger.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lxc.intro.microboot.swagger.domain.Member;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/member")
public class MemberController {
	@ApiOperation(value = "实现成员添加", notes = "就是对人员的添加")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "member", value = "用户描述的详细实体信息", required = true, dataType = "Member") })
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Object add(@RequestBody Member member) {
		System.out.println("【member】" + member);
		return true;
	}

	@ApiOperation(value = "获取成员实体信息", notes = "xxxxx")
	@ApiImplicitParams({ @ApiImplicitParam(name = "mid", value = "用户id", required = true, dataType = "Member") })
	@RequestMapping(value="/get/{mid}",method=RequestMethod.GET)
	public Member add(@PathVariable(value = "mid") String mid) {
		Member member = new Member();
		member.setAge(24);
		member.setMid(mid);
		member.setName("liuxc1");
		return member;
	}

}
