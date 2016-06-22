package jp.co.SpringBBS.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.SpringBBS.dto.UserDto;
import jp.co.SpringBBS.dto.UserManagementDto;
import jp.co.SpringBBS.entity.User;
import jp.co.SpringBBS.entity.UserManagement;
import jp.co.SpringBBS.mapper.Mapper;

@Service
public class UserService {

	@Autowired
	private Mapper mapper;

	public UserDto getUserData(Integer id) {
		UserDto dto = new UserDto();
		User entity = mapper.getUserData(id);
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

	public List<UserManagementDto> getUserList() {
		List<UserManagement> userList = mapper.getUserList();
		List<UserManagementDto> resultList = convertToDto(userList);
		return resultList;
	}

	private List<UserManagementDto> convertToDto(List<UserManagement> userList) {
		List<UserManagementDto> resultList = new LinkedList<>();
		for(UserManagement entity : userList) {
			UserManagementDto dto = new UserManagementDto();
			BeanUtils.copyProperties(entity, dto);
			resultList.add(dto);
		}
		return resultList;
	}

	public int getUserData(UserDto dto) {
		int count = mapper.getUserData(dto);
		return count;
	}
}
