package com.io;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
    public void printData(IOService ioService) {
        try {
            Files.lines(new File("payroll.txt").toPath()).forEach(System.out::println);
        }
        catch (IOException e) {

        }

    }
    public long countEntries(IOService ioService) {
        EmployeePayrollFileIO epio = new EmployeePayrollFileIO();
        return epio.countEntries();

    }
    public void readEmployeePayrollData() {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("payroll.txt"))) {
            list = br.lines().collect(Collectors.toList());
            list.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
}