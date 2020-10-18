package springjpacvsmyscl.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springjpacvsmyscl.demo.model.Logins;
import springjpacvsmyscl.demo.repo.LoginsRepo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class LoginsService {
    @Autowired
    private LoginsRepo loginsRepo;
    String line = "";


    public void saveLoginsData(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/logins.csv"));

            //ArrayList<Integer> ages = new ArrayList<>();
            while ((line=br.readLine())!=null){
                Logins logins = new Logins();
                String [] data = line.split(",");
                logins.setApplication(data[0]);
                logins.setAppAccountName(data[1]);
                logins.setIsActive(data[2]);
               // ages.add(logins.getAge());
                logins.setJobTitle(data[3]);
                logins.setDepartment(data[4]);
               loginsRepo.save(logins);


            }
            //System.out.print(ages+ " ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
