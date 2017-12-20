package com.kuper.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuper.domain.Menu;
import com.kuper.mapper.MenuMapper;
import com.kuper.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService{

	@Autowired
	MenuMapper mapper;
	
	@Override
	public List<Menu> getAll() {
		
		return mapper.getAll();
	}

	@Override
	public Menu findById(Long id) {
		
		return mapper.findById(id);
	}

	@Override
	public void save(Menu menu) {
		mapper.save(menu);
		
	}

	@Override
	public void update(Menu menu) {
		mapper.update(menu);
		
	}

	@Override
	public void del(Long id) {
		mapper.del(id);
		
	}

	@Override
	public List<Menu> getAllParentMenu() {
		
		return mapper.getAllParentMenu();
	}

	@Override
	public List<Menu> findChildrenMenuByParentId(Long parentId) {
		
		return mapper.findChildrenMenuByParentId(parentId);
	}
	@Override
	public List<Menu> getMenus(){
		List<Menu> menus = getAllParentMenu();
		for (Menu menu : menus) {
			List<Menu> children = findChildrenMenuByParentId(menu.getId());
			menu.setChildren(children);
		}
		
		return menus;
		
		
	}
	

}
