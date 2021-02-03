package com.plan.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ming
 * @since 2021-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="ProjectLibrary对象", description="")
public class ProjectLibrary implements Serializable {

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

    @ApiModelProperty(value = "项目类别")
    @TableField("XMLB")
    private String xmlb;

    @ApiModelProperty(value = "投资计划类型")
    @TableField("TZJKXMLX")
    private String tzjkxmlx;

    @ApiModelProperty(value = "项目优选分值（*）")
    @TableField("XMYXFZ")
    private Float xmyxfz;

    @ApiModelProperty(value = "建设开始年限")
    @TableField("JSKSNX")
    private Date jsksnx;

    @ApiModelProperty(value = "结束年限")
    @TableField("JSNX")
    private Date jsnx;

    @ApiModelProperty(value = "基准年")
    @TableField("JZN")
    private Date jzn;

    @ApiModelProperty(value = "总投资估算（万元）")
    @TableField("ZTZGS")
    private Float ztzgs;

    @ApiModelProperty(value = "基准年之前投资")
    @TableField("JZNZQTZ")
    private Float jznzqtz;

    @ApiModelProperty(value = "规划年投资")
    @TableField("GHNTZ")
    private Float ghntz;

    @ApiModelProperty(value = "投资估算（万元）")
    @TableField("TZGS")
    private Float tzgs;

    @ApiModelProperty(value = "中压投资估算（万元）")
    @TableField("ZYTZGS")
    private Float zytzgs;

    @ApiModelProperty(value = "中压投资电缆规格型号")
    @TableField("ZYTZDLGG")
    private String zytzdlgg;

    @ApiModelProperty(value = "中压投资电缆长度")
    @TableField("ZYTZDLCD")
    private Float zytzdlcd;

    @ApiModelProperty(value = "中压投资架空线规格型号")
    @TableField("ZYTZJKXGG")
    private String zytzjkxgg;

    @ApiModelProperty(value = "中压投资架空线长度")
    @TableField("ZYTZJKXCD")
    private Float zytzjkxcd;

    @ApiModelProperty(value = "中压投资线路长度")
    @TableField("ZYTZXLCD")
    private Float zytzxlcd;

    @ApiModelProperty(value = "中压户内非自动化开关柜（面）")
    @TableField("ZYHNFZDHKGG")
    private Integer zyhnfzdhkgg;

    @ApiModelProperty(value = "中压户内非自动化电缆分支箱（面）")
    @TableField("ZYFZDHDLFZX")
    private Integer zyfzdhdlfzx;

    @ApiModelProperty(value = "中压非自动化柱上开关（台）")
    @TableField("ZYFZDHZSKG")
    private Integer zyfzdhzskg;

    @ApiModelProperty(value = "中压电缆沟（米）")
    @TableField("ZYDLG")
    private Float zydlg;

    @ApiModelProperty(value = "中压开关站（座）")
    @TableField("ZYKGZ")
    private Integer zykgz;

    @ApiModelProperty(value = "低压投资估算（万元）")
    @TableField("DYTZGS")
    private Float dytzgs;

    @ApiModelProperty(value = "低压投资配变数量（台）")
    @TableField("DYTZPBSL")
    private Integer dytzpbsl;

    @ApiModelProperty(value = "低压投资配变容量（千伏安）")
    @TableField("DYTZPBRL")
    private Integer dytzpbrl;

    @ApiModelProperty(value = "低压台区（个）")
    @TableField("DYTQ")
    private Integer dytq;

    @ApiModelProperty(value = "低压线（千米）")
    @TableField("DYX")
    private Float dyx;

    @ApiModelProperty(value = "低压开关柜（面）")
    @TableField("DYKGG")
    private Integer dykgg;

    @ApiModelProperty(value = "低压无功补偿（千乏）")
    @TableField("DYWGBC")
    private Integer dywgbc;

    @ApiModelProperty(value = "低压室内配电站（座）")
    @TableField("DYSNPDZ")
    private Integer dysnpdz;

    @ApiModelProperty(value = "配电自动化投资估算（万元）")
    @TableField("PDZDHTZGS")
    private Float pdzdhtzgs;

    @ApiModelProperty(value = "中压户内三遥自动化开关柜（面）")
    @TableField("ZYHNSYZDHKGG")
    private Integer zyhnsyzdhkgg;

    @ApiModelProperty(value = "中压户内三遥自动化柱上开关面）")
    @TableField("ZYHNSYZDHZSKG")
    private Integer zyhnsyzdhzskg;

    @ApiModelProperty(value = "中压三遥自动化电缆分支箱（座）")
    @TableField("ZYSYZDHDLFZX")
    private Integer zysyzdhdlfzx;

    @ApiModelProperty(value = "中压自动化终端——三遥（套）")
    @TableField("ZYZDHZDSY")
    private Integer zyzdhzdsy;

    @ApiModelProperty(value = "中压自动化终端——故障指示器（套）")
    @TableField("ZYGZZSQ")
    private Integer zygzzsq;

    @ApiModelProperty(value = "智能电表及低压集抄投资估算（万元）")
    @TableField("ZNDBJDYJCTZGS")
    private Float zndbjdyjctzgs;

