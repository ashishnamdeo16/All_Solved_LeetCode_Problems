class MovingAverage {
    Queue<Integer> que;
    int size;
    double sum;

    public MovingAverage(int size) {
        this.size = size;
        this.que = new ArrayDeque<>();
        this.sum = 0;
    }
    
    public double next(int val) {
        que.offer(val);

        sum += val;

        if(que.size() > size){
            sum -= que.poll();
        }

        return (double) sum/que.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */