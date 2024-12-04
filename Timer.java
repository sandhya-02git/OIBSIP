public class Timer {
    private long examTime; // Time in milliseconds
    private long startTime;

    public Timer(long examTime) {
        this.examTime = examTime;  // Exam time in milliseconds (30 seconds = 30 * 1000)
        this.startTime = System.currentTimeMillis(); // Current time when the exam starts
    }

    public void start() {
        // Wait until the exam time has elapsed (without printing every second)
        while (System.currentTimeMillis() - startTime < examTime) {
            // Just wait, no output for each second
        }

        // Once time is up, automatically submit the exam
        System.out.println("\nTime is up! Submitting your exam...");
    }
}
