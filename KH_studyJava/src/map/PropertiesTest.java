package map;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args)throws IOException {

        Properties prop = new Properties();
        // key, valueㄱㅏ 문자열 정해진 Map 컬렉션

        FileReader reader = new FileReader("./application.properties");
        prop.load(reader);
        reader.close();
        System.out.println("크기: " + prop.size());

        Set<Object> keys = prop.keySet();
        for(Object key : keys) {
            System.out.println(key+"=" +prop.get(key));
        }
        System.out.println();
        for(Map.Entry<Object, Object> entry: prop.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
