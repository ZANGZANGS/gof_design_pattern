package gof.dp.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {

        Scheduler scheduler = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("L: 가장 짧은 작업 처리");
        System.out.println("P: 가장 우선순위가 높은 작업 우선 처리");
        System.out.println("R: 순차적으로 작업 처리");

        String input = br.readLine();

        if(input.equals("L") || input.equals("ㅣ") ){
            scheduler = new LeastJob();
        }else if(input.equals("P") || input.equals("p") ){
            scheduler = new Priority();
        }else if(input.equals("R") || input.equals("r") ){
            scheduler = new Roundrobin();
        }else{
            System.out.println("잘못된 입력입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallAgent();

    }
}
