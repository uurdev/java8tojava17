package java15;

public class Java8SwitchExample {

    public int java8SeasonalSlice(String month) throws IllegalAccessException {
        int val;
        switch (month){
            case "Jan":
            case "Feb":
            case "Mar":
            case "Apr":
                val=1;
                break;
            case "May":
            case "Jun":
            case "Jul":
            case "Aug":
                val=2;
                break;
            case "Sep":
            case "Oct":
            case "Nov":
            case "Dec":
                val=3;
                break;
            default:
                throw new IllegalAccessException("Unexpected value:"+ month);
        }
        return val;
    }
}
