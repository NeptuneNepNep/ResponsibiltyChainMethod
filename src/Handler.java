//抽象处理者类
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;
    //领导处理请假时间
    private int numStart;
    private int numEnd;
    //生命后继者
    private  Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请求条方法
    public abstract void handlerLeave(LeaveRequest leave);

    //提交请假条
    protected final void submit(LeaveRequest leave) {
        this.handlerLeave(leave);
        if(this.nextHandler != null && leave.getNum() > this.numEnd) {
            this.nextHandler.submit(leave);

        } else {
            System.out.println("流程结束了");

        }

    }
}
