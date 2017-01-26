package com.f2m.dao;

import com.f2m.model.TraderRegistration;

import java.sql.SQLException;

/**
 * Created by bakarali on 19/1/17.
 */
public interface TraderDao {
    public void traderDetailsInsert(TraderRegistration registration) throws SQLException;

}
