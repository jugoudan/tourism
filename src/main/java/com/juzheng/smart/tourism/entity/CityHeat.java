package com.juzheng.smart.tourism.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author juzheng
 * @since 2019-05-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
public class CityHeat extends Model<CityHeat> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String heatId;

    private String heatCount;

    private String cityId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
