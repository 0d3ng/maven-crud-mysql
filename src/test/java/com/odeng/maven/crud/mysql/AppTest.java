/*
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 11:37:08 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.mysql;

import com.odeng.maven.crud.mysql.entitas.Alamat;
import com.odeng.maven.crud.mysql.entitas.Mahasiswa;
import com.odeng.maven.crud.mysql.service.MahasiswaService;
import com.odeng.maven.crud.mysql.service.MahasiswaServiceImpl;
import com.odeng.maven.crud.mysql.util.JdbcUtils;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author od3ng
 */
public class AppTest {

    MahasiswaService ms;

    @Before
    public void setUp() {
        ms = new MahasiswaServiceImpl(JdbcUtils.getMahasiswaDao());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testInsert() {
        Alamat a = new Alamat("Jln. Prenjak no.99", "02", "04", "01", "01", "01", "01");
        Mahasiswa m = new Mahasiswa("075410200", "Singgih Kuncoro", 2.75F, "Teknik Mesin");
        m.setAlamat(a);
        assertTrue(ms.insert(m));
    }

    @Test
    public void testUpdate() {
        Alamat a = new Alamat("Jln. Semut no.99", "02", "04", "01", "01", "01", "01");
        Mahasiswa m = new Mahasiswa("075410200", "Singgih Kuncoro Aji", 2.80F, "Teknik Mesin");
        m.setAlamat(a);
        assertTrue(ms.update(m));
    }

    @Ignore
    @Test
    public void testGetMahasiswaByNim() {
        assertTrue(ms.getMahasiswaByNim("075410099") != null);
    }

    @Ignore
    @Test
    public void testGetAllMahasiswa() {
        assertTrue(ms.getAllMahasiswa().size() > 0);
    }

    @Ignore
    @Test
    public void testDelete() {
        assertTrue(ms.delete("075410200"));
    }

}
