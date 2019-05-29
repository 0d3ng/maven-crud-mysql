/*
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 9:31:31 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.mysql.koneksi;

import java.sql.Connection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author od3ng
 */
public class KoneksiTest {

    public KoneksiTest() {
    }

    @Before
    public void setUp() {
        System.out.println("Before...");
    }

    @After
    public void tearDown() {
        System.out.println("After...");
    }

    /**
     * Test of getConnection method, of class Koneksi.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection result = Koneksi.getConnection();
        assertNotNull("Success", result);
    }

}
