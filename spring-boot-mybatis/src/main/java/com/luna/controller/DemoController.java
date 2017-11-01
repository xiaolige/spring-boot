package com.luna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.luna.Demo;
import com.luna.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	@RequestMapping("/likeName")
	public List<Demo>  likeName(String name){
		PageHelper.startPage(1,2);
		return demoService.likeName(name);
	}
	@RequestMapping("/save")
	public void save(Demo demo){
		demoService.save(demo);
	}
}
