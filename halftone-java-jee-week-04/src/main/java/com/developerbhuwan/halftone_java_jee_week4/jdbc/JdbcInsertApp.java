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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class JdbcInsertApp {

    public boolean insertQuery(int id) throws SQLException {
        String url = "jdbc:derby://localhost:1527/jdbc_demo_db";
        String username = "apple";
        String password = "apple";
        Connection connection = DriverManager.getConnection(url, username, password);
        String insertSQL = "INSERT INTO DEMO_TABLE VALUES "
                + " (" + id + ",'Ram Pandey', 'Kalimati', 'ram.p1@gmail.com'"
                + " , 22, 1000.50)";
        PreparedStatement ps = connection.prepareStatement(insertSQL);
        ps.executeUpdate();
        return true;
    }

    public boolean insertQuery2(Connection connection, int id) throws SQLException {
        String insertSQL = "INSERT INTO DEMO_TABLE VALUES "
                + " (" + id + ",'Ram Pandey', 'Kalimati', 'ram.p1@gmail.com'"
                + " , 22, 1000.50)";
        PreparedStatement ps = connection.prepareStatement(insertSQL);
        ps.executeUpdate();
        return true;
    }
}
