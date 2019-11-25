package com.aptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aptech.domain.Goods;
import com.aptech.domain.Goodstype;
import com.aptech.domain.Particulars;
import com.aptech.domain.Purchasenote;
import com.aptech.domain.ShopList;
import com.aptech.domain.Supplier;
import com.aptech.domain.ljhgoods;
import com.aptech.mapper.GoodsMapper;
import com.aptech.mapper.GoodstypeMapper;
import com.aptech.mapper.ParticularsMapper;
import com.aptech.mapper.PurchasenoteMapper;
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
	
	
	@Autowired
	private PurchasenoteMapper mapper03;
	
	
	@Autowired
	private ParticularsMapper mapper04;
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
	
	
	
	public String selectco(String purchaseid){
		int conunt=mapper03.selectcon(purchaseid+"%")+1;
		String jb=purchaseid;
		if (conunt<=9) {
			jb+="00"+conunt;
		} else {
			jb+="0"+conunt;
		}
		return jb;
	}
	
	
	public List<Purchasenote> selectpurchasenote(){
		return mapper03.selectpurchasenote();
	}
	
	
	public int delete001(Purchasenote pu) {
		System.out.println("666");
		return mapper03.delete001(pu);
	}
	
	
	
	public List<Purchasenote> selectpurchasenoteok(String deliverytime2,String deliverytime1,String supplier2,String purchaseid){
		return mapper03.selectpurchasenoteok(deliverytime2,deliverytime1,supplier2,purchaseid);
	}
	
	
	
	
	public int delete002(Particulars pu) {
		return mapper04.delete002(pu);
	}
	
	
	public List<Purchasenote> selectpurchasenoteid(Purchasenote purchaseid){
		return mapper03.selectpurchasenoteid(purchaseid);
	}
	
	
	public List<Particulars> selectparticularsid(Particulars purchaseid){
		return mapper04.selectparticularsid(purchaseid);
	}
	
	public int insertpurchasenote(Purchasenote pu) {
		return mapper03.insertpurchasenote(pu);
	}
	
	public int insertpurchasenot(Purchasenote pu) {
		return mapper03.insertpurchasenot(pu);
	}
	
	public int insertpurchasenotekk(Purchasenote pu) {
		return mapper03.insertpurchasenotekk(pu);
	}
	
	public int insertpurchasenotkk(Purchasenote pu) {
		return mapper03.insertpurchasenotkk(pu);
	}
}
