/*
 * ---------------------------------------------------------------------------------------
 *   _____                 _                       ____  _                               
 *  |  __ \               | |                     |  _ \| |                              
 *  | |  | | _____   _____| | ___  _ __   ___ _ __| |_) | |__  _   ___      ____ _ _ __  
 *  | |  | |/ _ \ \ / / _ \ |/ _ \| '_ \ / _ \ '__|  _ <| '_ \| | | \ \ /\ / / _` | '_ \ 
 *  | |__| |  __/\ V /  __/ | (_) | |_) |  __/ |  | |_) | | | | |_| |\ V  V / (_| | | | |
 *  |_____/ \___| \_/ \___|_|\___/| .__/ \___|_|  |____/|_| |_|\__,_| \_/\_/ \__,_|_| |_|
 *                                | |                                                    
 *                                |_|                                                    
 * ---------------------------------------------------------------------------------------
 * Copyright (C) 2016-08-21
 *
 * Author : Bhuwan Prasad Upadhyay
 * Portfolio : http://devbhuwan.github.io/
 * Blog : http://developerbhuwan.blogspot.com/
 * Twitter : @DeveloperBhuwan
 * Github : devbhuwan
 *
 */
package com.developerbhuwan.jspservletlearning.servlet;

import com.developerbhuwan.jspservletlearning.bean.StudentBean;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bhuwan Prasad Upadhyay
 */
@WebServlet(name = "JstlServlet", urlPatterns = {"/jstl"})
public class JstlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<StudentBean> studentBeans = new ArrayList<StudentBean>();
        for (int i = 0; i < 10; i++) {
            StudentBean studentBean = new StudentBean();
            studentBean.setRollNo(i);
            studentBean.setName("StdName" + i);
            studentBean.setAddress("Address" + i);
            studentBean.setClassLevel(i * 2);
            studentBean.setCollegeName("College" + i);
            studentBeans.add(studentBean);
        }
        
        req.setAttribute("studentList", studentBeans);
        req.setAttribute("link", "http://www.mylink.com");
        
        req.getRequestDispatcher("/jstl/jstlTag.jsp").forward(req, resp);
    }

}
