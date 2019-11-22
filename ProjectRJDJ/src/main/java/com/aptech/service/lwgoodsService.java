package com.aptech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aptech.domain.Goods;
import com.aptech.domain.Goodscolor;
import com.aptech.domain.Goodssize;
import com.aptech.domain.Goodstype;
import com.aptech.domain.goods_2;
import com.aptech.domain.goodsonline;
import com.aptech.domain.goodstype_2;
import com.aptech.mapper.GoodsMapper;
import com.aptech.mapper.GoodscolorMapper;
import com.aptech.mapper.GoodssizeMapper;
import com.aptech.mapper.GoodstypeMapper;

@Service
public class lwgoodsService {

		@Autowired
		GoodsMapper ks;
		
		@Autowired
		GoodscolorMapper goodscolorMapper;
		
		@Autowired
		GoodsMapper goodsMapper;
		
		@Autowired
		GoodssizeMapper goodssizeMapper;
		
		@Autowired
		GoodstypeMapper goodstypeMapper;
		
		public List<goods_2> selectgoods(String online,String goodstypename,String name){
			return ks.querygoods_2("%"+online+"%","%"+goodstypename+"%","%"+name+"%");
		}
		
		public List<goodsonline> selectgoodsonline(){
			return ks.querygoodsonline_2();
		}
		
		public List<goodstype_2> selectgoodstype(){
			return ks.querygoodstypename_2();
		}
		
		public int deletegoods(Integer id) {
			return ks.deleteByPrimaryKey(id);
		}
		
		public goods_2 goodsquerybyid(Integer id) {
			return ks.querygoods_2byid(id);
		}
		
		public List<Goodscolor> querycolor() {
			return goodscolorMapper.selectByExample(null);
		}
		public int insertcolor(Goodscolor a) {
			return goodscolorMapper.insert(a);
		}
		public List<Goodssize> querysize(){
			return goodssizeMapper.selectByExample(null);
		}
		public int deletesize(Integer id) {
			return goodssizeMapper.deleteByPrimaryKey(id);
		}
		public int insertsize(Goodssize record) {
			return goodssizeMapper.insert(record);
		}
		public List<Goodstype> inserttype() {
			return goodstypeMapper.selectByExample(null);
		}
		public int delgoods(Integer goodsid) {
			return goodsMapper.deleteByPrimaryKey(goodsid);
		}
		public int insgoods(Goods record) {
			return goodsMapper.insert(record);
		}
		public Goodscolor querybycolor(String color) {
			return goodscolorMapper.querycolorbyname(color);
		}
		public Goodssize querybysize(String size) {
			return goodscolorMapper.querysizebyname(size);
		}
		
}
