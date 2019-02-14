package com.shopify.org.repository;

import com.shopify.org.entities.BaseProjectEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@AllArgsConstructor
public class CustomBaseRepositoryImpl<T extends BaseProjectEntity> implements CustomBaseRepository<T> {

    private final EntityManager entityManager;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public T refresh(T entity) {
        return (T) entityManager.find(entity.getClass(), entity.getId());
    }

}
