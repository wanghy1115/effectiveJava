package pojo;

public class FixTool {
    private String name;
    private String use;

    private static FixTool wrench;
    private static FixTool hatchet;

    private FixTool(String name, String use){
        this.name = name;
        this.use = use;
    }

    public static FixTool getWrench(){
        if(wrench == null){
            wrench = new FixTool("扳手", "拆卸螺栓");
        }
        return wrench;
    }
    public static FixTool getHatchet(){
        if(hatchet == null){
            hatchet = new FixTool("斧头", "砍木头");
        }
        return hatchet;
    }

    public String toString(){
        return String.format("%s用来%s", name, use);
    }
}
