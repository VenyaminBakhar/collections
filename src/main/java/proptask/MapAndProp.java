package proptask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Вениамин on 7/20/2017.
 */
public class MapAndProp {

    Map<String,String> map;


    MapAndProp(){
        map = new HashMap<String, String>();
    }

    void showAllElements(){
        for (Map.Entry<String,String> entry : this.map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key-"+key+" value-"+value);
        }
    }

    void MapInit(String path){
        FileInputStream fis;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream(path);
            properties.load(fis);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

        for (String key : properties.stringPropertyNames()){
            map.put(key,properties.getProperty(key));
        }
    }

}
