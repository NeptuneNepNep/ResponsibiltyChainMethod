public class Client {
    public static void main(String[] args) {
        LeaveRequest leave = new LeaveRequest("小明",5,"圣体不适");

        //创建各级对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        //处理处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        //提交请假
        groupLeader.submit(leave);
    }
}
