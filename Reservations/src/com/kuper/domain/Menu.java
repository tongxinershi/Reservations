package com.kuper.domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private Long id;
	private String sn;//菜单编号 必填
	private String name;//菜单名称 必填
	private Menu parent;//父菜单,多对一
	private String icon;
	private String url;
	private String intro;
	
	private List<Menu> children = new ArrayList<Menu>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getText() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu getParent() {
		return parent;
	}
	public void setParent(Menu parent) {
		this.parent = parent;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public List<Menu> getChildren() {
		return children;
	}
	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	
	
	

}
