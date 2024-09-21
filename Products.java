
public class Products {
    
    String name, prodname;
    int qty, price;
    double cash, due, change;
    
    public void addInfo(String cname, String cprod, int cqty, int cprice, double ccash, double cdue, double cchange){
        
        this.name=cname;
        this.prodname=cprod;
        this.qty=cqty;
        this.price=cprice;
        this.cash=ccash;
        this.due=cdue;
        this.change= cchange;
       
    }
     public void viewInfo() {
        System.out.println("---------------------");
        System.out.println("RECEIPT");
        System.out.println("---------------------");
        
        System.out.printf("Name: " + name);
        System.out.printf("\nProduct Name: " + prodname);
        System.out.printf("\nQuantity: " + qty);
        System.out.printf("\nPrice: " + price);
        System.out.printf("\nCash: " + cash);
        
        System.out.println("\n------------------------------------");
        
        due = qty * price;
        System.out.println("Total due: " + String.format("%.2f", due));
        System.out.println("Cash: " + String.format("%.2f", cash));
        
        System.out.println("\n------------------------------------------");
        
        change = cash - due;
        System.out.println("Change: " + String.format("%.2f", change));
    }
     
     public void editReceipts(String name, int uqty, int uprice, double ucash) {
            if(this.name == name){
            this.qty = uqty;
            this.price = uprice;
            this.cash = ucash;
            
            
            this.due = qty * price;
            this.change = cash - due;
           
    
}
     }

    
}
