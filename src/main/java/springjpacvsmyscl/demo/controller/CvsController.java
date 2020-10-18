package springjpacvsmyscl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springjpacvsmyscl.demo.model.Logins;
import springjpacvsmyscl.demo.model.Postings;
import springjpacvsmyscl.demo.repo.LoginsRepo;
import springjpacvsmyscl.demo.repo.PostingsRepo;
import springjpacvsmyscl.demo.service.LoginsService;
import springjpacvsmyscl.demo.service.PostingsService;

import java.util.List;
import java.util.Map;

@RestController
public class CvsController {
    @Autowired
    private LoginsRepo loginsRepo;
    @Autowired
    private PostingsRepo postingsRepo;

    @Autowired
    private LoginsService loginservice;
    @Autowired
    private PostingsService postservice;



    @ResponseBody
    @RequestMapping(path = "/")
    public String showAllEmployee() {
        loginservice.saveLoginsData();
        postservice.savePostingsData();

        Iterable<Logins> logins = loginsRepo.findAll();
        String html = "";
        for (Logins emp : logins) {
            html += emp + "<br>";
        }

        return html;
    }


}
