package com.epam.porject.service.impl;

import com.epam.porject.mapper.UserMapper;
import com.epam.porject.model.dto.UserDto;
import com.epam.porject.model.entitity.User;
import com.epam.porject.repository.UserRepository;
import com.epam.porject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<UserDto> findAll() {
        return UserMapper.INSTANCE.toDtos(userRepository.findAll());
        // return userMapper.toDtos(repository.findAll());
    }

    @Override
    public UserDto findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.INSTANCE.toDto(user);
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = UserMapper.INSTANCE.toEntity(userDto);
        user = userRepository.save(user);
        return UserMapper.INSTANCE.toDto(user);
    }

    @Override
    public UserDto update(UserDto userDto) {
        if (!userRepository.existsById(userDto.getId())) {
            throw new RuntimeException("User not found");
        }
        User user = UserMapper.INSTANCE.toEntity(userDto);
        user = userRepository.save(user);
        return UserMapper.INSTANCE.toDto(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
