package com.free.programmer.controller;

import com.free.programmer.baseClass.BaseWebResult;
import com.free.programmer.baseEnums.BaseResultCode;
import com.free.programmer.configuration.error.ErrorPagePromptConfig;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Title: IndexController
 * @author: wangcheng
 * @createTime 2020/10/14 0014
 * @content
 */
@Controller
public class IndexController {

    @RequestMapping("/error/errorPage/{statusCode}")
    public String errorPage(Model model, @PathVariable("statusCode") String statusCode) {
        try (
                 InputStream resourceAsStream = IndexController.class.getResourceAsStream("/famous-saying.txt");
                 InputStreamReader resourceAsStreamReader = new InputStreamReader(resourceAsStream, "UTF-8");
                 BufferedReader resourceAsReader = new BufferedReader(resourceAsStreamReader);
        ) {
            List<String> famousSayingList = new ArrayList<>();
            String saying = null;
            while ((saying = resourceAsReader.readLine()) != null) {
                famousSayingList.add(saying);
            }
            int i = new Random().nextInt(famousSayingList.size());
            if (CollectionUtils.isNotEmpty(famousSayingList))
                model.addAttribute("famousSaying", famousSayingList.get(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("status", statusCode);
        return "/error/errorPage";
    }

    @ResponseBody
    @RequestMapping("/index")
    public BaseWebResult index() {
        if (ErrorPagePromptConfig.updateErrorPageSaying()) {
            return BaseWebResult.SUCCESS;
        }
        return new BaseWebResult(BaseResultCode.FAILED,"操作失败");
    }

    @RequestMapping("/login/{type}")
    public String login(@PathVariable(value = "type",required = false) String type){
        if(StringUtils.isBlank(type) || type.equals("phoneCode")){
          return "login/login-phone";
        }
        return "login/login";
    }
}
