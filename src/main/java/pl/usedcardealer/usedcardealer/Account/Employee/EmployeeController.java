package pl.usedcardealer.usedcardealer.Account.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.usedcardealer.usedcardealer.Account.Account;

import java.util.List;

@RestController
@RequestMapping(path="/api/Employee")
public class EmployeeController {
    private final EmployeeService empservice;

    @Autowired
    public EmployeeController(EmployeeService empservice) {
        this.empservice = empservice;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return empservice.getEmployees();
    }

    @PostMapping
    public void postEmployee(@RequestBody Employee employee) {
        empservice.postEmployee(employee);
    }

    @PutMapping(path = "{empId}")
    public void putEmployee(@PathVariable("empId") int id,
                                 @RequestParam(required = true) Account account) {
        empservice.putEmployee(id, account);
    }

    @DeleteMapping(path = "{empId}")
    public void deleteEmployee(@PathVariable("empId") int id) {
        empservice.deleteEmployee(id);
    }
}
