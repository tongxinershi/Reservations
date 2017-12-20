package com.kuper.query;

import java.util.ArrayList;
import java.util.List;
/**
 * 分页参数和数据类
 * @author kuper
 *
 */
public class PageList {
	//数据
	private List<Object> data = new ArrayList<Object>();
	//分页参数
	private Integer total;
	private Integer totalPage;
	private Integer currentPage;
	private Integer nextPage;
	private Integer upPage;
	private Integer firstPage;
	private Integer lastPage;
	
	
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getNextPage() {
		return nextPage;
	}
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}
	public Integer getUpPage() {
		return upPage;
	}
	public void setUpPage(Integer upPage) {
		this.upPage = upPage;
	}
	public Integer getFirstPage() {
		return firstPage;
	}
	public void setFirstPage(Integer firstPage) {
		this.firstPage = firstPage;
	}
	public Integer getLastPage() {
		return lastPage;
	}
	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}
	
	
}
