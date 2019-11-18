package com.aptech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
	@RequestMapping(value = "goLogin")
	public String goLogin(Model model) {
		return "login";
	}
	@RequestMapping(value = "goIndex")
	public String goIndex(Model model) {
		return "index";
	}
	@RequestMapping(value = "storeList")
	public String storeList(Model model) {
		return "storeList";
	}
	@RequestMapping(value = "scopePosition")
	public String scopePosition(Model model) {
		return "scopePosition";
	}
	@RequestMapping(value = "staffManage")
	public String staffManage(Model model) {
		return "staffManage";
	}
	@RequestMapping(value = "shopType")
	public String shopType(Model model) {
		return "shopType";
	}
	@RequestMapping(value = "shopManage")
	public String shopManage(Model model) {
		return "shopManage";
	}
	@RequestMapping(value = "shopUpload")
	public String shopUpload(Model model) {
		return "shopUpload";
	}
	@RequestMapping(value = "supplier")
	public String supplier(Model model) {
		return "supplier";
	}
	@RequestMapping(value = "purchase")
	public String purchase(Model model) {
		return "purchase";
	}
	@RequestMapping(value = "reception")
	public String reception(Model model) {
		return "reception";
	}
	@RequestMapping(value = "memberinformation")
	public String memberinformation(Model model) {
		return "memberinformation";
	}
	@RequestMapping(value = "memberLevelset")
	public String memberLevelset(Model model) {
		return "memberLevelset";
	}
	@RequestMapping(value = "memberIntegralset")
	public String memberIntegralset(Model model) {
		return "memberIntegralset";
	}
	@RequestMapping(value = "membermatch")
	public String membermatch(Model model) {
		return "membermatch";
	}
	@RequestMapping(value = "memberrecordoftransaction")
	public String memberrecordoftransaction(Model model) {
		return "memberrecordoftransaction";
	}
}
