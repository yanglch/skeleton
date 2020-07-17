package org.example.skeleton.common.dal.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDODynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final UserDO userDO = new UserDO();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = userDO.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jobNo = userDO.jobNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> nickName = userDO.nickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> loginName = userDO.loginName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> passWord = userDO.passWord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> salt = userDO.salt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> departmentCode = userDO.departmentCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> status = userDO.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> gmtCreate = userDO.gmtCreate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> gmtModified = userDO.gmtModified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class UserDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> jobNo = column("job_no", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> loginName = column("login_name", JDBCType.VARCHAR);

        public final SqlColumn<String> passWord = column("pass_word", JDBCType.VARCHAR);

        public final SqlColumn<String> salt = column("salt", JDBCType.VARCHAR);

        public final SqlColumn<String> departmentCode = column("department_code", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public UserDO() {
            super("user");
        }
    }
}