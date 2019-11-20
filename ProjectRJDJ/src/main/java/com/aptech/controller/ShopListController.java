package com.aptech.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.domain.ShopList;
import com.aptech.service.ShopListService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/shop")
public class ShopListController {

	@Autowired
	private ShopListService service;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<ShopList> selectPage(Integer pageNum, Integer pageSize, String uaccount) {
		System.out.println("进入分页查询");
		PageInfo<ShopList> page=service.selectPage(pageNum, pageSize, "123456");
		for (ShopList list : page.getList()) {
			System.out.println(list);
		}
		
		return page;
	}

	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	@ResponseBody
	public ShopList selectByID(int id) {
		System.out.println("进入id查询");
		return service.selectById(id);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> insert(@RequestBody ShopList shop) {
		System.out.println("进入新增");
		int i = service.insert(shop);
		Map<String, String> map = new HashMap<String, String>();
		if (i > 0) {
			map.put("code", "200");
			map.put("message", "新增成功");
		} else {
			map.put("code", "500");
			map.put("message", "新增失败");
		}
		return map;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> delete(int id) {
		System.out.println("进入删除");
		int i = service.delete(id);
		Map<String, String> map = new HashMap<String, String>();
		if (i > 0) {
			map.put("code", "200");
			map.put("message", "删除成功");
		} else {
			map.put("code", "500");
			map.put("message", "删除失败");
		}
		return map;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> update(@RequestBody ShopList shop) {
		System.out.println("进入修改");
		int i = service.update(shop);
		System.out.println(shop.getAddress());
		Map<String, String> map = new HashMap<String, String>();
		if (i > 0) {
			map.put("code", "200");
			map.put("message", "修改成功");
		} else {
			map.put("code", "500");
			map.put("message", "修改失败");
		}
		return map;
	}
}
