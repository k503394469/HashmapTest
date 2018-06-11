
package hasptest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class HaspTest {
    public static void main(String[] args) {
        HashMap hm=new LinkedHashMap();
        Monkey d1=new Monkey();
        d1.setName("aaa");
        d1.setNum(1);
        Monkey d2=new Monkey();
        d2.setName("bbb");
        d2.setNum(2);
        Monkey d3=new Monkey();
        d3.setName("ccc");
        d3.setNum(3);
        hm.put("1", d1);
        hm.put("2", d2);
        hm.put("3",d3);
        
        String key="1";
        Search s=new Search(key,d1);
   
        
        
    }
    
}
