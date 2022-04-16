public class GeneralManager extends Handler{
    GeneralManager() {
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }
    @Override
    public void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName()+"请假"+ leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总部门组长长审批，同意");
    }
}
