import java.util.LinkedList;
import java.util.Queue;

class Process {
    String name;
    int burstTime;

    public Process(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
    }
}

class RoundRobinScheduler {
    private Queue<Process> processQueue;
    private int quantum;

    public RoundRobinScheduler(int quantum) {
        this.processQueue = new LinkedList<>();
        this.quantum = quantum;
    }

    public void addProcess(Process process) {
        processQueue.add(process);
    }

    public void runScheduler() {
        while (!processQueue.isEmpty()) {
            Process currentProcess = processQueue.poll();

            int remainingTime = Math.min(currentProcess.burstTime, quantum);
            System.out.println("Executing process " + currentProcess.name +" for time " + remainingTime);

            currentProcess.burstTime -= remainingTime;

            if (currentProcess.burstTime > 0) {
                processQueue.add(currentProcess);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(2);
        
        Process p1 = new Process("P1", 5);
        Process p2 = new Process("P2", 3);
        Process p3 = new Process("P3", 8);

        scheduler.addProcess(p1);
        scheduler.addProcess(p2);
        scheduler.addProcess(p3);

        scheduler.runScheduler();
    }
}
