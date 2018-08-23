package com.sportmonks.persist.entity;

public interface IPersistByIdRestEntityService<T> {

    void persistEntity(T entity);

    void persistAllEntities();
}
