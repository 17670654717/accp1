package com.aptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aptech.domain.Employee;
import com.aptech.domain.Position;
import com.aptech.domain.ShopList;
import com.aptech.mapper.EmployeeMapper;
import com.aptech.mapper.PositionMapper;
import com.aptech.mapper.ShopListMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class EmpService {
	
	@Autowired
	private EmployeeMapper empMapper;
	@Autowired
	private ShopListMapper shopMapper;
	@Autowired
	private PositionMapper posMapper;
	
	public List<ShopList> selectShop(){
		return shopMapper.selectByExample(null);
	}
	
	public List<Position> selectPos(){
		return posMapper.selectByExample(null);
	}
	
	public PageInfo<Employee> selectByConditions(Integer pageNum, Integer pageSize, Integer shopId, Integer positionId, String employeeName) {
		Page<Employee> page = PageHelper.startPage(pageNum, pageSize);
		empMapper.selectByConditions(shopId, positionId, employeeName);
		return page.toPageInfo();
	}
	
	public Employee selectById(int id) {
		return empMapper.selectByPrimaryKey(id);
	}

	public int insert(Employee emp) {
		return empMapper.insert(emp);
	}

	public int delete(Integer id) {
		return empMapper.deleteByPrimaryKey(id);
	}

	public int update(Employee emp) {
		return empMapper.updateByPrimaryKey(emp);
	}
}
