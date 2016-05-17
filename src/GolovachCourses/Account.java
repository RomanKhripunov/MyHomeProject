package GolovachCourses;

public interface Account {

    public void change(int delta) throws TryAgainEx, ZedDeadEx;
}
