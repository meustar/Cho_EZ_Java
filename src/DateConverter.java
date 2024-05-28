public class DateConverter {
    public static void main(String[] args) {
        String dateToDay = "1970/01/23";
        String year = dateToDay.substring(0, 4);
        String month = dateToDay.substring(5, 7);
        String day = dateToDay.substring(8);

        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}
