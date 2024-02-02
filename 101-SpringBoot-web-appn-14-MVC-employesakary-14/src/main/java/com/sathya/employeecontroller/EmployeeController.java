package com.sathya.employeecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathya.model.Employees;

@Controller
public class EmployeeController {

    @RequestMapping("/")
    public String employeeForm(ModelMap model) {
        Employees employees = new Employees();
        model.put("employees", employees);
        return "employee";
    }

    @RequestMapping("/employee")
    public String calculateSalary(@ModelAttribute Employees employees, ModelMap model) {

        double da = 0.0, ta = 0.0, hra = 0.0, pf = 0.0;
        double gross = 0.0;
        double salary = employees.getSalary(); // Retrieve salary from Employees object

        if (salary < 3000) {
            ta = 0.07;
            da = 0.09;
            hra = 0.11;
            pf = 0.15;
        } else if (salary >= 3000 && salary < 5000) {
            ta = 0.12;
            da = 0.13;
            hra = 0.17;
            pf = 0.22;
        } else {
            ta = 0.17;
            da = 0.19;
            hra = 0.21;
            pf = 0.25;
        }

        ta = ta * salary;
        da = da * salary;
        hra = hra * salary;
        pf = pf * salary;

        gross = salary+ta + hra + da ;
        double net=gross- pf;
        model.put("da", da);
        model.put("ta", ta);
        model.put("hra", hra);
        model.put("pf", pf);

        model.put("invoice", gross);
        model.put("net", net);


        model.put("employees", employees);
        return "result";
    }
}
