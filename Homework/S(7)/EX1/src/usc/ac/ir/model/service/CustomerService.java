package usc.ac.ir.model.service;
import usc.ac.ir.model.entity.CustomerEntity;
import usc.ac.ir.model.repository.CustomerRepo;
import java.util.List;

public class CustomerService {
    private CustomerService(){}
    private static CustomerService customerService=new CustomerService();
    public static CustomerService getInstance(){
        return customerService;
    }
    public List<CustomerEntity> reporting(String user_name,long password) throws Exception{
        List<CustomerEntity> customerEntities;
        try (CustomerRepo customerRepo=new CustomerRepo ()){
            customerEntities=customerRepo.selecting (user_name,password);
            customerRepo.commit();
            customerRepo.close();
        }
        return customerEntities;

    }
    public void saving (CustomerEntity customerEntity) throws Exception {
        try (CustomerRepo customerRepo = new CustomerRepo ()) {
            customerEntity.setBill (customerEntity.getBill () + (customerEntity.getBill () * 10 / 100));
            customerRepo.inserting (customerEntity);
            customerRepo.commit ();
        }
    }
    public void edit (CustomerEntity customerEntity) throws Exception{
        try (CustomerRepo customerRepo=new CustomerRepo ()){
            customerEntity.setBill (customerEntity.getBill () + (customerEntity.getBill () * 10 / 100));
            customerRepo.updating (customerEntity);
           customerRepo.commit ();
        }
    }
}

