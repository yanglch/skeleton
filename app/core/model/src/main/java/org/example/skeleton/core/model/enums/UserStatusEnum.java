package org.example.skeleton.core.model.enums;

/**
 * @author yangLuChang
 *
 */
public enum UserStatusEnum {
    //
    NORMAL(0, "正常"),
    DISCARD(10, "废弃"),
    ;
    private final int code;
    private final String desc;
    UserStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static UserStatusEnum getEnumByCode(int code) {
        for (UserStatusEnum statusEnum : values()) {
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
