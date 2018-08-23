package com.sportmonks.persist;

public interface IPersistDataService {

    void persistAll();

    void persistAllBySeasonId(long seasonId);
}
