package pl.usedcardealer.usedcardealer.BranchTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.usedcardealer.usedcardealer.Branch.Branch;
import pl.usedcardealer.usedcardealer.Person.Address;

public class BranchTest {
    @Test
    public void TestBranch() {
        Address address = new Address("26-020", "Chmielnik", "rynek", 10);
        Branch branch = new Branch("Branch1", 1, address);
        Assertions.assertEquals(branch.getName(), "Branch1");
        Assertions.assertEquals(branch.getNumberOfBranch(), 1);
        Assertions.assertEquals(branch.getAdress(), address);

        branch.setNumberOfBranch(3);
        Assertions.assertEquals(branch.getNumberOfBranch(), 3);

        Address address2 = new Address("11-333", "Krakow", "srebrna", 14);
        branch.setAdress(address2);
        Assertions.assertEquals(branch.getAdress(), address2);
    }
}
