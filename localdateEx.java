import java.time.LocalDate;    
public class localdateEx {    
  public static void main(String[] args) {    
    LocalDate d = LocalDate.now();    
    LocalDate y = d.minusDays(1);    
    LocalDate t = y.plusDays(2);    
    System.out.println("Today date: "+d);    
    System.out.println("Yesterday date: "+y);    
    System.out.println("Tomorrow date: "+t);    
  }    
}    
