package edu.wcsu.thestore.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Ray Chen
 * @version 1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            request.setAttribute("msg", "You are not logged in, please log in to your account!");
            request.getRequestDispatcher("/login.html").forward(request, response);
            return false;
        } else {
            return true;
        }
    }
}
