package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Items;


public interface ItemsService {

	
	public List<Items> list() throws Exception;
	
	public Items findItemsById(Integer id) throws Exception;
	
	public void updateItems(Items items) throws Exception;
}
