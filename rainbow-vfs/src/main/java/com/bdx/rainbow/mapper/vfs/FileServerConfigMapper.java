package com.bdx.rainbow.mapper.vfs;

import com.bdx.rainbow.entity.vfs.FileServerConfig;
import com.bdx.rainbow.entity.vfs.FileServerConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileServerConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int countByExample(FileServerConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int deleteByExample(FileServerConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int deleteByPrimaryKey(String serverName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int insert(FileServerConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int insertSelective(FileServerConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    List<FileServerConfig> selectByExample(FileServerConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    FileServerConfig selectByPrimaryKey(String serverName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") FileServerConfig record, @Param("example") FileServerConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int updateByExample(@Param("record") FileServerConfig record, @Param("example") FileServerConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int updateByPrimaryKeySelective(FileServerConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    int updateByPrimaryKey(FileServerConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table file_server_config
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    void insertBatch(List<FileServerConfig> recordLst);
}