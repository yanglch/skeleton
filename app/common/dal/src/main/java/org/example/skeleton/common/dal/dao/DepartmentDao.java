package org.example.skeleton.common.dal.dao;

import static org.example.skeleton.common.dal.dao.DepartmentDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

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
import org.example.skeleton.common.dal.entity.DepartmentDO;
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
public interface DepartmentDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, code, name, parentCode, gmtCreate, gmtModified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DepartmentDO> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<DepartmentDO> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DepartmentDOResult")
    Optional<DepartmentDO> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DepartmentDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="parent_code", property="parentCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DepartmentDO> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, departmentDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, departmentDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DepartmentDO record) {
        return MyBatis3Utils.insert(this::insert, record, departmentDO, c ->
            c.map(id).toProperty("id")
            .map(code).toProperty("code")
            .map(name).toProperty("name")
            .map(parentCode).toProperty("parentCode")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<DepartmentDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, departmentDO, c ->
            c.map(id).toProperty("id")
            .map(code).toProperty("code")
            .map(name).toProperty("name")
            .map(parentCode).toProperty("parentCode")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(DepartmentDO record) {
        return MyBatis3Utils.insert(this::insert, record, departmentDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(code).toPropertyWhenPresent("code", record::getCode)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(parentCode).toPropertyWhenPresent("parentCode", record::getParentCode)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DepartmentDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, departmentDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DepartmentDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, departmentDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DepartmentDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, departmentDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DepartmentDO> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, departmentDO, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(DepartmentDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(code).equalTo(record::getCode)
                .set(name).equalTo(record::getName)
                .set(parentCode).equalTo(record::getParentCode)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DepartmentDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(code).equalToWhenPresent(record::getCode)
                .set(name).equalToWhenPresent(record::getName)
                .set(parentCode).equalToWhenPresent(record::getParentCode)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(DepartmentDO record) {
        return update(c ->
            c.set(code).equalTo(record::getCode)
            .set(name).equalTo(record::getName)
            .set(parentCode).equalTo(record::getParentCode)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(DepartmentDO record) {
        return update(c ->
            c.set(code).equalToWhenPresent(record::getCode)
            .set(name).equalToWhenPresent(record::getName)
            .set(parentCode).equalToWhenPresent(record::getParentCode)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
}