package org.example.skeleton.common.dal.dao;

import static org.example.skeleton.common.dal.dao.ApplicationDoDynamicSqlSupport.*;
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
import org.example.skeleton.common.dal.entity.ApplicationDo;
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
public interface ApplicationDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, status, ownerId, codeRepository, gmtCreate, gmtModified);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ApplicationDo> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ApplicationDo> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ApplicationDoResult")
    Optional<ApplicationDo> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ApplicationDoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="owner_id", property="ownerId", jdbcType=JdbcType.INTEGER),
        @Result(column="code_repository", property="codeRepository", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<ApplicationDo> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, applicationDo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, applicationDo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ApplicationDo record) {
        return MyBatis3Utils.insert(this::insert, record, applicationDo, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(status).toProperty("status")
            .map(ownerId).toProperty("ownerId")
            .map(codeRepository).toProperty("codeRepository")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ApplicationDo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, applicationDo, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(status).toProperty("status")
            .map(ownerId).toProperty("ownerId")
            .map(codeRepository).toProperty("codeRepository")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ApplicationDo record) {
        return MyBatis3Utils.insert(this::insert, record, applicationDo, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(ownerId).toPropertyWhenPresent("ownerId", record::getOwnerId)
            .map(codeRepository).toPropertyWhenPresent("codeRepository", record::getCodeRepository)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ApplicationDo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, applicationDo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ApplicationDo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, applicationDo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ApplicationDo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, applicationDo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ApplicationDo> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, applicationDo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ApplicationDo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(status).equalTo(record::getStatus)
                .set(ownerId).equalTo(record::getOwnerId)
                .set(codeRepository).equalTo(record::getCodeRepository)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ApplicationDo record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(ownerId).equalToWhenPresent(record::getOwnerId)
                .set(codeRepository).equalToWhenPresent(record::getCodeRepository)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ApplicationDo record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(status).equalTo(record::getStatus)
            .set(ownerId).equalTo(record::getOwnerId)
            .set(codeRepository).equalTo(record::getCodeRepository)
            .set(gmtCreate).equalTo(record::getGmtCreate)
            .set(gmtModified).equalTo(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ApplicationDo record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(ownerId).equalToWhenPresent(record::getOwnerId)
            .set(codeRepository).equalToWhenPresent(record::getCodeRepository)
            .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(record::getGmtModified)
            .where(id, isEqualTo(record::getId))
        );
    }
}