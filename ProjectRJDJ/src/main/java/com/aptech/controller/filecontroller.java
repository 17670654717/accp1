package com.aptech.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aptech.domain.Goods;
import com.aptech.domain.Goodscolor;
import com.aptech.domain.Goodssize;
import com.aptech.domain.Goodstype;
import com.aptech.domain.goods_2;
import com.aptech.service.lwgoodsService;


@Controller
@RequestMapping("/file")
public class filecontroller {

	@Autowired
	lwgoodsService ks;
	
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile [] files) {
		File directory = new File("C:/Users/lenovo 001/Desktop/ProjectRJDJ/src/main/resources/static/images/");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "C:/Users/lenovo 001/Desktop/ProjectRJDJ/src/main/resources/static/images/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte []> download(){
		try {
			FileInputStream is = new FileInputStream("C:/Users/lenovo 001/Desktop/ProjectRJDJ/src/main/resources/static/editor/导出的信息.xlsx");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", new String("模板.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String online,String goodstypename,String name){
		if(online.equals("全部店铺")) {
			online="";
		}
		if(goodstypename.equals("全部类别")) {
			goodstypename="";
		}
		List<goods_2> list=ks.selectgoods(online, goodstypename, name);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();		
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("序号");
		titleRow.createCell(1).setCellValue("类别");
		titleRow.createCell(2).setCellValue("品名");
		titleRow.createCell(3).setCellValue("货号/条码");
		titleRow.createCell(4).setCellValue("规格");
		titleRow.createCell(5).setCellValue("库存");
		titleRow.createCell(6).setCellValue("销售价");
		titleRow.createCell(7).setCellValue("成本价");
		titleRow.createCell(8).setCellValue("颜色");
		titleRow.createCell(9).setCellValue("尺码");
		titleRow.createCell(10).setCellValue("网点同步");
		for(int i=0;i<list.size();i++) {
			
			Row row = sheet.createRow(i+1);
			Cell idCell = row.createCell(0);
			idCell.setCellValue(list.get(i).getGoodsid());
			Cell typeCell = row.createCell(1);
			typeCell.setCellValue(list.get(i).getGoodstypename());
			Cell nameCell = row.createCell(2);
			nameCell.setCellValue(list.get(i).getGoodsname());
			Cell broCell = row.createCell(3);
			broCell.setCellValue(list.get(i).getBarcode());
			Cell spCell = row.createCell(4);
			spCell.setCellValue(list.get(i).getSpecification());
			Cell inCell = row.createCell(5);
			inCell.setCellValue(list.get(i).getInventory());
			Cell saCell = row.createCell(6);
			saCell.setCellValue(list.get(i).getSales_price());
			Cell coCell = row.createCell(7);
			coCell.setCellValue(list.get(i).getCost_price());
			Cell colorCell = row.createCell(8);
			colorCell.setCellValue(list.get(i).getColor());
			Cell sizeCell = row.createCell(9);
			sizeCell.setCellValue(list.get(i).getSize());
			Cell tbCell = row.createCell(10);
			tbCell.setCellValue(list.get(i).getOnline_store());
		}
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("导出的信息.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	
	@RequestMapping("/excelUpload")
	public String excelUpload(MultipartFile file,String check) {
		try {
			Workbook wb = new XSSFWorkbook(file.getInputStream());		
			int sheets = wb.getNumberOfSheets();
			for(int i=0;i<sheets;i++) {
				
				Sheet sheet = wb.getSheetAt(i);
				
				int rows = sheet.getPhysicalNumberOfRows();
				for(int j=1;j<rows;j++) {
					int colorid=0;
					int sizeid=0;
					int typeid=0;
					
					Goodscolor stuc=new Goodscolor();
					Goodssize stus=new Goodssize();
					
					Row row = sheet.getRow(j);
					Cell stu1 = row.getCell(0);
					Cell stu2 = row.getCell(1);
					Cell stu3 = row.getCell(2);
					Cell stu4 = row.getCell(3);
					Cell stu5 = row.getCell(4);
					Cell stu6 = row.getCell(5);
					Cell stu7 = row.getCell(6);
					Cell stu8 = row.getCell(7);
					Cell stu9 = row.getCell(8);
					Cell stu10 = row.getCell(9);
					
					for (Goodstype item : ks.inserttype()) {
						if(item.getGoodstypename().equals(stu2.getStringCellValue())) {
							typeid=item.getGoodstypeid();
						}
					}
					
					if(ks.querybycolor(stu9.getStringCellValue())==null) {
						stuc.setColor(stu9.getStringCellValue());
						stuc.setGoodscoloursystemid("其他色系");		
						ks.insertcolor(stuc);
						stuc=ks.querybycolor(stu9.getStringCellValue());
						
					}else {
						stuc=ks.querybycolor(stu9.getStringCellValue());
						
					}
					
					Double stu101=stu10.getNumericCellValue();
					
					String stu10s=stu101.intValue()+"";
					
					  if(ks.querybysize(stu10s)==null) {
					  stus.setSize(stu10s);
					  ks.insertsize(stus);
					  stus=ks.querybysize(stu10s);
					  
					  }else { stus=ks.querybysize(stu10s);
					  
					  }
					 
					
					sizeid=stus.getGoodssizeid();
					colorid=stuc.getGoodscolorid();
					
					
					  Double id=stu1.getNumericCellValue();
					  
					  Double kc=stu6.getNumericCellValue();
					  
					  Double s1=stu7.getNumericCellValue();
					  
					  Double s2=stu8.getNumericCellValue();
					  
					  Double s3=stu4.getNumericCellValue();
					  
					  String s33=s3.intValue()+"";
					 
					
					Goods sky=new Goods(id.intValue(), stu3.getStringCellValue(), s33, stu5.getStringCellValue(), kc.intValue(),typeid, s1.floatValue(), s2.floatValue(),check, "","", colorid, sizeid, "");
					ks.insgoods(sky);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/index";
	}
	
}
