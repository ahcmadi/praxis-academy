/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus;

import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;

/**
 *
 * @author achmadi
 */
public class JsonListSiswa {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        JSONObject obj = new JSONObject();

        obj.put("name", "Achmadi");
        obj.put("tempat_lahir", "Rembang");
        obj.put("tanggal_lahir", "2010-09-08");
        obj.put("alamat", "Rembang");

        StringWriter out = new StringWriter();
        obj.writeJSONString(out);

        String jsonText = out.toString();
        System.out.print(jsonText);
    }
}
