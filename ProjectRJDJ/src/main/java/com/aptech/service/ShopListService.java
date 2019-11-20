package com.aptech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aptech.domain.ShopList;
import com.aptech.mapper.ShopListMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ShopListService {

	@Autowired
	private ShopListMapper mapper;

	public PageInfo<ShopList> selectPage(Integer pageNum, Integer pageSize, String uaccount) {
		Page<ShopList> page = PageHelper.startPage(pageNum, pageSize);
		mapper.selectByUaccount(uaccount);
		return page.toPageInfo();
	}

	public ShopList selectById(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	public int insert(ShopList shop) {
		return mapper.insert(shop);
	}

	public int delete(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	public int update(ShopList shop) {
		return mapper.updateByPrimaryKey(shop);
	}
}
