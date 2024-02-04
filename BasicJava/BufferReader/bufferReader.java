package BasicJava.BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStream;
import java.io.InputStreamReader;
/*        ॐ हौं जूं सः ॐ भूर्भुवः स्वः 
        ॐ त्र्यम्बकं यजामहे सुगन्धिं पुष्टिवर्धनम्| 
        उर्वारुकमिव बन्धनान्मृत्योर्मुक्षीय मामृतात्|| 
          ॐ स्वः भुवः भूः ॐ सः जूं हौं ॐ 
*/
public class bufferReader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num;
        try {
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        bf.close();
    }
}
