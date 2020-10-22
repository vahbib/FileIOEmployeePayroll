package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileIO {
    public static  String PAYROLL_FILE_NAME = "payroll.txt";
    public void  writeData(List<EmployeePayrollData> employeePayrollList) {
        StringBuffer empBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            empBuffer.append(employeeDataString);
        });
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), empBuffer.toString().getBytes());
        }
        catch (IOException e) {

        }
    }
    public void printData() {
        try {
            Files.lines(new File("payroll.txt").toPath()).forEach(System.out::println);
        }
        catch (IOException e) {

        }
    }

}