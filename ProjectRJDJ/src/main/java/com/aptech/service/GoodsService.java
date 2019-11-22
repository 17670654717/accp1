package com.aptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aptech.domain.Goods;
import com.aptech.domain.Goodstype;
import com.aptech.domain.ShopList;
import com.aptech.domain.Supplier;
import com.aptech.domain.ljhgoods;
import com.aptech.mapper.GoodsMapper;
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
	
	
	@Autowired
	private GoodsMapper mapper02;
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
		List<Supplier> list = mapper01.selectsupplier();
		
		return list;
	}
	
	
	public Supplier selectsupplierid(Supplier su) {
		
		
		return  mapper01.selectsupplierid(su.getSupplierid());
	}
	
	public int insertsupplier(Supplier supp) {
		return mapper01.insertsupplier(supp);
	}
	
	
	public int deletesupplier(Supplier supp) {
		System.out.println("666");
		return mapper01.deletesupplier(supp);
	}
	
	public int updateByPrimaryKey(Supplier sup) {
		return mapper01.updateByPrimaryKey(sup);
	}
	
	
	public List<Supplier> selectsuppliername(Supplier su){
		return mapper01.selectsuppliername(su);
	}
	
	
	public List<Goods> selectgoood(){
		return mapper02.selectgoood();
	}
	
	public List<ljhgoods> selectsy(){
		return mapper02.selectsy();
	}
	
	
	
	public ljhgoods selectgoodsid(ljhgoods su) {
		
		
		return  mapper02.selectgoodsid(su.getGoodsid());
	}
}
