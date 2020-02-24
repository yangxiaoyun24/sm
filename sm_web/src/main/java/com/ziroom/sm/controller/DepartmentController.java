package com.ziroom.sm.controller;

import com.ziroom.sm.entity.Department;
import com.ziroom.sm.service.DepartmentService;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller("departmentController")
public class DepartmentController {

    private DepartmentService departmentService;
    //department/list.do
    public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Department> list = departmentService.getAll();
        request.setAttribute("LIST",list);
        request.getRequestDispatcher("/department_list.jsp").forward(request,response);
    }
}
