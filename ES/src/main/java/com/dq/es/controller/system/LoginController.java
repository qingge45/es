package com.dq.es.controller.system;

import com.dq.es.common.BaseController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * Created by DengQing on 2017/8/11.
 */
@Controller
public class LoginController extends BaseController {
    private static final long serialVersionUID = 1L;

    private static final Log log= LogFactory.getLog(LoginController.class);

    /**
     * 进入登录页面.
     * @return
     */

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String login(HttpServletRequest request){
        log.info("...............登入页面.............");
        request.setAttribute("version","0.0.1");
        return "login";
    }


    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String login(HttpServletRequest request, HttpServletResponse response){
        log.info("...............登入.............");

        return "index";
    }


}
