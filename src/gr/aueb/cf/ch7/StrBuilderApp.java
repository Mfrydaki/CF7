package gr.aueb.cf.ch7;

public class StrBuilderApp {
    public static void main(String[] args) {

        String concatStr = " ";
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;
        double sBElapsedTime = 0.0;
        StringBuilder sb = new StringBuilder();


        timeStart= System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++) {
            concatStr = concatStr + i;
        }
         timeEnd= System.currentTimeMillis();
         elapsedTime= (timeEnd - timeStart) /1000.0; // /1000 secs + .0 long


        timeStart= System.currentTimeMillis();
        for (int i = 1; i <= 50_000; i++){
             sb.append(i);}

            timeEnd= System.currentTimeMillis();
            sBElapsedTime= (timeEnd - timeStart) /1000.0; // /1000 secs + .0 long


            System.out.println("Sting Elapsed Time : "+elapsedTime + "seconds");
            System.out.println("Sb Elapsed Time: "+sBElapsedTime + "seconds");
        }
    }


