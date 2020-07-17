package org.example.skeleton.common.dal.dao;

import static org.example.skeleton.common.dal.dao.UserDODynamicSqlSupport.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.example.skeleton.common.dal.entity.UserDO;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, jobNo, nickName, loginName, passWord, salt, departmentCode, status, gmtCreate, gmtModified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<UserDO> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<UserDO> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserDOResult")
    Optional<UserDO> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="job_no", property="jobNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pass_word", property="passWord", jdbcType=JdbcType.VARCHAR),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="department_code", property="departmentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserDO> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, userDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, userDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(UserDO record) {
        return MyBatis3Utils.insert(this::insert, record, userDO, c ->
            c.map(id).toProperty("id")
            .map(jobNo).toProperty("jobNo")
            .map(nickName).toProperty("nickName")
            .map(loginName).toProperty("loginName")
            .map(passWord).toProperty("passWord")
            .map(salt).toProperty("salt")
            .map(departmentCode).toProperty("departmentCode")
            .map(status).toProperty("status")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<UserDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, userDO, c ->
            c.map(id).toProperty("id")
            .map(jobNo).toProperty("jobNo")
            .map(nickName).toProperty("nickName")
            .map(loginName).toProperty("loginName")
            .map(passWord).toProperty("passWord")
            .map(salt).toProperty("salt")
            .map(departmentCode).toProperty("departmentCode")
            .map(status).toProperty("status")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(UserDO record) {
        return MyBatis3Utils.insert(this::insert, record, userDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(jobNo).toPropertyWhenPresent("jobNo", record::getJobNo)
            .map(nickName).toPropertyWhenPresent("nickName", record::getNickName)
            .map(loginName).toPropertyWhenPresent("loginName", record::getLoginName)
            .map(passWord).toPropertyWhenPresent("passWord", record::getPassWord)
            .map(salt).toPropertyWhenPresent("salt", record::getSalt)
            .map(departmentCode).toPropertyWhenPresent("departmentCode", record::getDepartmentCode)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<UserDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, userDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UserDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, userDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<UserDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, userDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, userDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(UserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(jobNo).equalTo(record::getJobNo)
                .set(nickName).equalTo(record::getNickName)
                .set(loginName).equalTo(record::getLoginName)
                .set(passWord).equalTo(record::getPassWord)
                .set(salt).equalTo(record::getSalt)
                .set(departmentCode).equalTo(record::getDepartmentCode)
                .set(status).equalTo(record::getStatus)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UserDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(jobNo).equalToWhenPresent(record::getJobNo)
                .set(nickName).equalToWhenPresent(record::getNickName)
                .set(loginName).equalToWhenPresent(record::getLoginName)
                .set(passWord).equalToWhenPresent(record::getPassWord)
                .set(salt).equalToWhenPresent(record::getSalt)
                .set(departmentCode).equalToWhenPresent(record::getDepartmentCode)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }
}