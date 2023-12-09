package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 1;
        while(num <= printToInclusive){
            int i = 1;
            int mult = 1;
            while(i < num){
                mult = mult * i;
                i++;
            }
            System.out.println(mult);
            num++;
        }
    }
}
