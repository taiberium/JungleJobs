package com.jungle.presentation.helper;

import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 16.03.2016.
 */
public class ModelAndViewHelper {

    public static ModelAndView getModelAndView(String path) {
        return new ModelAndView("mainPage", "path", getPath(path));
    }

    public static ModelAndView getModelAndView(String path, Map<String, Object> args){
        HashMap<String,Object> viewArgs = new HashMap<>(args);
        viewArgs.put("path", getPath(path));
        return new ModelAndView("mainPage",viewArgs);
    }

    private static String getPath(String rawPath){
        return "pages/" + rawPath  + ".jsp";
    }
}
