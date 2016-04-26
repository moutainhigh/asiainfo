package com.bdx.rainbow.mapper.ydzf;

import com.bdx.rainbow.entity.ydzf.TYdzfInspectCaseReadyPunish;
import com.bdx.rainbow.entity.ydzf.TYdzfInspectCaseReadyPunishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TYdzfInspectCaseReadyPunishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int countByExample(TYdzfInspectCaseReadyPunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int deleteByExample(TYdzfInspectCaseReadyPunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int deleteByPrimaryKey(Integer inspectCaseReadyPunishId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int insert(TYdzfInspectCaseReadyPunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int insertSelective(TYdzfInspectCaseReadyPunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    List<TYdzfInspectCaseReadyPunish> selectByExample(TYdzfInspectCaseReadyPunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    TYdzfInspectCaseReadyPunish selectByPrimaryKey(Integer inspectCaseReadyPunishId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") TYdzfInspectCaseReadyPunish record, @Param("example") TYdzfInspectCaseReadyPunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByExample(@Param("record") TYdzfInspectCaseReadyPunish record, @Param("example") TYdzfInspectCaseReadyPunishExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(TYdzfInspectCaseReadyPunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByPrimaryKey(TYdzfInspectCaseReadyPunish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_ready_punish
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    void insertBatch(List<TYdzfInspectCaseReadyPunish> recordLst);
}