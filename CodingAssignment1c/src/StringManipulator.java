public class StringManipulator {
    private String text1;
    private String text2;

   //Default Constructor
   public StringManipulator(){
    text1 = "";
    text2 = "";
   }
   
   //Patameter Constructor
   public StringManipulator(String t1, String t2){
    text1 = t1;
    text2 = t2;
   }
    //Combine String constructor
    public String combineStrings(){
        return text1 + text2;
    }
    //Length of Text1 + Text2 Constructor
    //public String getCombinedLengths(){}
}
