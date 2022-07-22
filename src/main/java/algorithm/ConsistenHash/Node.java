package algorithm.ConsistenHash;

/**
 * @class: Node
 * @description:
 * @author: dudg
 * @create: 2022-07-21 17:28
 */
public class Node<T> {

    private String ip;
    private String name;

    public Node(String ip, String name) {
        this.ip = ip;
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 使用IP当作hash的key
     *
     * @return
     */
    @Override
    public String toString() {
        return ip;
    }
}
