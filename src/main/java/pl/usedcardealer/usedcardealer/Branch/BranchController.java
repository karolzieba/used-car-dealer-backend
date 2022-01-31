package pl.usedcardealer.usedcardealer.Branch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.usedcardealer.usedcardealer.Account.Employee.Employee;

import java.util.List;

@RestController
@RequestMapping(path="/api/Branch")
public class BranchController {
    private final BranchService brservice;

    @Autowired
    public BranchController(BranchService brservice) {
        this.brservice = brservice;
    }

    @GetMapping
    public List<Branch> getBranches() {
        return brservice.getBranches();
    }

    @PostMapping
    public void postBranch(@RequestBody Branch branch) {
        brservice.postBranch(branch);
    }

    @PutMapping(path = "{brId}")
    public void putBranch(@PathVariable("brId") int id,
                          @RequestParam(required = true) Employee employee,
                          @RequestParam(required = true) boolean action) {
        brservice.putBranch(id, employee, action);
    }

    @DeleteMapping(path = "{brId}")
    public void deleteBranch(@PathVariable("brId") int id) {
        brservice.deleteBranch(id);
    }
}
