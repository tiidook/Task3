package com.company.ex5;

public class CalendarLogic {

    public static final int CountDayInMonth30=30;
    public static final int CountDayInMonth31=31;
    public static final int LeapFeb=29;
    public static final int UsualFeb=28;



    public static String getDate(String day,String month,String year){

        int yearThis=Integer.parseInt(year);
        int monthThis=Integer.parseInt(month);
        int dayThis=Integer.parseInt(day);
        int tommorrowDay=dayThis;
        int nextMonth=monthThis;
        int nextYear=yearThis;
        boolean isLeap=(yearThis%4==0 && yearThis%100!=0 && yearThis%400!=0) ||
                (yearThis%4==0 && yearThis%100==0 && yearThis%400==0);
        String response;

            switch (month){
                case "01":
                case "03":
                case "05":
                case "07":
                case "08":
                case "10":response=checkMonth31(tommorrowDay,nextMonth,nextYear);break;
                case "02":response=checkFeb(tommorrowDay,nextMonth,nextYear,isLeap);break;
                case "04":
                case "06":
                case "09":
                case "11":response=checkMonth30(tommorrowDay,nextMonth,nextYear);break;
                case "12":response=checkDec(tommorrowDay,nextMonth,nextYear);break;
                default:response="Wrong month ";break;
            }

        return response;

    }

    public static String checkMonth31(int tommorrowDay,int nextMonth,int nextYear){

        if (tommorrowDay>=1 && tommorrowDay<CountDayInMonth31){

            tommorrowDay+=1;

        }else if(tommorrowDay==CountDayInMonth31){

            tommorrowDay=1;
            nextMonth+=1;

        }else{
            return "Check your date ";
        }

        return "Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;

    }

    public static String checkFeb(int tommorrowDay,int nextMonth,int nextYear,boolean isLeap){

        String response="Check your date";//to avoid 3 of "return"
        if(isLeap) {
            if (tommorrowDay >= 1 && tommorrowDay < LeapFeb) {
                tommorrowDay += 1;
                response="Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;

            } else if (tommorrowDay == LeapFeb) {
                tommorrowDay = 1;
                nextMonth +=1;
                response="Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;
            }
        }else {

            if(tommorrowDay>=1 && tommorrowDay<UsualFeb){
                tommorrowDay+=1;
                response="Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;
            }else if(tommorrowDay==UsualFeb){
                tommorrowDay=1;
                nextMonth+=1;
                response="Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;
            }
        }
        return response;
    }

    public static String checkDec(int tommorrowDay,int nextMonth,int nextYear){

        if (tommorrowDay>=1 && tommorrowDay<CountDayInMonth31){

            tommorrowDay+=1;

        }else if(tommorrowDay==CountDayInMonth31){

            tommorrowDay=1;
            nextMonth=1;
            nextYear+=1;

        }else{
            return "Check your date ";
        }
        return "Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;
    }

    public static String checkMonth30(int tommorrowDay,int nextMonth,int nextYear){

        if (tommorrowDay>=1 && tommorrowDay<CountDayInMonth30){

            tommorrowDay+=1;

        }else if(tommorrowDay==CountDayInMonth30){

            tommorrowDay=1;
            nextMonth+=1;

        }else{
            return "Check your date ";
        }

        return "Tomorrow date is : " + tommorrowDay + "." + nextMonth + "." + nextYear;

    }


}
