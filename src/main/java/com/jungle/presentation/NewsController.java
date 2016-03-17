package com.jungle.presentation;

import com.jungle.presentation.helper.ModelAndViewHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * Created by User on 17.03.2016.
 */
@Controller
public class NewsController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ModelAndView getStartPage() {
        return getNews();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/news")
    public ModelAndView getNews() {
        return ModelAndViewHelper.getModelAndView("news");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/news/{recordId}")
    public ModelAndView getSingleNews(@PathVariable Integer recordId) {
        return ModelAndViewHelper.getModelAndView(
                "singleNews",
                new HashMap<String, Object>() {{
                    put("recordId", recordId);
                }}
        );
    }

}
