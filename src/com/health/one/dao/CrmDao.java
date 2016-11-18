package com.health.one.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.health.one.model.Customerbaseinfo;
import com.health.one.model.TbFinishedpay;
import com.health.one.model.Tbsale;
import com.health.one.model.Tbuserinfo;



public interface CrmDao {
	
	public Collection findCustomerByMap(Map<String,String> map,int page,int max);
	
	public List findForPage(final String hql,final int offset,final int length);
	
	public List findListByHql(String hql);
	
	public void insertOrUpdate(TbFinishedpay tb);

	public void delete(TbFinishedpay tb);
	
	
/*
 * 增加客户基本信息表
 * */
	public void insertOrUpdateCustomerBaseInfo(Customerbaseinfo customerbaseinfo);
	
/*
 * 删除客户基本信息
 * */	
	public void deleteCustomerBaseInfo(Customerbaseinfo customerbaseinfo);
	
	
/*
 * 增加销售信息
 * */	
	public void insertOrUpdateSale(Tbsale tbsale);
	
/*
 * 删除销售信息
 * */	
	public void deleteTbsale(Tbsale tbsale);
	
	
/*
 * 用户管理，增加用户
 * */
	public void insertOrUpdateUser(Tbuserinfo userinfo);
	
/*
 * 删除用户
 * */	
	public void deleteUserinfo(Tbuserinfo userinfo);
	
	public Object getObjectById(Object ob ,int id);
	
}
