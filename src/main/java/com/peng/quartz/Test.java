package com.peng.quartz;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2019/2/28
 */
public class Test {
    public static void main(String[] args) {
//        String cron = "0 10/10sAAs * ? * *";
//        System.out.println(CronExpression.isValidExpression(cron));
//
//        long s = 1551405619165L;
//        Date t = new Date(s);
//        LocalDate localDate = Instant.ofEpochMilli(s).atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDateTime localDateTime = Instant.ofEpochMilli(s).atZone(ZoneId.systemDefault()).toLocalDateTime();
//        System.out.println(localDate);
//        System.out.println(localDateTime.toString());
//        System.out.println(Instant.ofEpochMilli(s).atZone(ZoneId.systemDefault()).toString());

//        String a = null;
//
//        if(!Strings.isNullOrEmpty(a) && a.contains(".")){
//            System.out.println(a.substring(0,a.indexOf(".")));
//        }else{
//            System.out.println(a);
//        }
//
//        String context = " selecdt a#{haha}a form table";
//        String key = "haha";
//        if(context.contains("#{"+key+"}")){
//            context = context.replaceAll("#\\{"+key+"}","safsdf");
//        }
//        System.out.println(context);

//        System.out.println(compareValue("20s","10000","4"));
//        try {
//            String sb = new String("&#25805;".getBytes(),"UTF-8");
//            System.out.println(sb);
//            byte[] xx = sb.getBytes("utf-8");
//            System.out.println(new String(xx,"utf-8"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        String date = "2019-06-10";
//        String endDate = "2019-06-20";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate s = LocalDate.parse(date, df);
////        long s = formatter.parse(date);
//        LocalDateStringConverter localDateStringConverter = new LocalDateStringConverter();
//        int b1 = localDateStringConverter.fromString(date).compareTo(LocalDate.now());
//        int b2 = localDateStringConverter.fromString(date).compareTo(localDateStringConverter.fromString(endDate));
//        System.out.println(b1);
//        System.out.println(b2);

//        DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String s = Instant.ofEpochMilli(-1).atZone(ZoneId.systemDefault()).toLocalDateTime().format(DATE_TIME_FORMATTER);
//        System.out.println(s);


//        String content = null;
//        try {
//            String sour = null;
//            content = new String(sour.getBytes("iso-8859-1"),"UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        System.out.println(content);



    }

    private static boolean compareValue(String source, String dest, String method) {

        int validateResult = 0;
        try {
            System.out.println("转换为数字比较source=" + source + "; dest=" + dest);
            Integer s = Integer.valueOf(source);
            Integer e = Integer.valueOf(dest);
            validateResult = s.compareTo(e);
        } catch (NumberFormatException e1) {
            System.out.println("转换为数字异常，进行字符串比较source=" + source + "; dest=" + dest);
            validateResult = source.compareTo(dest);
        }
        switch (method) {
            case "3": {
                return validateResult == 0;
            }
            case "1": {
                return validateResult > 0;
            }
            case "2": {
                return validateResult < 0;
            }
            case "4": {
                return validateResult >= 0;
            }
            case "5": {
                return validateResult <= 0;
            }
            default:
                return false;
        }
    }
}
