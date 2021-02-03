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
 * 1-4
 * </p>
 *
 * @author ming
 * @since 2021-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="LineProblem对象", description="1-4")
public class LineProblem implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属地市")
    @TableField("SSDS")
    private String ssds;

    @ApiModelProperty(value = "所属区县")
    @TableField("SSQX")
    private String ssqx;

    @ApiModelProperty(value = "所属供电局")
    @TableField("SSGDJ")
    private String ssgdj;

    @ApiModelProperty(value = "变电站名称")
    @TableField("BDZMC")
    private String bdzmc;

    @ApiModelProperty(value = "变电站母线编号")
    @TableField("BDZMXBH")
    private String bdzmxbh;

    @ApiModelProperty(value = "馈线ID")
    @TableField("KX_ID")
    private String kxId;

    @ApiModelProperty(value = "馈线名称")
    @TableField("KXMC")
    private String kxmc;

    @ApiModelProperty(value = "电压等级(kV)")
    @TableField("DYDJ")
    private Integer dydj;

    @ApiModelProperty(value = "电网类型")
    @TableField("DWLX")
    private String dwlx;

    @ApiModelProperty(value = "供电分区分类")
    @TableField("GDFQFL")
    private String gdfqfl;

    @ApiModelProperty(value = "地区特征")
    @TableField("DQTZ")
    private String dqtz;

    @ApiModelProperty(value = "线路性质")
    @TableField("XLXZ")
    private String xlxz;

    @ApiModelProperty(value = "线路类别")
    @TableField("XLLB")
    private String xllb;

    @ApiModelProperty(value = "主干线电缆型号")
    @TableField("ZGDLXH")
    private String zgdlxh;

    @ApiModelProperty(value = "主干线电缆长度(km)")
    @TableField("ZGDLCD")
    private Float zgdlcd;

    @ApiModelProperty(value = "主干线裸导体型号")
    @TableField("ZGLDXXH")
    private String zgldxxh;

    @ApiModelProperty(value = "主干线裸导体长度(km)")
    @TableField("ZGLDXCD")
    private Float zgldxcd;

    @ApiModelProperty(value = "主干线绝缘架空型号")
    @TableField("ZGJYJKXH")
    private String zgjyjkxh;

    @ApiModelProperty(value = "主干线绝缘架空长度(km)")
    @TableField("ZGJYJKXCD")
    private Float zgjyjkxcd;

    @ApiModelProperty(value = "架空线长度(km)")
    @TableField("JKXCD")
    private Float jkxcd;

    @ApiModelProperty(value = "主干总长度(km)")
    @TableField("ZGZCD")
    private Float zgzcd;

    @ApiModelProperty(value = "电缆总长度(km)")
    @TableField("DLZCD")
    private Float dlzcd;

    @ApiModelProperty(value = "架空绝缘线总长度(km)")
    @TableField("JKJYXZCD")
    private Float jkjyxzcd;

    @ApiModelProperty(value = "架空裸导线总长度(km)")
    @TableField("JKLDXZCD")
    private Float jkldxzcd;

    @ApiModelProperty(value = "线路总长度(km)")
    @TableField("XLZCD")
    private Float xlzcd;

    @ApiModelProperty(value = "供电半径(km)")
    @TableField("GDBJ")
    private Float gdbj;

    @ApiModelProperty(value = "接线模式")
    @TableField("JXMS")
    private String jxms;

    @ApiModelProperty(value = "安全电流(A)")
    @TableField("AQDL")
    private Integer aqdl;

    @ApiModelProperty(value = "主干线自动化分段数")
    @TableField("ZGXZDHFDS")
    private Integer zgxzdhfds;

    @ApiModelProperty(value = "无功补偿容量(kVar)")
    @TableField("WGBCRL")
    private Integer wgbcrl;

    @ApiModelProperty(value = "供电负荷性质")
    @TableField("GDFHXZ")
    private String gdfhxz;

    @ApiModelProperty(value = "线路装接公变台数")
    @TableField("XLZJGBTS")
    private Integer xlzjgbts;

    @ApiModelProperty(value = "线路装接公变容量（kVA）")
    @TableField("XLZJGBRL")
    private Integer xlzjgbrl;

    @ApiModelProperty(value = "线路装接专变台数")
    @TableField("XLZJZBTS")
    private Integer xlzjzbts;

    @ApiModelProperty(value = "线路装接专变容量（kVA）")
    @TableField("XLZJZBRL")
    private Integer xlzjzbrl;

    @ApiModelProperty(value = "线路装接配变总数")
    @TableField("XLZJPBZS")
    private Integer xlzjpbzs;

    @ApiModelProperty(value = "线路装接配变容量（kVA）")
    @TableField("XLZJRL")
    private Integer xlzjrl;

    @ApiModelProperty(value = "线路总用户数（个）")
    @TableField("XLZYHS")
    private Integer xlzyhs;

    @ApiModelProperty(value = "低压用户数（个）")
    @TableField("DYYHS")
    private Integer dyyhs;

    @ApiModelProperty(value = "开关柜（面）")
    @TableField("KGG")
    private Integer kgg;

    @ApiModelProperty(value = "开关柜三遥（台）")
    @TableField("KGGSY")
    private Integer kggsy;

    @ApiModelProperty(value = "开关柜二遥（台）")
    @TableField("KGGEY")
    private Integer kggey;

    @ApiModelProperty(value = "柱上开关（台）")
    @TableField("ZSKG")
    private Integer zskg;

    @ApiModelProperty(value = "柱上开关三遥（台）")
    @TableField("ZSKGSY")
    private Integer zskgsy;

    @ApiModelProperty(value = "柱上开关二遥（台）")
    @TableField("ZSKGEY")
    private Integer zskgey;

    @ApiModelProperty(value = "户外开关站（座）")
    @TableField("HWKGZ")
    private Integer hwkgz;

    @ApiModelProperty(value = "户内开关站（座）")
    @TableField("HNKGZ")
    private Integer hnkgz;

    @ApiModelProperty(value = "三遥终端（套）")
    @TableField("SYZD")
    private Integer syzd;

    @ApiModelProperty(value = "二遥终端（套）")
    @TableField("EYZD")
    private Integer eyzd;

    @ApiModelProperty(value = "带通信功能的故障指示器（套）")
    @TableField("DTXGNDGZZSQ")
    private Integer dtxgndgzzsq;

    @ApiModelProperty(value = "投运日期")
    @TableField("TYRQ")
    private String tyrq;

    @ApiModelProperty(value = "联络线路1-变电站名称")
    @TableField("LLXL1_BDZMC")
    private String llxl1Bdzmc;

    @ApiModelProperty(value = "联络线路1-线路名称")
    @TableField("LLXL1_XLMC")
    private String llxl1Xlmc;

    @ApiModelProperty(value = "联络线路1-高峰负荷时刻电流(A)")
    @TableField("LLXL1_GFFHSKDL")
    private String llxl1Gffhskdl;

    @ApiModelProperty(value = "联络线路2-变电站名称")
    @TableField("LLXL2_BDZMC")
    private String llxl2Bdzmc;

    @ApiModelProperty(value = "联络线路2-线路名称")
    @TableField("LLXL2_XLMC")
    private String llxl2Xlmc;

    @ApiModelProperty(value = "联络线路2-高峰负荷时刻电流(A)")
    @TableField("LLXL2_GFFHSKDL")
    private String llxl2Gffhskdl;

    @ApiModelProperty(value = "联络线路3-变电站名称")
    @TableField("LLXL3_BDZMC")
    private String llxl3Bdzmc;

    @ApiModelProperty(value = "联络线路3-线路名称")
    @TableField("LLXL3_XLMC")
    private String llxl3Xlmc;

    @ApiModelProperty(value = "联络线路3-高峰负荷时刻电流(A)")
    @TableField("LLXL3_GFFHSKDL")
    private String llxl3Gffhskdl;

    @ApiModelProperty(value = "联络线路4-变电站名称")
    @TableField("LLXL4_BDZMC")
    private String llxl4Bdzmc;

    @ApiModelProperty(value = "联络线路4-线路名称")
    @TableField("LLXL4_XLMC")
    private String llxl4Xlmc;

    @ApiModelProperty(value = "联络线路4-高峰负荷时刻电流(A)")
    @TableField("LLXL4_GFFHSKDL")
    private String llxl4Gffhskdl;

    @ApiModelProperty(value = "年最大电流(A)")
    @TableField("NZDDL")
    private Integer nzddl;

    @ApiModelProperty(value = "最大电流出现时间")
    @TableField("ZDDLCXSJ")
    private String zddlcxsj;

    @ApiModelProperty(value = "高峰负荷时刻电流(A)")
    @TableField("GFFHSKDL")
    private Integer gffhskdl;

    @ApiModelProperty(value = "年最高负载率（%）")
    @TableField("NZGFZL")
    private Float nzgfzl;

    @ApiModelProperty(value = "上一年度最高负载率（%）")
    @TableField("SYNDZGFZL")
    private Float syndzgfzl;

    @ApiModelProperty(value = "上一年度高峰负荷时刻电流(A)")
    @TableField("SYNDGFFHSKDL")
    private Integer syndgffhskdl;

    @ApiModelProperty(value = "平均电流(A)")
    @TableField("PJDL")
    private Float pjdl;

    @ApiModelProperty(value = "平均负载率（%）")
    @TableField("PJFZL")
    private Float pjfzl;

    @ApiModelProperty(value = "线路供电负荷性质")
    @TableField("XLGDFHXZ")
    private String xlgdfhxz;

    @ApiModelProperty(value = "年售电量(WkWh)")
    @TableField("NSDL")
    private Float nsdl;

    @ApiModelProperty(value = "年供电量(WkWh)")
    @TableField("NGDL")
    private Float ngdl;

    @ApiModelProperty(value = "线损率（%）")
    @TableField("XSL")
    private Float xsl;

    @ApiModelProperty(value = "上一年度线路故障次数")
    @TableField("SYNDXLGZCS")
    private Integer syndxlgzcs;

    @ApiModelProperty(value = "是否重载")
    @TableField("SFZZ")
    private String sfzz;

    @ApiModelProperty(value = "是否过载")
    @TableField("SFGZ")
    private String sfgz;

    @ApiModelProperty(value = "过载累计持续时间（h）")
    @TableField("GZLJCXSJ")
    private Float gzljcxsj;

    @ApiModelProperty(value = "过载次数")
    @TableField("GZCS")
    private Integer gzcs;

    @ApiModelProperty(value = "重载累计持续时间（h）")
    @TableField("ZZLJCXSJ")
    private Float zzljcxsj;

    @ApiModelProperty(value = "重载次数")
    @TableField("ZZCS")
    private Integer zzcs;

    @ApiModelProperty(value = "重过载原因分析")
    @TableField("ZGZYYFX")
    private String zgzyyfx;

    @ApiModelProperty(value = "线路最大用户容量(kVA)")
    @TableField("XLZDYHRL")
    private Integer xlzdyhrl;

    @ApiModelProperty(value = "是否预计下一年重过载")
    @TableField("SFYJXYNZGZ")
    private String sfyjxynzgz;

    @ApiModelProperty(value = "是否轻载")
    @TableField("SFQZ")
    private String sfqz;

    @ApiModelProperty(value = "供电半径是否过长")
    @TableField("GDBJSFGC")
    private String gdbjsfgc;

    @ApiModelProperty(value = "是否站间联络线路")
    @TableField("SFZJLLXL")
    private String sfzjllxl;

    @ApiModelProperty(value = "是否站内联络线路")
    @TableField("SFZNLLXL")
    private String sfznllxl;

    @ApiModelProperty(value = "是否同母线联络线路")
    @TableField("SFTMXLLXL")
    private String sftmxllxl;

    @ApiModelProperty(value = "是否同杆架设线路联络")
    @TableField("SFTGJSXLLL")
    private String sftgjsxlll;

    @ApiModelProperty(value = "是否首端联络")
    @TableField("SFSDLL")
    private String sfsdll;

    @ApiModelProperty(value = "是否主干线挂灯笼")
    @TableField("SFZGXGDL")
    private String sfzgxgdl;

    @ApiModelProperty(value = "是否联络点不合理")
    @TableField("SFLLDBHL")
    private String sflldbhl;

    @ApiModelProperty(value = "是否分段不合理")
    @TableField("SFFDBHL")
    private String sffdbhl;

    @ApiModelProperty(value = "是否单辐射（不符合导则要求）")
    @TableField("SFDFS")
    private String sfdfs;

    @ApiModelProperty(value = "是否非典型接线")
    @TableField("SFFDXJX")
    private String sffdxjx;

    @ApiModelProperty(value = "是否不可转供")
    @TableField("SFBKZG")
    private String sfbkzg;

    @ApiModelProperty(value = "是否装接容量偏高（＞12MVA）")
    @TableField("SFZJRLPG")
    private String sfzjrlpg;

    @ApiModelProperty(value = "是否装接容量偏低（＜2MVA）")
    @TableField("SFZJRLPD")
    private String sfzjrlpd;

    @ApiModelProperty(value = "是否导线卡脖子")
    @TableField("SFDXQBZ")
    private String sfdxqbz;

    @ApiModelProperty(value = "卡脖子线路型号")
    @TableField("QBZXLXH")
    private String qbzxlxh;

    @ApiModelProperty(value = "卡脖子线路区段")
    @TableField("QBZXLQD")
    private String qbzxlqd;

    @ApiModelProperty(value = "卡脖子线路截面积")
    @TableField("QBZXLJMJ")
    private Float qbzxljmj;

    @ApiModelProperty(value = "卡脖子线路长度（km）")
    @TableField("QBZXLCD")
    private Float qbzxlcd;

    @ApiModelProperty(value = "是否存在大分支")
    @TableField("SFCZDFZ")
    private String sfczdfz;

    @ApiModelProperty(value = "大分支线路名称")
    @TableField("DFZXLMC")
    private String dfzxlmc;

    @ApiModelProperty(value = "大分支线中压用户数（户）")
    @TableField("DFZXZYYHS")
    private Integer dfzxzyyhs;

    @ApiModelProperty(value = "大分支线低压客户数（户）")
    @TableField("DFZXDYKHS")
    private Integer dfzxdykhs;

    @ApiModelProperty(value = "是否主干线不满足自动化配置要求")
    @TableField("SFZGXBMZZDHPZYQ")
    private String sfzgxbmzzdhpzyq;

    @ApiModelProperty(value = "是否重要分支线不满足自动化配置要求")
    @TableField("SFZYFZBMZZDHPZYQ")
    private String sfzyfzbmzzdhpzyq;

    @ApiModelProperty(value = "末端电压是否偏低")
    @TableField("MDDYSFPG")
    private String mddysfpg;

    @ApiModelProperty(value = "末端电压是否偏高")
    @TableField("MDDYSFPD")
    private String mddysfpd;

    @ApiModelProperty(value = "末端电压(kV)")
    @TableField("MDDY")
    private Float mddy;

    @ApiModelProperty(value = "原因分析")
    @TableField("YYFX")
    private String yyfx;

    @ApiModelProperty(value = "是否存在抗风能力不足")
    @TableField("SFCZKFNLBZ")
    private String sfczkfnlbz;

    @ApiModelProperty(value = "是否存在抗风能力不足")
    @TableField("FLNL")
    private String flnl;

    @ApiModelProperty(value = "是否存在用户故障出门")
    @TableField("YHGZ")
    private String yhgz;

    @ApiModelProperty(value = "是否馈线存在安全隐患")
    @TableField("SFKXCZACYH")
    private String sfkxczacyh;

    @ApiModelProperty(value = "是否馈线残旧")
    @TableField("SFKXCJ")
    private String sfkxcj;

    @ApiModelProperty(value = "是否报装受限")
    @TableField("SFBZSX")
    private String sfbzsx;

    @ApiModelProperty(value = "是否线损超过10%")
    @TableField("SFXSCG")
    private String sfxscg;

    @ApiModelProperty(value = "是否功率因数不合格")
    @TableField("SFGLYSBHG")
    private String sfglysbhg;

    @ApiModelProperty(value = "是否实现馈线自动化")
    @TableField("SFSXKXZDH")
    private String sfsxkxzdh;

    @ApiModelProperty(value = "是否实现配电自动化情况")
    @TableField("SFSXPDZDHQK")
    private String sfsxpdzdhqk;

    @ApiModelProperty(value = "运行状态")
    @TableField("YXZT")
    private String yxzt;

    @ApiModelProperty(value = "所属环境情况")
    @TableField("SSHJQK")
    private String sshjqk;

    @ApiModelProperty(value = "是否备用线路")
    @TableField("SFBYXL")
    private String sfbyxl;

    @ApiModelProperty(value = "是否单一用户线路")
    @TableField("SFDYYHXL")
    private String sfdyyhxl;

    @ApiModelProperty(value = "是否属于贫困地区")
    @TableField("SFSYPKDQ")
    private String sfsypkdq;

    @ApiModelProperty(value = "是否属于中心村")
    @TableField("SFSYZXC")
    private String sfsyzxc;

    @ApiModelProperty(value = "是否属于国有林场供电线路")
    @TableField("SFSYGYLCGDXL")
    private String sfsygylcgdxl;

    @ApiModelProperty(value = "拟定本线路存在问题解决方案")
    @TableField("NDBXLCZWTJJFA")
    private String ndbxlczwtjjfa;

    @ApiModelProperty(value = "备注")
    @TableField("BZ")
    private String bz;

    @ApiModelProperty(value = "系统ID主键")
    @TableField("XT_ID_ZJ")
    private String xtIdZj;

    @ApiModelProperty(value = "系统机构ID")
    @TableField("XTJG_ID")
    private Integer xtjgId;


}
