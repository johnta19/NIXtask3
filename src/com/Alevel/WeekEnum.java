package com.Alevel;

enum WeekEnum {
        MONDAY(DayTypes.WORKDAY), TUESDAY(DayTypes.WORKDAY), WEDNESDAY(DayTypes.WORKDAY),
    THURSDAY(DayTypes.WORKDAY), FRIDAY(DayTypes.WORKDAY), SATURDAY(DayTypes.WEEKEND), SUNDAY(DayTypes.WEEKEND);
        enum DayTypes{
            WEEKEND, WORKDAY
        }
    private final DayTypes dayType;

    WeekEnum(DayTypes dayType) {
        this.dayType = dayType;
    }
     DayTypes getDayType(){
        return dayType;
    }
}