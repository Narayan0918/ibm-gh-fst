package ibm.fst;

abstract class Book {
    String title;
    public abstract void setTitle(String title);
    public String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    public void setTitle(String title){
        this.title = title;
    }
}

public class Activity5{
    public static void main(String[] args) {
        String title = "Harry potter";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("Book title => "+newNovel.getTitle());
    }
}