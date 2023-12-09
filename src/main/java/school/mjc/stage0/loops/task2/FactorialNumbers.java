package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 0;
        while(num <= printToInclusive){
            int i = 0;
            while(i < num){
                System.out.println(i);
                i++;
            }
            num++;
        }
    }
}
