package com.aptech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.domain.ShopList;
import com.aptech.service.ShopListService;

@Service
public class ShopListController {

	@Autowired
	private ShopListService service;
	
	public List<ShopList> selectAll(){
		return service.selectAll();
	}
	
	public int update(ShopList shop) {
		return service.update(shop);
	}
}
