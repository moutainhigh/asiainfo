package com.bdx.rainbow.gds.mapper;

import com.bdx.rainbow.gds.entity.Pgds;
import com.bdx.rainbow.gds.entity.PgdsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PgdsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int countByExample(PgdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int deleteByExample(PgdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int deleteByPrimaryKey(String barcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int insert(Pgds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int insertSelective(Pgds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    List<Pgds> selectByExample(PgdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    Pgds selectByPrimaryKey(String barcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") Pgds record, @Param("example") PgdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int updateByExample(@Param("record") Pgds record, @Param("example") PgdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int updateByPrimaryKeySelective(Pgds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    int updateByPrimaryKey(Pgds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table p_gds
     *
     * @mbggenerated Sat Apr 16 12:10:59 CST 2016
     */
    void insertBatch(List<Pgds> recordLst);
}