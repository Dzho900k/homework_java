package com.academy.filter;

import com.academy.model.entity.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class AutFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        var httpRequestServlet = (HttpServletRequest) servletRequest;
        var url = httpRequestServlet.getRequestURL().toString();
        var session = httpRequestServlet.getSession();
        User user = (User) session.getAttribute("userTemp");
        if ((user != null) || (url.contains("/loginForm")) || (url.contains("/login"))) {
            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println("Filter");
        } else {
            servletRequest.getRequestDispatcher("/loginForm").forward(servletRequest, servletResponse);
        }
    }
}
