/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller3;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author jonat
 */
public class FiltroAutenticacion implements Filter {

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {

    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse resp= (HttpServletResponse ) response;
        
        
        
        if(req.getSession().getAttribute("usuario")==null){
            // no esta autentiado
            resp.sendRedirect("../login.html");
        }else{
            //esta autenticado
            //continua con la ejecusion de la aplicacion
            
            //antes del servlet
            chain.doFilter(request, response);
            //dspues del servelt
        }

    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {
    }
}
