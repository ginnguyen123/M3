package com.example;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servletlifecycle", urlPatterns = "/servletlifecycle")
public class ServletLiftCycle extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("chạy hàm khỏi tạo init()");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("chạy doGet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("chạy doPost");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req,resp);
        System.out.println("chạy service");
    }

    @Override
    public void destroy() {
        System.out.println("chạy destroy");
    }
}
