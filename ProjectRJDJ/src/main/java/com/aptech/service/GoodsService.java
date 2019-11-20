package com.aptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aptech.domain.Goodstype;
import com.aptech.domain.ShopList;
import com.aptech.domain.Supplier;
import com.aptech.mapper.GoodstypeMapper;
import com.aptech.mapper.ShopListMapper;
import com.aptech.mapper.SupplierMapper;
@Service
@Transactional
public class GoodsService {
	@Autowired
	private GoodstypeMapper mapper;
	@Autowired
	private SupplierMapper mapper01;
//商品类别
	public List<Goodstype> selectgoodstype() {
		List<Goodstype> list = mapper.selectgoodstype();
		return list;
	}
	
	public int detelegoodstype(Goodstype type) {
	return mapper.detelegoodstype(type.getGoodstypeid());
	}
	
	
	public int insertgoodstype(Goodstype goodstypename) {
		return mapper.insertgoodstype(goodstypename);
		}
	
	
	public Goodstype selectdg(Goodstype em) {
		return mapper.selectdg(em.getGoodstypeid());
	}
	
	
	public int updategoodstype(Goodstype type) {
		return mapper.updategoodstype(type);
		}
	
	//供应商
	public List<Supplier> selectsupplier() {
		System.out.println("222");
		List<Supplier> list = mapper01.selectsupplier();
		
		return list;
	}
}
