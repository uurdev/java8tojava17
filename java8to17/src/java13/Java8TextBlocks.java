package java13;

public class Java8TextBlocks {
    public void textBlockExample(){
        String dummyValue= "SELECT *" +
                "FROM CUSTOMER " +
                "WHERE CUSTOMER_ID=XYZ " +
                " AND AGE > 50";
    }
}
