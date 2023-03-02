package com.RedirectSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;

@Controller
public class FileController {
    @RequestMapping("/files")
    public String fileUpload(){
        return "fileform";
    }
    @RequestMapping(value="/filehandle", method = RequestMethod.POST)
    public String fileHandle(@RequestParam("profile") CommonsMultipartFile file, HttpSession s){
        byte[] bytes= file.getBytes();
        String path = s.getServletContext().getRealPath("/")+
                "WEB-INF"+ File.separator+
                "resource"+File.separator+
                "images"+File.separator+
                "upload"+File.separator+
                file.getOriginalFilename();
        System.out.println(path);
        try{
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(bytes);
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return "redirect:/";
    }
}
