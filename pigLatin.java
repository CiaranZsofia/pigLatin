package Projects;
import javax.swing.*;

public class pigLatin {
    public static void main(String args[]) {
        String word = JOptionPane.showInputDialog("Please enter a word: "); 
        for(int i=0; i<word.length(); ++i) {
            char c = word.charAt(i);
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                String pigLatin = word.substring(i) + word.substring(0,i)+"ay";
                JOptionPane.showMessageDialog(null, "This is your word in pig Latin:" + pigLatin);
            }
        }
    }
}
