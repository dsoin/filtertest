package com.dsoin;

import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by dsoin on 13/02/17.
 */
@WebFilter(urlPatterns={"/*"})
public class TestFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        String name = req.getParameter("name");
        String filteredName = validate(name);
        req.setAttribute("filteredName",filteredName);
        chain.doFilter(request,response);
    }

    private String validate(String name) {
        return "filtered";
    }

    @Override
    public void destroy() {

    }
}
