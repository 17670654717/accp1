package com.aptech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.domain.Goodstype;
import com.aptech.domain.Supplier;
import com.aptech.service.GoodsService;

@Controller  
public class GoodsController {
	@Autowired
	GoodsService sb;
	
	//跳商品类别
	@RequestMapping("/spleb")
	public String spleb() {
		return "shopType";
	}
	
	@RequestMapping("/selectgoodstype")
	@ResponseBody
	public List<Goodstype> selectgoodstype(){
		List<Goodstype>  list= sb.selectgoodstype();
		return list;
	}
	
	
	@RequestMapping("/detelegoodstype")
	@ResponseBody
	public int detelegoodstype(Goodstype goodstypeid){
		int  list= sb.detelegoodstype(goodstypeid);
		return list;
	}
	
	
	
	@RequestMapping("/insertgoodstype")
	@ResponseBody
	public int inserttb_detail(@RequestBody Goodstype goodstypename){
		int list = sb.insertgoodstype(goodstypename);
		return list;
	}
	
	
	@RequestMapping("/selectdg")
	@ResponseBody  
	public Goodstype selectdg(Goodstype goodstypeid) {
		Goodstype stu = sb.selectdg(goodstypeid);
		return stu;
		
	}	
	
	
	@RequestMapping("/updategoodstype")
	@ResponseBody
	public int updategoodstype(Goodstype type){
		int  list= sb.updategoodstype(type);
		return list;
	}
	
	
	//跳供应商
	@RequestMapping("/supplier")
	public String spleb2() {
		return "supplier";
	}
	
	//跳增加采购单
	@RequestMapping("/add")
	public String splebh() {
		return "addPuchase";
	}
	
	//供应商方法查询开始
	@RequestMapping("/selectsupplier")
	@ResponseBody
	public List<Supplier> selectsupplier(){
		System.out.println("1111");
		List<Supplier>  list= sb.selectsupplier();
		return list;
	}
	
	//新增
	@RequestMapping("/insertsupplier")
	@ResponseBody
	public int insertsupplier(@RequestBody Supplier supp){
		int  list= sb.insertsupplier(supp);
		return list;
	}
	
	
	@RequestMapping("/detelesupplier")
	@ResponseBody
	public int detelesupplier(Supplier supp){
		int  list= sb.deletesupplier(supp);
		return list;
	}
}
