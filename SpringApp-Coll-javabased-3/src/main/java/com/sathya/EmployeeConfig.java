package com.sathya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	
	@Bean("id1")
	public EmployeeBean getEmployee()
	{
		EmployeeBean employeeBean = new EmployeeBean();
        employeeBean.setEmpId(125);
        employeeBean.setEmpProjects(Arrays.asList(20, 6, 5, 10));

        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(20, "developer");
        empMap.put(6, "dynamic");
        empMap.put(5, "dejango");
        empMap.put(10, "tcs");

        employeeBean.setEmpMap(empMap);

        return employeeBean;
		
		
	}

}
