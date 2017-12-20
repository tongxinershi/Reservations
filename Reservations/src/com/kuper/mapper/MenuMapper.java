package com.kuper.mapper;

import java.util.List;

import com.kuper.domain.Menu;

public interface MenuMapper {

	List<Menu> getAll();
	Menu findById(Long id);
	void save(Menu menu);
	void update(Menu menu);
	void del(Long id);
	
	List<Menu> getAllParentMenu();
	List<Menu> findChildrenMenuByParentId(Long parentId);
	
}
