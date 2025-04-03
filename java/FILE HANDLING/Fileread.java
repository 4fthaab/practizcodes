import java.io.*;
class Fileread {
    public static void main(String[] args) throws IOException
    {
       try{
        FileInputStream f1=new FileInputStream("test1.txt");
        int c;
        do{
        c=f1.read();
        if(c!=-1){
            System.out.print((char)c);
        }
        if(c==32){
            System.out.print(" ");
        }
    }while(c!=-1);
    f1.close();
  }
  catch(FileNotFoundException e) {
   System.err.println(e.getMessage()); }
}
}