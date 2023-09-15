class Publication
{
    private String title;
    public int qty;
    private double price;
    private int copies;
    public String gettitle()
    {
        return this.title;
    }
    public void settitle(String title)
    {
        this.title=title;
    }
    public int getcopies()
    {
        return this.copies;
    }
    public void setcopies(int copies)
    {
        this.copies=copies;
    }
    public double getprice()
    {
        return this.price;
    }
    public void setprice(double price)
    {
        this.price=price;
    }
    public void sellcopy(int qty)
    {
        System.out.println("Total Publication sell: $"+(qty*price));
    }
}
class Book extends Publication
{
    private String author;
    public void ordercopies(int pcopies)
    {
        System.out.println("Total Book sell: $"+(qty*getprice()));
    }
}
class Magazine extends Publication{
    private int OrderQty;
    private String currIssue;
    public void RecvNewIssue(String pNewIssue)
    {
        setcopies(OrderQty);
        currIssue=pNewIssue;
    }
    public void sellcopy(int qty)
    {
        System.out.println("Total magazine sell: $"+(qty*getprice()));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.ordercopies(3);
        Publication book2=new Book();
        book2.setprice(10);
        book2.sellcopy(3);
        Publication publication=new Publication();
        publication.setcopies(3);
        publication.getcopies();
        publication.setprice(20.3);
        publication.getprice();
        publication.sellcopy(2);
        Publication magazine=new Magazine();
        magazine.setprice(20.3);
        magazine.sellcopy(6);
    }   
}
