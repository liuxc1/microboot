package com.lxc.intro.microboot.upload.web;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * 文件上传
 */
@Controller
public class FileUploadController {
	/**
	 *跳转主页
	 * @return
	 */
	@RequestMapping("/upload_page")
	public String uploadPage(){
		
		return "upload/upload_page";
	}
	
	/**
	 * 上传方法
	 */
	@ResponseBody
	@RequestMapping("/upload")
	public String upload(String name,HttpServletRequest request){
		//判断请示是否是多文件的请求
		if(request instanceof MultipartHttpServletRequest){//使用request获取到 MultipartHttpServletRequest
			//强转
			MultipartHttpServletRequest mRequest=(MultipartHttpServletRequest)request;
			Iterator<String> fileNames = mRequest.getFileNames();//获取到上传的文件name
			while (fileNames.hasNext()) {
				MultipartFile file = mRequest.getFile(fileNames.next());
				if(file!=null){
					System.out.println("普通表单字段："+name);
					System.out.println("注入的类类型："+file.getClass());
					System.out.println("上传的文件名称1："+file.getName());
					System.out.println("上传的文件名称："+file.getOriginalFilename());
					System.out.println("上传的文件类型："+file.getContentType());
					System.out.println("上传的文件大小："+file.getSize());
				}
			}
		}
		return "ok";
	}
	
	
}
