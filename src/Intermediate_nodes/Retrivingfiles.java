/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediate_nodes;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 *
 * @author Fabsys
 */
public class Retrivingfiles {
    private String path;
    
    public Retrivingfiles(String file_path)    {
    
        path=file_path;
    }
    
    public String[] OpenFile()throws IOException{
        
    FileReader fr = new FileReader(path);
    BufferedReader textreader=new BufferedReader(fr);
    
    int numberOflines = readlines();
    String[] textdata=new String[numberOflines];
    
    int i;
    for(i=0;i<numberOflines;i++)
    {
    textdata[i]=textreader.readLine();
    }
    textreader.close();
    return textdata;
    }
    
    int readlines() throws IOException{
    
        FileReader file_read=new FileReader(path);
        BufferedReader buff=new BufferedReader(file_read);
        
        String lines;
        int numberOflines=0;
        while((lines=buff.readLine())!=null){
        numberOflines++;
        }
        buff.close();
        return numberOflines;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
