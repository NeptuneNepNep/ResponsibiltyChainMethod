public class Manager extends Handler{
    Manager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }
    @Override
    public void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+ leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门组长长审批，同意");
    }
}
