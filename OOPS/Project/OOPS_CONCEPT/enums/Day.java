package enums;

public enum Day {
    monday(true) , tuesday(true),wednesday(true),thursday(true),friday(true)
    ,saturday(false),sunday(false);
    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
    public String getType(){
        return isWeekDay?"WEEKDAY":"WEEKEND" ;
    }
}
