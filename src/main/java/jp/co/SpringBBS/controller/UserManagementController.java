package jp.co.SpringBBS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.SpringBBS.dto.UserManagementDto;
import jp.co.SpringBBS.service.UserService;

@Controller
public class UserManagementController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/management/", method = RequestMethod.GET)
	public String userList(Model model) {
		List<UserManagementDto> lists = userService.getUserList();
		model.addAttribute("userList", lists);
		return "management";
	}

//	@RequestMapping(value = "/management/settings/input/{id}/", method = RequestMethod.GET)
//	public String settings(Model model, @PathVariable int id) {
//		UserDto userData = userService.getUserData(id);
//		model.addAttribute("userData", userData);
//		SettingForm form = new SettingForm();
//		form.setId(userData.getId());
//		form.setLoginId(userData.getLoginId());
//		form.setName(userData.getName());
//		form.setBranch(userData.getBranch());
//		form.setPosition(userData.getPosition());
//		model.addAttribute("settingForm", form);
//		return "settings";
//	}
//
//	@RequestMapping(value = "/management/settings/input/{id}/", method = RequestMethod.POST)
//	public String settings(Model model, @ModelAttribute SettingForm form) {
//		UserDto dto = new UserDto();
//		BeanUtils.copyProperties(form, dto);
//		int count = userService.getUserData(dto);
//		Logger.getLogger(UserManagementController.class).log(Level.INFO, "更新件数は" + count + "件です。");
//		return "redirect:/management/";
//	}
}
