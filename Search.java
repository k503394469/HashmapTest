
package hasptest;

import java.util.*;
public  class Search {
    
    public Search(String key,Monkey monkey) {
        HashMap hm=new LinkedHashMap();
        hm.put(key, monkey);
        if (hm.containsKey(key)) {
            System.out.println("名字："+monkey.getName());
            System.out.println("编号："+monkey.getNum());
        }
        
    }
    
}
