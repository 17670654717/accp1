package com.aptech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.domain.Goods;
import com.aptech.domain.Goodstype;
import com.aptech.domain.Supplier;
import com.aptech.domain.ljhgoods;
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
	
	
	//跳供应商
	@RequestMapping("/supplier")
	public String spleb2() {
		return "supplier";
	}
	
	//跳采购单
	@RequestMapping("/purchase")
	public String splebh() {
		return "purchase";
	}
	
	
	//跳主页面
		@RequestMapping("/index")
		public String index() {
			return "index";
		}
		
		//增加采购单
		@RequestMapping("/addPuchase")
		public String index2() {
			return "addPuchase";
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
	
	//删除
	@RequestMapping("/detelesupplier")
	@ResponseBody
	public int detelesupplier(Supplier supp){
		int  list= sb.deletesupplier(supp);
		return list;
	}
	
	
	//修改
	@RequestMapping("/selectsupplierid")
	@ResponseBody
	public Supplier selectsupplierid(Supplier supplierid){
		
		Supplier  list= sb.selectsupplierid(supplierid);
		return list;
	}
	//修改
	@RequestMapping("/updatesupplier")
	@ResponseBody
	public int updatesupplier(Supplier supp){
		int  list= sb.updateByPrimaryKey(supp);
		return list;
	}
	
	//条件查询
	@RequestMapping("/selectsuppliername")
	@ResponseBody
	public List<Supplier> selectsuppliername(Supplier su){
		List<Supplier>  list= sb.selectsuppliername(su);
		return list;
	}
	
	//
	@RequestMapping("/selectgoood")
	@ResponseBody
	public List<ljhgoods> selectgoood(){
		List<ljhgoods>  list= sb.selectsy();
		return list;
	}
	
	
	
	@RequestMapping("/selectgooodsid")
	@ResponseBody
	public ljhgoods selectgooodid(ljhgoods goodsid){
		
		ljhgoods  list= sb.selectgoodsid(goodsid);
		return list;
	}
}