    @ApiModelProperty(value = "智能电表投资估算（万元）")
    @TableField("ZNDBTZGS")
    private Float zndbtzgs;

    @ApiModelProperty(value = "智能电表普通单相电子表（套）")
    @TableField("PTDXDZB")
    private Integer ptdxdzb;

    @ApiModelProperty(value = "智能电表单相费控电子表（套）")
    @TableField("DXFKDZB")
    private Integer dxfkdzb;

    @ApiModelProperty(value = "智能电表普通三相电子表（套）")
    @TableField("PTSXDZB")
    private Integer ptsxdzb;

    @ApiModelProperty(value = "智能电表三相费控电子表（套）")
    @TableField("SXFKDZB")
    private Integer sxfkdzb;

    @ApiModelProperty(value = "低压集抄投资估算（万元）")
    @TableField("DYJCTZGS")
    private Float dyjctzgs;

    @ApiModelProperty(value = "低压集抄I型集中器（个）")
    @TableField("IXJZB")
    private Integer ixjzb;

    @ApiModelProperty(value = "低压集抄II型集中器（个）")
    @TableField("IIXJZB")
    private Integer iixjzb;

    @ApiModelProperty(value = "低压集抄I型采集器（个）")
    @TableField("IXCJB")
    private Integer ixcjb;

    @ApiModelProperty(value = "低压集抄II型采集器（个）")
    @TableField("IIXCJB")
    private Integer iixcjb;

    @ApiModelProperty(value = "配变监测计量终端投资估算（万元）")
    @TableField("PBJCJLZDTZGS")
    private Float pbjcjlzdtzgs;

    @ApiModelProperty(value = "配变监测计量终端（个）")
    @TableField("PBJCJLZD")
    private Integer pbjcjlzd;

    @ApiModelProperty(value = "配电网通信投资估算（万元）")
    @TableField("PDWTXTZGS")
    private Float pdwtxtzgs;

    @ApiModelProperty(value = "综合网管（套）")
    @TableField("ZHWG")
    private Integer zhwg;

    @ApiModelProperty(value = "配电网光缆（千米）")
    @TableField("PDWGL")
    private Float pdwgl;

    @ApiModelProperty(value = "光缆管道长度（千米）")
    @TableField("GLGDCD")
    private Float glgdcd;

    @ApiModelProperty(value = "汇聚交换机（台）")
    @TableField("HJJHJ")
    private Integer hjjhj;

    @ApiModelProperty(value = "工业交换机（台）")
    @TableField("GYJHJ")
    private Integer gyjhj;

    @ApiModelProperty(value = "EPON（台）")
    @TableField("EPON")
    private Integer epon;

    @ApiModelProperty(value = "公网无线终端（个）")
    @TableField("GWWXZD")
    private Integer gwwxzd;

    @ApiModelProperty(value = "无线基站（套）")
    @TableField("WXJZ")
    private Integer wxjz;

    @ApiModelProperty(value = "专网无线终端（个）")
    @TableField("ZXWXZD")
    private Integer zxwxzd;

    @ApiModelProperty(value = "其他通讯终端（个）")
    @TableField("QTTXZD")
    private Integer qttxzd;

    @ApiModelProperty(value = "新增线路回数（个）")
    @TableField("XZXLHS")
    private Integer xzxlhs;

    @ApiModelProperty(value = "新增台区数（个）")
    @TableField("XZTQS")
    private Integer xztqs;

    @ApiModelProperty(value = "项目优选类别")
    @TableField("XMYXLB")
    private String xmyxlb;

    @ApiModelProperty(value = "项目目的")
    @TableField("XMMD")
    private String xmmd;

    @ApiModelProperty(value = "投资必要性")
    @TableField("TZBYX")
    private String tzbyx;

    @ApiModelProperty(value = "是否配电自动化、计量自动化、配电网通信同步或专项项目")
    @TableField("PDJLZDH_PDWTXTB_ZXXM")
    private String pdjlzdhPdwtxtbZxxm;

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

    @ApiModelProperty(value = "建设必要性")
    @TableField("JSBYX")
    private String jsbyx;

    @ApiModelProperty(value = "建设方案")
    @TableField("JSFA")
    private String jsfa;

    @ApiModelProperty(value = "预计实施效果")
    @TableField("YJSSXG")
    private String yjssxg;

    @ApiModelProperty(value = "对应解决问题编码")
    @TableField("DYJJWTBM")
    private String dyjjwtbm;

    @ApiModelProperty(value = "规划投产时间（年）")
    @TableField("GUTCSJ")
    private Date gutcsj;

    @ApiModelProperty(value = "建议纳入前期计划年份")
    @TableField("JYNRQQJHNF")
    private Date jynrqqjhnf;

    @ApiModelProperty(value = "是否已纳入投资计划")
    @TableField("SFYNRTZJH")
    private String sfynrtzjh;

    @ApiModelProperty(value = "首次纳入投资计划年份")
    @TableField("SFNRTZJHNF")
    private Date sfnrtzjhnf;

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
