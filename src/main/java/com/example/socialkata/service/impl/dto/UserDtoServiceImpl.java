package com.example.socialkata.service.impl.dto;
import com.example.socialkata.dao.abstracts.dto.UserDtoDao;
import com.example.socialkata.model.dto.UserDto;
import com.example.socialkata.model.entity.user.User;
import com.example.socialkata.service.abstracts.dto.UserDtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserDtoServiceImpl implements UserDtoService {

    @Autowired
    UserDtoDao userDtoDao;

    @Override
    public UserDto findUserDtoById(Long id) {
        return userDtoDao.findUserDtoById(id);
    }

    public boolean isExist(Long userId) {
        return userDtoDao.isExist(userId);
    }

}
