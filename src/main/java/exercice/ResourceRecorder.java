package exercice;

public class ResourceRecorder {

    private long startTime;
    private long endTime;
    private long beforeUsedMemory;

    private Runtime runtime;
    private long afterUsedMemory;

    public ResourceRecorder(){
        runtime = Runtime.getRuntime();
    }

    public void start(){
        runtime.gc();
        this.startTime = System.nanoTime();
        this.beforeUsedMemory = runtime.totalMemory();
    }
    public void stop(){
        this.endTime = System.nanoTime();
        this.afterUsedMemory = runtime.freeMemory();
    }

    public double getFinalExecutionTime(){
        return ((double) this.endTime - this.startTime) / 1_000_000.0;
    }

    public long getTotalMemoryUsed(){
        return this.beforeUsedMemory - this.afterUsedMemory;
    }

    public String toString(){
        return "Execution Time: " + this.getFinalExecutionTime() + " ms\n" + " Memory used : " + this.getTotalMemoryUsed() + " octets";
    }


}
