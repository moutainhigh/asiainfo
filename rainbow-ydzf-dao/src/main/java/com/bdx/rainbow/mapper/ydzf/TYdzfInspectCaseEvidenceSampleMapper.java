package com.bdx.rainbow.mapper.ydzf;

import com.bdx.rainbow.entity.ydzf.TYdzfInspectCaseEvidenceSample;
import com.bdx.rainbow.entity.ydzf.TYdzfInspectCaseEvidenceSampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TYdzfInspectCaseEvidenceSampleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int countByExample(TYdzfInspectCaseEvidenceSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int deleteByExample(TYdzfInspectCaseEvidenceSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int deleteByPrimaryKey(Integer inspectCaseEvidenceSampleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int insert(TYdzfInspectCaseEvidenceSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int insertSelective(TYdzfInspectCaseEvidenceSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    List<TYdzfInspectCaseEvidenceSample> selectByExample(TYdzfInspectCaseEvidenceSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    TYdzfInspectCaseEvidenceSample selectByPrimaryKey(Integer inspectCaseEvidenceSampleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByExampleSelective(@Param("record") TYdzfInspectCaseEvidenceSample record, @Param("example") TYdzfInspectCaseEvidenceSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByExample(@Param("record") TYdzfInspectCaseEvidenceSample record, @Param("example") TYdzfInspectCaseEvidenceSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByPrimaryKeySelective(TYdzfInspectCaseEvidenceSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    int updateByPrimaryKey(TYdzfInspectCaseEvidenceSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ydzf_inspect_case_evidence_sample
     *
     * @mbggenerated Mon Apr 11 23:56:20 GMT+08:00 2016
     */
    void insertBatch(List<TYdzfInspectCaseEvidenceSample> recordLst);
}