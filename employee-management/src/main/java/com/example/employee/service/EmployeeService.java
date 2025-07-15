package com.example.employee.service;

import com.example.employee.model.Employee;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {
    private final Map<Integer, Employee> database = new HashMap<>();

    public List<Employee> getAll() {
        return new ArrayList<>(database.values());
    }

    public void add(Employee emp) {
        database.put(emp.getId(), emp);
    }

    public void delete(int id) {
        database.remove(id);
    }
}
