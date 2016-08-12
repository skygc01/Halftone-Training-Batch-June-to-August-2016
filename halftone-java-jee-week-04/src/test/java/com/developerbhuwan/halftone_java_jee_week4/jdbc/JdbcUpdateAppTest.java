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
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
public class JdbcUpdateAppTest {

    JdbcUpdateApp jdbcUpdateApp = new JdbcUpdateApp();
    Connection connection;

    public JdbcUpdateAppTest() throws SQLException {
        this.connection = DriverManager
                .getConnection("jdbc:derby://localhost:1527/jdbc_demo_db",
                        "apple", "apple");
    }

    @Test
    @Ignore
    public void testUpdateNameAndAddressSQL() throws Exception {
        assertTrue(jdbcUpdateApp.updateNameAndAddressSQL(connection, "OK", "Ok Address"));
    }

    @Test
    public void testUpdateNameAndAddressSQLInjection() throws Exception {
        assertTrue(jdbcUpdateApp.updateNameAndAddressSQL(connection, "OK", "';delete from DEMO_TABLE;--"));
    }

    @Test
    @Ignore
    public void testUpdateNameAndAdressByPreventingSQLInjection() throws Exception {
        assertTrue(jdbcUpdateApp.updateNameAndAdressByPreventingSQLInjection(connection, "OK", "Ok Address"));
    }

}
