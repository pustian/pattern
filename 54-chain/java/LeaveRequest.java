public class LeaveRequest {
    private String name;
    private Integer days;
    
    public LeaveRequest(String name, Integer days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }
    public Integer getDays() {
        return days;
    }
}
