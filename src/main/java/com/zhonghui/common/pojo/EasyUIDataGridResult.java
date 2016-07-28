package com.zhonghui.common.pojo;

import java.util.List;
/**
 * 用于返回商品数据
 * @author DELL
 *
 */
public class EasyUIDataGridResult {
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
