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

package com.jmat.readexcel.app;

import com.jmat.read.excel.model.Mahasiswa;
import com.jmat.readexcel.app.dao.MahasiswaDao;
import com.jmat.readexcel.app.dao.MahasiswaDaoImpl;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author WURI
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MyReadExcel mr = new MyReadExcel();
        String path = "D:/mycsv/DATA_MAHASISWA_INPUT.xls";
        List<Mahasiswa> list = mr.getWorkbookMahasiswa(path);
        
        MahasiswaDao dao = new MahasiswaDaoImpl();
        
        for(Mahasiswa m:list){
            dao.save(m);
        }
        
    }

}
