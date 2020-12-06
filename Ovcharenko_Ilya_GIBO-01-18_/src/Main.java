import java.io.*;
public class Main {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("/Users/Илья/IdeaProjects/Ovcharenko_Ilya_GIBO-01-18_/src/note.txt",false);
            String text = "Илья Овчаренко";
            file.write(text);
            file.append('\n');
            file.append("Сергеевич");
            file.flush();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try{
            FileReader reader = new FileReader("/Users/Илья/IdeaProjects/Ovcharenko_Ilya_GIBO-01-18_/src/note.txt");
            int c;

            while((c=reader.read())!=-1){
                System.out.print((char)c);

            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

