package flexshopper.com.dataProvider;

import com.google.gson.Gson;
import flexshopper.com.managers.FileReaderManager;
import flexshopper.com.testDataTypes.pojoClasses.Customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonDataReader {
    private final String customerFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "Customer.json";
    private List<Customer> customerList;

    public JsonDataReader(){
        customerList = getCustomerData();
    }

    private List<Customer> getCustomerData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(customerFilePath));
            Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
            return Arrays.asList(customers);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + customerFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final Customer getCustomerByName(String customerName){
        return customerList.stream().filter(x -> x.first_name.equalsIgnoreCase(customerName)).findAny().get();
    }
    public final Customer getCustomerByLastName(String customerLastName){
        return customerList.stream().filter(x -> x.last_name.equalsIgnoreCase(customerLastName)).findAny().get();
    }
    public final Customer getCustomerByGender(String customerGender){
        return customerList.stream().filter(x -> x.gender.equalsIgnoreCase(customerGender)).findAny().get();
    }
    public final Customer getCustomerBySSN(String customerSSN){
        return customerList.stream().filter(x -> x.SSN.equalsIgnoreCase(customerSSN)).findAny().get();
    }
    public final Customer getCustomerByACHRouting(String customerACHRouting){
        return customerList.stream().filter(x -> x.ACHRouting.equalsIgnoreCase(customerACHRouting)).findAny().get();
    }
    public final Customer getCustomerByACHAccount(String customerACHAccount){
        return customerList.stream().filter(x -> x.ACHAccount.equalsIgnoreCase(customerACHAccount)).findAny().get();
    }
    public final Customer getCustomerByBirthdate(String customerBirthdate){
        return customerList.stream().filter(x -> x.Birthdate.equalsIgnoreCase(customerBirthdate)).findAny().get();
    }
    public final Customer getCustomerByMonthlyIncome(String customerMonthlyIncome){
        return customerList.stream().filter(x -> x.MonthlyIncome.equalsIgnoreCase(customerMonthlyIncome)).findAny().get();
    }
    public final Customer getCustomerByPayFrequency(String customerPayFrequency){
        return customerList.stream().filter(x -> x.PayFrequency.equalsIgnoreCase(customerPayFrequency)).findAny().get();
    }
    public final Customer getCustomerByPhoneNumber(String customerPhoneNumber){
        return customerList.stream().filter(x -> x.PhoneNumber.equalsIgnoreCase(customerPhoneNumber)).findAny().get();
    }
    public final Customer getCustomerByEmail(String customerEmail){
        return customerList.stream().filter(x -> x.email.equalsIgnoreCase(customerEmail)).findAny().get();
    }
    public final Customer getCustomerByCity(String customerCity){
        return customerList.stream().filter(x -> x.City.equalsIgnoreCase(customerCity)).findAny().get();

    }
    public final Customer getCustomerGrossIncome(String customerGrossIncome){
        return customerList.stream().filter(x -> x.grossIncome.equalsIgnoreCase(customerGrossIncome)).findAny().get();

    }
    public final Customer getCustomerStreet(String customerStreet){
        return customerList.stream().filter(x -> x.street.equalsIgnoreCase(customerStreet)).findAny().get();

    }
    public final Customer getCustomerState(String customerState){
        return customerList.stream().filter(x -> x.State.equalsIgnoreCase(customerState)).findAny().get();

    }
    public final Customer getCustomerZip(String customerZip){
        return customerList.stream().filter(x -> x.Zip.equalsIgnoreCase(customerZip)).findAny().get();

    }


}
