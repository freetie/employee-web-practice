package com.github.freetie.employee.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.freetie.employee.entity.Account;
import com.github.freetie.employee.service.AccountService;

@Controller
public class SessionController {

	AccountService accountService;

	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping("/login.action")
	public String login(Account account, Model model, HttpSession session) {
		Account foundAccount = accountService.findByName(account.getName());
		if (foundAccount == null) {
			model.addAttribute("msg", "用户名不存在");
			return "login";
		}
		if (!foundAccount.getPassword().equals(account.getPassword())) {
			model.addAttribute("msg", "密码错误");
			return "login";
		}
		session.setAttribute("user", foundAccount);
		return "redirect:employee";
	}
}
