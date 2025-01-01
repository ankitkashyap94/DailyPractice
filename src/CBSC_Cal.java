public class CBSC_Cal {
    public static void main(String[] args) {

        CBSC_Cal  cal = new  CBSC_Cal();
        System.out.println( cal.percentCal(90,95,100,100,95,94));;
    }

    public double percentCal(int ...marksArr){

        int arrLen = marksArr.length;
        int markMax = 100;

        int totalMarks = markMax * arrLen;
        int obtained = 0;

        for(int mark : marksArr){
            System.out.println(mark);

         obtained = obtained + mark;


        }
        System.out.println("Your Total Obtained Marks --> " + obtained + ",\nOut of total Marks --> "+ totalMarks);
       double obtainedPercent = obtained / arrLen;

        return obtainedPercent;



    }
}
