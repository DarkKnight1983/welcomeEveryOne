package com.health.one.dao;

import java.util.List;

public interface BasesqlDao {
	
	public List findForPage(final String sql,final int offset,final int length);
	
	/*
	 * 根据SQL语句查询
	 * */
	public List findListBySql(final String sql);

}
