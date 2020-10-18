package springjpacvsmyscl.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
public class Postings {
    @Id
    @GeneratedValue
    private Long id;
    private Long MatDoc;
    private String Item;
    private String DocData;
    private String PostData;
    private String MatDescription;
    private String Quantity;
    private String BUn;
    private String AmountLc;
    private String Crcy;
    private String UserName;
    public Postings(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatDoc() {
        return MatDoc;
    }

    public void setMatDoc(Long matDoc) {
        MatDoc = matDoc;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    public String getDocData() {
        return DocData;
    }

    public void setDocData(String docData) {
        DocData = docData;
    }

    public String getPostData() {
        return PostData;
    }

    public void setPostData(String postData) {
        PostData = postData;
    }

    public String getMatDescription() {
        return MatDescription;
    }

    public void setMatDescription(String matDescription) {
        MatDescription = matDescription;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getBUn() {
        return BUn;
    }

    public void setBUn(String BUn) {
        this.BUn = BUn;
    }

    public String getAmountLc() {
        return AmountLc;
    }

    public void setAmountLc(String amountLc) {
        AmountLc = amountLc;
    }

    public String getCrcy() {
        return Crcy;
    }

    public void setCrcy(String crcy) {
        Crcy = crcy;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
