package com.aptech.controller;

import java.rmi.server.Skeleton;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aptech.domain.Goods;
import com.aptech.domain.Goodscolor;
import com.aptech.domain.Goodssize;
import com.aptech.domain.Goodstype;
import com.aptech.domain.goods_2;
import com.aptech.domain.goodsonline;
import com.aptech.domain.goodstype_2;
import com.aptech.service.lwgoodsService;

import net.sf.jsqlparser.statement.update.Update;

@Controller
public class shopController {
	
	@Autowired
	private lwgoodsService ks;

	
	@RequestMapping("/querygoods")
	@ResponseBody
	public List<goods_2> query(String online,String goodstypename,String name){
		if(online.equals("全部店铺")) {
			online="";
		}
		if(goodstypename.equals("全部类别")) {
			goodstypename="";
		}
		
		return ks.selectgoods(online, goodstypename, name);
	}
	@RequestMapping("/querygoodstype")
	@ResponseBody
	public List<goodstype_2> querytype(){
		
		return ks.selectgoodstype();
	}
	
	@RequestMapping("/updategoods")
	public String Update(Integer id,Model model) {
		model.addAttribute("id",id);
		return "shopUpload";
	}
	
	@RequestMapping("/querygoodsonline")
	@ResponseBody
	public List<goodsonline> queryonline(){
		return ks.selectgoodsonline();
	}
	
	@RequestMapping("/delsize")
	@ResponseBody
	public int delsize(Integer id){
		return ks.deletesize(id);
	}
	
	@RequestMapping("/deletegoods")
	@ResponseBody
	public int deletegoods(Integer id){
		return ks.deletegoods(id);
	}
	
	@RequestMapping("/querygoodssize")
	@ResponseBody
	public List<Goodssize> querygoodssize(){
		return ks.querysize();
	}
	
	@RequestMapping("/querygoodsbyid")
	@ResponseBody
	public goods_2 querygoodsbyid(Integer id){
		return ks.goodsquerybyid(id);
	}
	
	@RequestMapping("/deldel")
	@ResponseBody
	public int deldel(Integer id){
		return ks.delgoods(id);
	}
	
	@RequestMapping("/insertgoods")
	@ResponseBody
	public int insertgoods(@RequestBody goods_2 str){		
		
		int colorid=0;
		int sizeid=0;
		int typeid=0;
		
		Goodscolor stu2=new Goodscolor();
		Goodssize stu3=new Goodssize();
		
		for (Goodstype item : ks.inserttype()) {
			if(item.getGoodstypename().equals(str.getGoodstypename())) {
				typeid=item.getGoodstypeid();
			}
		}
		
		if(ks.querybycolor(str.getColor())==null) {
			stu2.setColor(str.getColor());
			stu2.setGoodscoloursystemid("其他色系");		
			ks.insertcolor(stu2);
			stu2=ks.querybycolor(str.getColor());
			
		}else {
			stu2=ks.querybycolor(str.getColor());
			
		}
		
		
		if(ks.querybysize(str.getSize())==null) {
			stu3.setSize(str.getSize());
			ks.insertsize(stu3);
			stu3=ks.querybysize(str.getSize());
			
		}else {
			stu3=ks.querybysize(str.getSize());
			
		}
		
		
		sizeid=stu3.getGoodssizeid();
		colorid=stu2.getGoodscolorid();
		
		Goods stu1=new Goods(str.getGoodsid(), str.getGoodsname(), str.getBarcode(), str.getSpecification(), str.getInventory(),typeid, str.getSales_price(), str.getCost_price(), str.getOnline_store(), str.getPicture(), str.getBrand(), colorid, sizeid, str.getGoodsmessage());
		return	ks.insgoods(stu1);
		
	}
}
