package may_twenty_four;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 美国节日 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int year = scanner.nextInt();
            AmericanFestival(year);
        }
    }

    private static void AmericanFestival(int year) {
        int mon[] = new int[]{1,2,5,9,11}; // 将有按星期节日的月取出来
        int len = mon.length;
        int wek[] = new int[len];
        // Calendar可以用来操作日历字段
        Calendar cal = Calendar.getInstance(); // 使用默认时区和区域设置获取日历。
        try{
            // 设置传入的时间格式
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
            for (int i = 0; i < len; i++) { // 指定一个日期
                Date date = dateFormat.parse(year + "-" + mon[i] + "-1");
                cal.setTime(date);
                int week = cal.get(Calendar.DAY_OF_WEEK) - 1; // 计算每月1号位于周几
                if(week == 0) week = 7;
                wek[i] = week;
//                System.out.println(week);
            }
        }catch (Exception e){

        }
        System.out.println(year + "-01-01");

        // 1月的第三个星期一
        int jan = wek[0];
        int rs = 0;
        String strRs = "";
        if(jan == 1){
            rs = 2 * 7 + 1;
        }else{
            rs = 3* 7 - (jan - 1) + 1;
        }
        strRs = rs/10 == 0 ? "0"+ rs:String.valueOf(rs);
        System.out.println(year + "-01-" + strRs);

        // 2月第三个星期一
        int feb = wek[1];
        if(feb == 1){
            rs = 2 * 7 + 1;
        }else {
            rs = 3 *7 -  (feb - 1) + 1;
        }
        strRs = rs / 10 == 0 ? "0" + rs : String.valueOf(rs);


        //5月的最后一个星期一(星期一：一个月（4~5次）)
        int may=wek[2];
        if(may>=6){//第五个星期一
            rs=may==6?31:30;
        }
        else{//第四个星期一
            rs=4*7-(may-1)+1;
        }
        strRs=rs/10==0?"0"+rs:String.valueOf(rs);
        System.out.println(year+"-05-"+strRs);

        System.out.println(year+"-07-04");


        //9月的第一个星期一
        int sep=wek[3];
        if(sep==1){
            rs=1;
        }
        else{
            rs=1*7-(sep-1)+1;
        }
        strRs=rs/10==0?"0"+rs:String.valueOf(rs);
        System.out.println(year+"-09-"+strRs);


        //11月的第四个星期四
        int nov=wek[4];
        rs=4*7-(nov-1)+1+3;
        strRs=rs/10==0?"0"+rs:String.valueOf(rs);
        System.out.println(year+"-11-"+strRs);

        System.out.println(year+"-12-25");
//        System.out.println();
    }
}
