/*
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 4:02:44 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.mysql.koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class Koneksi {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setUser("root");
                dataSource.setPassword("");
                dataSource.setUrl("jdbc:mysql://localhost:3306/akademik?useLegacyDatetimeCode=false&serverTimezone=UTC");
                connection = dataSource.getConnection();
            } catch (SQLException ex) {
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }

}
