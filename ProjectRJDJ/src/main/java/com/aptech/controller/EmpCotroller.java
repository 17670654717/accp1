package com.aptech.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.domain.Employee;
import com.aptech.domain.Position;
import com.aptech.domain.ShopList;
import com.aptech.service.EmpService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/emp")
public class EmpCotroller {
	
	@Autowired
	private EmpService service;
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	@ResponseBody
	public PageInfo<Employee> selectByConditions(Integer pageNum, Integer pageSize, Integer shopId, Integer positionId, String employeeName) {
		System.out.println("进入分页查询");
		PageInfo<Employee> page=service.selectByConditions(pageNum, pageSize, shopId, positionId, employeeName);
		for (Employee list : page.getList()) {
			System.out.println(list);
		}
		return page;
	}

	@RequestMapping(value = "/selectShop", method = RequestMethod.GET)
	@ResponseBody
	public List<ShopList> selectShop(){
		System.out.println("进入getshop");
		return service.selectShop();
	}
	
	@RequestMapping(value = "/selectPos", method = RequestMethod.GET)
	@ResponseBody
	public List<Position> selectPos(){
		System.out.println("进入getpos");
		return service.selectPos();
	}
	
	@RequestMapping(value = "/selectById", method = RequestMethod.GET)
	@ResponseBody
	public Employee selectByID(int id) {
		System.out.println("进入id查询");
		System.out.println(service.selectById(id));
		return service.selectById(id);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> insert(@RequestBody Employee emp) {
		System.out.println("进入新增");
		int i = service.insert(emp);
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
	public Map<String, String> update(@RequestBody Employee emp) {
		System.out.println("进入修改");
		int i = service.update(emp);
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
