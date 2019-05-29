/*
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 11:25:53 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.mysql.service;

import com.odeng.maven.crud.mysql.dao.MahasiswaDao;
import com.odeng.maven.crud.mysql.entitas.Mahasiswa;
import java.util.List;

/**
 *
 * @author od3ng
 */
public class MahasiswaServiceImpl implements MahasiswaService {

    private final MahasiswaDao mahasiswaDao;

    public MahasiswaServiceImpl(MahasiswaDao mahasiswaDao) {
        this.mahasiswaDao = mahasiswaDao;
    }

    @Override
    public boolean insert(Mahasiswa m) {
        return mahasiswaDao.insert(m);
    }

    @Override
    public boolean update(Mahasiswa m) {
        return mahasiswaDao.update(m);
    }

    @Override
    public boolean delete(String nim) {
        return mahasiswaDao.delete(nim);
    }

    @Override
    public Mahasiswa getMahasiswaByNim(String nim) {
        return mahasiswaDao.getMahasiswaByNim(nim);
    }

    @Override
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaDao.getAllMahasiswa();
    }

}
