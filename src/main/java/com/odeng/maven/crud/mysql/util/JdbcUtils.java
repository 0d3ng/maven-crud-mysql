/*
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 11:20:03 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.mysql.util;

import com.odeng.maven.crud.mysql.dao.MahasiswaDao;
import com.odeng.maven.crud.mysql.dao.MahasiswaImpl;
import com.odeng.maven.crud.mysql.koneksi.Koneksi;

/**
 *
 * @author od3ng
 */
public class JdbcUtils {

    private static MahasiswaDao mahasiswaDao;

    public static MahasiswaDao getMahasiswaDao() {
        if (mahasiswaDao == null) {
            mahasiswaDao = new MahasiswaImpl(Koneksi.getConnection());
        }
        return mahasiswaDao;
    }

}
