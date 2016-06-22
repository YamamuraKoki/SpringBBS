package jp.co.SpringBBS.mapper;

import java.util.List;

import jp.co.SpringBBS.dto.UserDto;
import jp.co.SpringBBS.entity.User;
import jp.co.SpringBBS.entity.UserManagement;

public interface Mapper {
	User getUserData(int id);
	List<UserManagement> getUserList();
	int getUserData(UserDto dto);
}
