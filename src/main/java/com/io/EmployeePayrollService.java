package com.io;

import java.util.List;

public class EmployeePayrollService {
    public enum IOService {
       CONSOLE_IO, FILE_IO;
    }
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {

    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service Program");
//        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
//        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
//        Scanner consoleInputReader = new Scanner(System.in);
//        employeePayrollService.readEmployeePayrollData(consoleInputReader);
//        employeePayrollService.writeEmployeePayrollData();

    }

    public void writeEmployeePayrollData(IOService ioService) {
        // TODO Auto-generated method stub
        if (ioService.equals(IOService.CONSOLE_IO))
            System.out.println("\nWriting Employee Payroll Roaster to Console\n"+ employeePayrollList);
        else if (ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIO().writeData(employeePayrollList);

    }
}
