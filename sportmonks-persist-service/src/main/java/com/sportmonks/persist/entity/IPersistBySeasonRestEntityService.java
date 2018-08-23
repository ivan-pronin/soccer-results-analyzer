package com.sportmonks.persist.entity;

public interface IPersistBySeasonRestEntityService<T> {

    void persistEntity(T entity);

    void persistAllEntities(long seasonId);
}
