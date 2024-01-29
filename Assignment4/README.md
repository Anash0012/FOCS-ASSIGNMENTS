# Round Robin Scheduler

This Java program demonstrates a basic implementation of a Round Robin scheduler. In this scheduling algorithm, each process is assigned a fixed time quantum during which it is allowed to execute. The scheduler cycles through the processes, providing each with a turn to execute.

## Files

- `Main.java`: The main program that initializes the RoundRobinScheduler, adds processes, and runs the scheduler.
- `RoundRobinScheduler.java`: Implementation of the Round Robin scheduler class.
- `Process.java`: Definition of the Process class representing a process with a name and burst time.

## How to Run

1. Compile the Java files using a Java compiler:

    ```bash
    javac Main.java
    ```

2. Run the compiled program:

    ```bash
    java Main
    ```

## Output

The program will output the execution steps for each process, indicating which process is executing for a specific time quantum.

Example Output:

- Executing process P1 for time 2
- Executing process P2 for time 2
- Executing process P3 for time 2
- Executing process P1 for time 2
- Executing process P2 for time 1
- Executing process P3 for time 2
- Executing process P1 for time 1
- Executing process P3 for time 1
- Executing process P1 for time 1