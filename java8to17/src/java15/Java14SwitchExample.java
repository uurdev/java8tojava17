package java15;

public class Java14SwitchExample {

    public int java14SeasonalSlice(String month) throws IllegalAccessException {
       return switch (month){
            case "Jan","Feb","Mar","Apr"->1;
            case "May","Jun","Jul","Aug"->2;
            case "Sep","Oct","Nov","Dec"->3;
            default->
                throw new IllegalAccessException("Unexpected value:"+ month);
        };
    }
}
