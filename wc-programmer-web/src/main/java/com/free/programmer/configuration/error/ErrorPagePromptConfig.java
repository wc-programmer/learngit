package com.free.programmer.configuration.error;

import com.free.programmer.Utils.Convert;
import com.free.programmer.controller.IndexController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Title: ErrorPagePromptConfig
 * @author: wangcheng
 * @createTime 2020/11/10 0010
 * @content
 */
public class ErrorPagePromptConfig {

    public static Boolean updateErrorPageSaying() {
        String path = "";
        try {
            path = Objects.requireNonNull(IndexController.class.getClassLoader().getResource("famous-saying.txt")).toURI().getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        try (InputStream resourceAsStream = IndexController.class.getResourceAsStream("/Fileofchange");
             InputStreamReader resourceAsStreamReader = new InputStreamReader(resourceAsStream, "UTF-8");
             BufferedReader resourceAsReader = new BufferedReader(resourceAsStreamReader);
             BufferedWriter resourceAsWriter = new BufferedWriter(new FileWriter(path.replace("/target/classes", "/src/main/resources")));
             BufferedWriter resourceAsWriterClassPath = new BufferedWriter(new FileWriter(path));
        ) {
            String saying = null;
            List<String> sayingList = new ArrayList<>();
            while ((saying = resourceAsReader.readLine()) != null) {
                sayingList.add(Convert.convertStringDeleteDigitalAndChineseCharacters(saying));
            }
            for (String say : sayingList) {
                resourceAsWriter.write(say);
                resourceAsWriter.newLine();
                resourceAsWriter.flush();
                resourceAsWriterClassPath.write(say);
                resourceAsWriterClassPath.newLine();
                resourceAsWriterClassPath.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
