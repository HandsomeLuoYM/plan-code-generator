package com.plan.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 附表1-10.2 中低压配电网生产修理规划项目库
 * </p>
 *
 * @author ming
 * @since 2021-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProductionRepairProjectLibrary对象", description="附表1-10.2 中低压配电网生产修理规划项目库")
public class ProductionRepairProjectLibrary implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "序号")
      @TableId(value = "XH", type = IdType.AUTO)
    private Integer xh;

    @ApiModelProperty(value = "项目名称")
    @TableField("XMMC")
    private String xmmc;

    @ApiModelProperty(value = "子项目编码")
    @TableField("ZXMBM")
    private String zxmbm;

    @ApiModelProperty(value = "原项目编码 ")
    @TableField("YXMBM")
    private String yxmbm;

    @ApiModelProperty(value = "项目群名称")
    @TableField("XMQMC")
    private String xmqmc;

    @ApiModelProperty(value = "项目群编码")
    @TableField("XMQBM")
    private String xmqbm;

    @ApiModelProperty(value = "关联变电站")
    @TableField("GLBDZ")
    private String glbdz;

    @ApiModelProperty(value = "关联变电站编码")
    @TableField("GLBDZBM")
    private Long glbdzbm;

    @ApiModelProperty(value = "关联馈线")
    @TableField("GLKX")
    private String glkx;

    @ApiModelProperty(value = "关联馈线编码")
    @TableField("GLKXBM")
    private Long glkxbm;

    @ApiModelProperty(value = "关联台区（配变）")
    @TableField("GLTQ")
    private String gltq;

    @ApiModelProperty(value = "关联台区（配变）编码")
    @TableField("GLTQBM")
    private Long gltqbm;

    @ApiModelProperty(value = "所属省级分子公司")
    @TableField("SSSJFZGS")
    private String sssjfzgs;

    @ApiModelProperty(value = "所属地市")
    @TableField("SSDS")
    private String ssds;

    @ApiModelProperty(value = "所属区县")
    @TableField("SSQX")
    private String ssqx;

    @ApiModelProperty(value = "所属供电所")
    @TableField("SSGDS")
    private String ssgds;

    @ApiModelProperty(value = "供电分区")
    @TableField("GDFQ")
    private String gdfq;

    @ApiModelProperty(value = "城网/农网")
    @TableField("CW_NW")
    private String cwNw;

    @ApiModelProperty(value = "电压等级")
    @TableField("DYDJ")
    private String dydj;

    @ApiModelProperty(value = "修理属性")
    @TableField("XLSX")
    private String xlsx;

    @ApiModelProperty(value = "项目类别")
    @TableField("XMLB")
    private String xmlb;

    @ApiModelProperty(value = "项目属性")
    @TableField("XMSX")
    private String xmsx;

    @ApiModelProperty(value = "项目优选分值（*）")
    @TableField("XMYXFZ")
    private Float xmyxfz;

    @ApiModelProperty(value = "建设开始年月")
    @TableField("JSKSNY")
    private String jsksny;

    @ApiModelProperty(value = "建设结束年月")
    @TableField("JSJSNY")
    private String jsjsny;

    @ApiModelProperty(value = "基准年")
    @TableField("JZN")
    private String jzn;

    @ApiModelProperty(value = "总投资估算（万元）")
    @TableField("ZTZGS")
    private Float ztzgs;

    @ApiModelProperty(value = "基准年之前投资")
    @TableField("JZNZQTZ")
    private Float jznzqtz;

    @ApiModelProperty(value = "规划年投资")
    @TableField("GHNTZ")
    private Float ghntz;

    @ApiModelProperty(value = "是否县级子公司")
    @TableField("SFXJZGS")
    private String sfxjzgs;

    @ApiModelProperty(value = "资金来源")
    @TableField("ZJLY")
    private String zjly;

    @ApiModelProperty(value = "项目优选类别")
    @TableField("XMYXLB")
    private String xmyxlb;

    @ApiModelProperty(value = "项目目的")
    @TableField("XMMD")
    private String xmmd;

    @ApiModelProperty(value = "是否改造升级重点项目")
    @TableField("SFGZSJZDXM")
    private String sfgzsjzdxm;

    @ApiModelProperty(value = "是否国有林场供电项目")
    @TableField("SFGYLCGDXM")
    private String sfgylcgdxm;

    @ApiModelProperty(value = "是否属于中心村")
    @TableField("SFSYZXC")
    private String sfsyzxc;

    @ApiModelProperty(value = "是否属于贫困地区")
    @TableField("SFSYPKDQ")
    private String sfsypkdq;

    @ApiModelProperty(value = "必要性")
    @TableField("BYX")
    private String byx;

    @ApiModelProperty(value = "重点解决问题")
    @TableField("ZDJJWT")
    private String zdjjwt;

    @ApiModelProperty(value = "项目简要内容")
    @TableField("XMJYNR")
    private String xmjynr;

    @ApiModelProperty(value = "预计实施效果")
    @TableField("YJSSXG")
    private String yjssxg;

    @ApiModelProperty(value = "对应解决问题编码")
    @TableField("DYJJWTBM")
    private String dyjjwtbm;

    @ApiModelProperty(value = "建议纳入前期计划年份")
    @TableField("JYNRQQJHNF")
    private String jynrqqjhnf;

    @ApiModelProperty(value = "是否已纳入投资计划")
    @TableField("SFYNRTZJH")
    private String sfynrtzjh;

    @ApiModelProperty(value = "首次纳入投资计划年份")
    @TableField("SFNRTZJHNF")
    private String sfnrtzjhnf;

    @ApiModelProperty(value = "是否获得可研批复")
    @TableField("SFHDKYPF")
    private String sfhdkypf;

    @ApiModelProperty(value = "可研批复日期")
    @TableField("KYPFRQ")
    private String kypfrq;

    @ApiModelProperty(value = "可研批复文号")
    @TableField("KYPFWH")
    private String kypfwh;

    @ApiModelProperty(value = "是否为高方案")
    @TableField("SFWGFA")
    private String sfwgfa;

    @ApiModelProperty(value = "是否上一版规划内项目")
    @TableField("SFSYBGHNXM")
    private String sfsybghnxm;

    @ApiModelProperty(value = "备注")
    @TableField("BZ")
    private String bz;

    @ApiModelProperty(value = "备注2")
    @TableField("BZ2")
    private String bz2;


}
