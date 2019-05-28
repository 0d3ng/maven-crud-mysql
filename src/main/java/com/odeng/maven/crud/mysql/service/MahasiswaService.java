/*
 * maven-crud-mysql

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on May 27, 2019 11:24:36 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.crud.mysql.service;

import com.odeng.maven.crud.mysql.entitas.Mahasiswa;
import java.util.List;

/**
 *
 * @author od3ng
 */
public interface MahasiswaService {
    
    public boolean insert(Mahasiswa m);

    public boolean update(Mahasiswa m);

    public boolean delete(String nim);

    public Mahasiswa getMahasiswaByNim(String nim);

    public List<Mahasiswa> getAllMahasiswa();
    
}
