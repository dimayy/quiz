package com.shopify.org.services.services.impl;

import com.shopify.org.dto.UserDto;
import com.shopify.org.services.services.UserService;
import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import com.shopify.org.entities.User;
import com.shopify.org.repository.UserRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl extends BaseService<User, UserDto> implements UserService {

    public UserServiceImpl(UserRepository repository, MapperFacade mapper) {
        super(repository, mapper, User.class, UserDto.class);
    }

}
