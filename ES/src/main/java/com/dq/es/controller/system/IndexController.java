package com.dq.es.controller.system;

import com.dq.es.common.BaseController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by DengQing on 2017/8/12.
 */
@Controller
public class IndexController extends BaseController{
    private static final long serialVersionUID = 1L;

    private static final Log log= LogFactory.getLog(IndexController.class);

    @RequestMapping(value = "/index",method = {RequestMethod.GET})
    public String index(){
        log.info("...........index..........");

        return "index";
    }


    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "/error/401";
    }


}
