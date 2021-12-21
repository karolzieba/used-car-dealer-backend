package pl.usedcardealer.usedcardealer.Document.Insurance.Factory;

public class FactoryProvider {
    public static InsuranceFactory getFactory(String type) {
        if(type.toLowerCase().equals("acc")) {
            return new AccInsuranceFactory();
        }
        else if(type.toLowerCase().equals("liability")) {
            return new LiabilityInsuranceFactory();
        }

        return null;
    }
}
