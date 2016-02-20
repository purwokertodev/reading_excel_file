/*
   **********************************************************************
   **********************************************************************
   ** By Wuriyanto                                                     **
   ** EMAIL/FACEBOOK : wuriyanto48@yahoo.co.id  OR  Prince Wury        **
   ** WEBSITE : wuriyantoinformatika.blogspot.com                      **
   ** CITY : BANJARNEGARA CENTRAL JAVA INDONESIA                       **
   ** COMPUTER SCIENCE                                                 **
   ** MUHAMMADIYAH UNIVERSITY OF PURWOKERTO                            **
   ** NB:BEBAS DIDISTRIBUSIKAN UNTUK TUJUAN BELAJAR                    **      
   **                                                                  **
   **                                     JMAT.inc & Black Code Studio **
   **********************************************************************
   **********************************************************************

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jmat.readexcel.app.dao;

import com.jmat.read.excel.model.Mahasiswa;
import com.jmat.readexcel.app.db.MyDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author WURI
 */
public class MahasiswaDaoImpl implements MahasiswaDao{
    
    private Connection con;
    private static final String INSERT = "INSERT INTO mahasiswa_excel(nim, nama, jurusan) VALUES(?,?,?)";
    
    public MahasiswaDaoImpl(){
        con = MyDb.connect();
    }

    @Override
    public void save(Mahasiswa m) {
        PreparedStatement prep = null;
        try{
            prep = con.prepareStatement(INSERT);
            prep.setString(1, m.getNim());
            prep.setString(2, m.getNama());
            prep.setString(3, m.getJurusan());
            prep.executeUpdate();
        }catch(SQLException ex){
        
        }finally{
            if(prep != null){
                try {
                    prep.close();
                } catch (SQLException ex) {
                    
                }
            }
        }
    }

}
