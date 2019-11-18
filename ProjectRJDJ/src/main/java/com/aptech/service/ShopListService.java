package com.aptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aptech.domain.ShopList;
import com.aptech.mapper.ShopListMapper;

@Service
@Transactional
public class ShopListService {

	@Autowired
	private ShopListMapper mapper;

	public List<ShopList> selectAll() {
		List<ShopList> list = mapper.selectAll();
		return list;
	}

	public int update(ShopList shop) {
		return mapper.updateByPrimaryKey(shop);
	}
}
