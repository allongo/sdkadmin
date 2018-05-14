package com.it7890.dao;

import com.it7890.vo.SdkAliveVo;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by mingle on 2018/5/8.
 */
public class SdkAliveMapperSqlProvider {
    public String getByParams(SdkAliveVo sdkAliveVO){
        return new SQL(){
            {
                SELECT("*");
                FROM("sdk_alive");
                if(sdkAliveVO.getStatus() != null && !"".equals(sdkAliveVO.getStatus())){
                    WHERE("status = #{status}");
                }
                ORDER_BY("id desc");
            }
        }.toString();
    }
}
