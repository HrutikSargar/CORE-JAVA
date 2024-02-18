package collectionFramework.Map.MapEGSubject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class batch {
    Map<String,String> data=new LinkedHashMap<>();

    public void addSubject(String batchcode,String sub){
        data.put(batchcode,sub);
    }
    public void remove(String batchcode){
        if (data.containsKey(batchcode)){
            data.remove(batchcode);
        }else {
            System.out.println("invalid batch code");
        }
    }
    public void subject(){
        Set<Map.Entry<String,String>> data1=data.entrySet();
        if (!data.isEmpty()){
            for (Map.Entry<String,String> d1:data1) {
                System.out.println(d1.getKey()+"\t"+d1.getValue());
            }
        }else {
            System.out.println("Empty set");
        }
    }
}
