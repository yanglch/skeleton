package org.example.skeleton.core.model.enums;

public enum ApplicationStatusEnum {
    //
    NORMAL(0, "正常"),
    DISCARD(10, "废弃"),
    ;
    private final int code;
    private final String desc;
    ApplicationStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ApplicationStatusEnum getEnumByCode(int code) {
        for (ApplicationStatusEnum statusEnum : values()) {
            if (statusEnum.code == code) {
                return statusEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
