/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasptest;

import java.util.*;

/**
 *
 * @author Mr.A
 */
public class MonkeyMEG {

    HashMap<String, Monkey> map = null;

    public MonkeyMEG() {
        map = new HashMap<>();
    }

    public void add(String key) {
        Scanner s = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = s.nextLine();
        System.out.println("输入号码");
        int num = s.nextInt();
        map.put(key, new Monkey(name, num));
    }

    public void search(String keyString) {
        if (map.containsKey(keyString)) {
            Monkey m = map.get(keyString);
            System.out.println("编号" + keyString);
            System.out.println("姓名" + m.getName());
            System.out.println("编号" + m.getNum());

        }
    }

    public void showAllInfo() {
        if (map.isEmpty()) {
            System.out.println("没有信息");
        } else {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {            //循环获取每个信息
                String key = it.next().toString();//获取当前循环key值
                Monkey monkey = map.get(key);
                System.out.println("编号" + key);
                System.out.println("姓名" + monkey.getName());
                System.out.println("号码" + monkey.getNum());
            }
        }
    }

    public void changeName() {
        Scanner s = new Scanner(System.in);
        System.out.println("输入要修改人的姓名");
        String name = s.nextLine();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next().toString();
            Monkey m = map.get(key);
            if (m.getName().equals(name)) {
                System.out.println("输入新姓名");
                String newName = s.nextLine();
                m.setName(newName);
            } else if (m.getName().isEmpty()) {
                System.out.println("无此人");
            }

        }
    }

}
