package springjpacvsmyscl.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springjpacvsmyscl.demo.model.Logins;
import springjpacvsmyscl.demo.model.Postings;
import springjpacvsmyscl.demo.repo.LoginsRepo;
import springjpacvsmyscl.demo.repo.PostingsRepo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

@Service
public class PostingsService {
    @Autowired
    private PostingsRepo postingsRepo;
    String str = "";


    public void savePostingsData(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/main/resources/postings.csv"));
            reader.readLine();
            reader.readLine();
            //ArrayList<Integer> ages = new ArrayList<>();
            while ((str=reader.readLine())!=null){
                Postings postings = new Postings();
                String [] data = str.split(";");

                postings.setMatDoc(Long.parseLong(data[0]));
                postings.setItem(data[1]);
                postings.setDocData(data[2]);
                postings.setPostData(data[3]);
                postings.setMatDescription(data[4]);
                postings.setQuantity(data[5]);
                postings.setBUn(data[6]);
                postings.setAmountLc(data[7]);

                postings.setCrcy(data[8]);
                postings.setUserName(data[9]);



                postingsRepo.save(postings);


            }
            //System.out.print(ages+ " ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
