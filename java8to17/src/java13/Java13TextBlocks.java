package java13;

public class Java13TextBlocks {
    public void textBlockExample() {
        var dummyText = """
                SELECT * FROM CUSTOMER
                WHERE CUSTOMER_ID=XYZ 
                AND AGE > 50
                """;
    }
}
