import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class filehandling
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in); 
        String file=sc.nextLine();           

        File f=new File(file);                  // for operation
        if(!f.exists())
        { 
            System.out.println("file not exist");
        }  
        else{
            System.out.println("file exist lets move further");
        }
    
        FileReader fr=new FileReader(f);   // for file reading
        StringBuilder sb=new StringBuilder();   // to append data to string from file
        
        int i;
        while((i=fr.read())!=-1)
        {                       // reading the content till the end of file
            sb.append((char)i);
        }


        String[] words=sb.toString().split("\\s+");  // word by word count
        String[] b=sb.toString().split("\n");   // line by line
        String chara=sb.toString();     // all characters


                          // searching of word

          System.out.println("enter word to search");

          String srch=sc.nextLine();     
          
          int fl=0;

        for(int j=0;j<words.length;j++){
            if(words[j].equals(srch)){
            System.out.println("yes find at index "+j);
            fl=1;
        }
       }

       if(fl!=1){

        System.out.println("no not found at index ");
       }



                 //   reverse words of file

      
        System.out.println("file words in reverse order");

        for(int j=words.length-1;j>=0;j--){
            System.out.println("at  index "+j+" : "+words[j]);
        }


            //     largest word in a file

        
            System.out.println("largest word in a file");

            int  maxlen=0;
            
            String large="";

            for(String s:words) {
                if (s.length() > maxlen) {
                    maxlen = s.length();
                    large = s;
                }
            }
            System.out.println("the largest word is "+large +" and its length is "+maxlen);

               

            
            // smallest word in a file



              System.out.println("\n\nsmallest word in a file");

              int minlen=Integer.MAX_VALUE;

              String small="";

              for(String s:words) {
                  if (s.length() < minlen) {
                      minlen = s.length();  
                      small = s;
                  }
              }
              System.out.println("The smallest word is "+small+ " and its length is "+minlen);

         

              // count special character from file

              System.out.println("// count special character from file");

              int ct=0;

            //   for(int j=0;j<chara.length();j++){

            //     char ch=chara.charAt(j);

            //     if(ch>='65' && ch<='97'){
            //         ct++;
            //     }
              


              // count each word count

              System.out.println("Each word count in a file:\n");

              int wc=1;


              for(int j=0;j<words.length;j++){
                wc=0;
                for(int k=0;k<words.length;k++){
                    if(j!=k){
                        if(words[j].equals(words[k])){
                            wc++;
                        }
                    }
                }

                System.out.println(words[j]+ "count is: "+wc);

              }


              //    




    }
}