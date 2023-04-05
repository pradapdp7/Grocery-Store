public class grocerystore<amount> {
    private String customername;
    private int customerid;
    private int contact;
    private int balance=5000;
    private String address;
    private int amount;
    private String purchase;


    public void setPurchase(){
        int validate = this.amount;
        if(amount==0){
            purchase="add some products to cart ";
        }
        else if(validate<=amount){
            purchase ="your order is successful. thanks for purchasing";
        }
        else
            purchase="insufficient balance. add amount";
    }

    public void setAmount(int amount){
            this.amount = amount;
    }

    public void setCustomername(String name){
        customername = name;
    }
    public void setCustomerid(int id){
        customerid = id;
    }
    public void setContact(int contact){
        this.contact= contact;
    }
    public void setBalance(int balance){
        this.balance+=balance;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
