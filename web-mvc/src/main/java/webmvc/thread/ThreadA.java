package webmvc.thread;

public class ThreadA implements Runnable {
    /*Resource resource=new Resource();*/
    private int i = 5;

    @Override
    synchronized public void run() {
        i--;
        System.out.println(i);
    }


    public String getParentId(String parentId) {

        String dbParentId = "mapper.select from db where id="+parentId;

        if (parentId == "001") {
            return "001";
        }
        parentId = dbParentId;

        return getParentId(parentId);

    }
}
