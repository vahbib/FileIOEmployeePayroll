package com.io;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static com.io.EmployeePayrollFileIO.PAYROLL_FILE_NAME;
import static com.io.EmployeePayrollService.IOService.FILE_IO;

public class TestIO {
    @Test
    public void writeToFile() {
        EmployeePayrollData[] apd = {
                new EmployeePayrollData(01, "Smith", 500000.0),
                new EmployeePayrollData(02, "Charlie", 1000000.0),
                new EmployeePayrollData(03, "Bridget", 600000.0)
        };
        EmployeePayrollService eps;
        eps = new EmployeePayrollService(Arrays.asList(apd));
        eps.writeEmployeePayrollData(FILE_IO);
        eps.printData(FILE_IO);
        long entries = eps.countEntries(FILE_IO);
        Assert.assertEquals(3, entries);
        eps.readEmployeePayrollData();

    }


}