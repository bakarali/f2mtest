package com.f2m.dao;//package com.f2m.dao;
//
//import com.f2m.model.TraderRegistration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementCreator;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
///**
// * Created by bakarali on 19/1/17.
// */
//
//public class TraderDaoImpl {
//    private JdbcTemplate jdbcTemplate;
//    public TraderDaoImpl(DataSource dataSource){
//        jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//    public void traderInsert(TraderRegistration registration) {
//        KeyHolder keyHolder = new GeneratedKeyHolder();
//        String sql = "INSERT INTO TraderDetails (id, name, email, password, phone_no, company,address,image_id)"
//                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
//        jdbcTemplate.update(
//                new PreparedStatementCreator(){
//                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                        PreparedStatement ps =
//                                connection.prepareStatement(sql, new String[] {"id"});
//                        ps.setInt(1, registration.getId());
//                        ps.setString(2, registration.getName());
//                        ps.setString(3, registration.getEmail());
//                        ps.setString(4, registration.getPassword());
//                        ps.setLong(5, registration.getPhone_no());
//                        ps.setString(6, registration.getCompany());
//                        ps.setString(7, registration.getAddress());
//                        ps.setString(8,registration.getImage_id());
//
//                        return ps;
//                    }
//                }, keyHolder);
//    }
//
//}


import com.f2m.model.TraderRegistration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import javax.activation.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TraderDaoImpl  implements TraderDao{
    private JdbcTemplate jdbcTemplate;
    public TraderDaoImpl(javax.sql.DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void traderDetailsInsert(TraderRegistration registration){
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO TraderDetails (id, name, email, password, phone_no, company,address,image_id)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(
                new PreparedStatementCreator(){
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(sql, new String[] {"id"});
        ps.setInt(1, registration.getId());
        ps.setString(2, registration.getName());
        ps.setString(3, registration.getEmail());
        ps.setString(4, registration.getPassword());
        ps.setLong(5, registration.getPhone_no());
        ps.setString(6, registration.getCompany());
        ps.setString(7, registration.getAddress());
        ps.setString(8,registration.getImage_id());
                        return ps;
                    }
                } );



        }
}