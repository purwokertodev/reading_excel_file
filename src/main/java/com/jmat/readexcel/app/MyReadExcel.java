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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author WURI
 */
public class MyReadExel {

    public List<Mahasiswa> getWorkbookMahasiswa(String path) {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            Workbook workbook = Workbook.getWorkbook(new File(path));
            Sheet sheet = workbook.getSheet(0);
            for (int i = 0; i < sheet.getRows(); i++) {
                Mahasiswa m = new Mahasiswa();
                m.setNim(sheet.getCell(0, i).getContents());
                m.setNama(sheet.getCell(1, i).getContents());
                m.setJurusan(sheet.getCell(2, i).getContents());
                list.add(m);
            }
        } catch (IOException | BiffException ex) {
            Logger.getLogger(MyReadExel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
