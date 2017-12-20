package com.kuper.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kuper.domain.Menu;
import com.kuper.service.IMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private IMenuService service;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Menu> list(){
		List<Menu> menus = service.getMenus();
		return menus;
	}
}
