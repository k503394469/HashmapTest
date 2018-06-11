package hasptest;

import java.util.*;

public class HaspTest {

    public static void main(String[] args) {
        MonkeyMEG mEG = new MonkeyMEG();
        while (true) {
            System.out.println("输入项目");
            Scanner s = new Scanner(System.in);
            String getString = s.nextLine();
            if (getString.equals("1")) {
                System.out.println("输入编号");
                String code = s.nextLine();
                mEG.add(code);
            } else if (getString.equals("2")) {
                System.out.println("输入编号");
                String nameString = s.nextLine();
                mEG.search(nameString);
            }else if (getString.equals("3")) {
                System.out.println("所有信息");
                mEG.showAllInfo();
            }
        }
    }

}
