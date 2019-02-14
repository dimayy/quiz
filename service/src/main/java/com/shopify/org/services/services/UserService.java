package com.shopify.org.services.services;

import com.shopify.org.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserDto findById(long id);

    Page<UserDto> findAll(Pageable pageable);

    UserDto create(UserDto user);

    UserDto update(long id, UserDto user);

    UserDto partialUpdate(long id, UserDto user);

}
