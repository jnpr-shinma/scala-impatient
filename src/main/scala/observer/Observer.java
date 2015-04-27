package observer;

/**
 * Created by maxin on 15-1-20.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}