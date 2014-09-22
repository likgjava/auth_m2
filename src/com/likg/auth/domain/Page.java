package com.likg.auth.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页列表对象
 * @author likaige
 * @create 2014年3月5日 下午1:44:46
 */
public class Page<T> {
	
	/**
	 * 检索起始位置
	 */
	private int index;
	
	/**
	 * 每页数据量
	 */
	private int pageSize = 10;

	/**
	 * 总记录数
	 */
	private int total;
	
	/**
	 * 列表数据
	 */
	private List<T> rows = new ArrayList<T>();
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

}
