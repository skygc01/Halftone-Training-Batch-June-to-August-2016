/*
 * ---------------------------------------------------------------------------------------
 *   _____                 _                       ____  _                               
 *  |  __ \               | |                     |  _ \| |                              
 *  | |  | | _____   _____| | ___  _ __   ___ _ __| |_) | |__  _   ___      ____ _ _ __  
 *  | |  | |/ _ \ \ / / _ \ |/ _ \| '_ \ / _ \ '__|  _ <| '_ \| | | \ \ /\ / / _` | '_ \ 
 *  | |__| |  __/\ V /  __/ | (_) | |_) |  __/ |  | |_) | | | | |_| |\ V  V / (_| | | | |
 *  |_____/ \___| \_/ \___|_|\___/| .__/ \___|_|  |____/|_| |_|\__,_| \_/\_/ \__,_|_| |_|
 *                                | |                                                    
 *                                |_|                                                    
 * ---------------------------------------------------------------------------------------
 * Copyright (C) 2016-07-17
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.halftone_java_jee_week4.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class JdbcUpdateApp {

    /*
        SQL Injection
        -------------
        -> name = "ram;delete from demo_table where name='ram';"
     */
    public boolean updateNameAndAddressSQL(Connection conn, String name, String address)
            throws SQLException {
        String updateSQL = "UPDATE DEMO_TABLE SET NAME='" + name
                + "', ADDRESS='" + address + "'";
        System.out.println("SQL=" + updateSQL);
        Statement statement = conn.createStatement();
        statement.execute(updateSQL);
//        PreparedStatement ps = conn.prepareStatement(updateSQL);
//        ps.executeUpdate();
        return true;
    }

    public boolean updateNameAndAdressByPreventingSQLInjection(Connection connection,
            String name, String address) throws SQLException {
        String updateSQL = "UPDATE DEMO_TABLE SET NAME=? , ADDRESS= ?";
        PreparedStatement ps = connection.prepareStatement(updateSQL);
        ps.setString(1, name);
        ps.setString(2, address);
        ps.executeUpdate();
        return true;
    }
}
