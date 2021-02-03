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
 * 1-8 公用配变现状及存在问题情况
 * </p>
 *
 * @author ming
 * @since 2021-02-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TransformerProblem对象", description="1-8 公用配变现状及存在问题情况")
public class TransformerProblem implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属地区")
    @TableField("SSDQ")
    private String ssdq;

    @ApiModelProperty(value = "所属区县")
    @TableField("SSQX")
    private String ssqx;

    @ApiModelProperty(value = "所属供电所")
    @TableField("SSGDS")
    private String ssgds;

    @ApiModelProperty(value = "变电站名称")
    @TableField("BDZMC")
    private String bdzmc;

    @ApiModelProperty(value = "馈线名称")
    @TableField("KXMC")
    private String kxmc;

    @ApiModelProperty(value = "配变ID")
    @TableField("PBID")
    private String pbid;

    @ApiModelProperty(value = "配变名称")
    @TableField("PBMC")
    private String pbmc;

    @ApiModelProperty(value = "电压等级(kV)")
    @TableField("DYDJ")
    private Integer dydj;

    @ApiModelProperty(value = "供电分区分类")
    @TableField("GDFQFL")
    private String gdfqfl;

    @ApiModelProperty(value = "所在地址")
    @TableField("SZDZ")
    private String szdz;

    @ApiModelProperty(value = "电网类型")
    @TableField("DWLX")
    private String dwlx;

    @ApiModelProperty(value = "地区特征")
    @TableField("DQTZ")
    private String dqtz;

    @ApiModelProperty(value = "公专变标志")
    @TableField("GZBBZ")
    private String gzbbz;

    @ApiModelProperty(value = "额定容量(kVA)")
    @TableField("EDRL")
    private Integer edrl;

    @ApiModelProperty(value = "配变型号")
    @TableField("PBLX")
    private String pblx;

    @ApiModelProperty(value = "干式/油浸式")
    @TableField("GSYJS")
    private String gsyjs;

    @ApiModelProperty(value = "配变型号")
    @TableField("PBXH")
    private String pbxh;

    @ApiModelProperty(value = "负荷性质")
    @TableField("FHXZ")
    private String fhxz;

    @ApiModelProperty(value = "无功补偿量(kVar)")
    @TableField("WGBCL")
    private Integer wgbcl;

    @ApiModelProperty(value = "年最大负荷")
    @TableField("NZDFH")
    private Float nzdfh;

    @ApiModelProperty(value = "年最高负载率(%)")
    @TableField("NZGFZL")
    private Float nzgfzl;

    @ApiModelProperty(value = "最大负荷发生时刻")
    @TableField("ZDFHFSSK")
    private String zdfhfssk;

    @ApiModelProperty(value = "平均负荷(kW)")
    @TableField("PJFH")
    private Float pjfh;

    @ApiModelProperty(value = "平均负载率(%)")
    @TableField("PJFZL")
    private Float pjfzl;

    @ApiModelProperty(value = "售电量（亿kWh）")
    @TableField("SDL")
    private Float sdl;

    @ApiModelProperty(value = "供电量（亿kWh）")
    @TableField("GDL")
    private Long gdl;

    @ApiModelProperty(value = "线损率(%)")
    @TableField("XSL")
    private Float xsl;

    @ApiModelProperty(value = "接入用户数（户）")
    @TableField("JRYHS")
    private Integer jryhs;

    @ApiModelProperty(value = "实现一户一表用户数（户）")
    @TableField("YHS")
    private Integer yhs;

    @ApiModelProperty(value = "接入用户总容量（kW）")
    @TableField("JRYHZRL")
    private Integer jryhzrl;

    @ApiModelProperty(value = "接入用户负荷性质")
    @TableField("JRYHFHXZ")
    private String jryhfhxz;

    @ApiModelProperty(value = "近一年净增接入容量（kW）")
    @TableField("JRRL")
    private Integer jrrl;

    @ApiModelProperty(value = "已接入最大用户报装容量（kW）")
    @TableField("ZDYHBZRL")
    private Integer zdyhbzrl;

    @ApiModelProperty(value = "低压线裸导线长度(km)")
    @TableField("DYXLDXCD")
    private Integer dyxldxcd;

    @ApiModelProperty(value = "最大负荷月供电量(KWh)")
    @TableField("ZDFHYGDL")
    private Float zdfhygdl;

    @ApiModelProperty(value = "台区出线回路数（回）")
    @TableField("TQCXHLS")
    private Integer tqcxhls;

    @ApiModelProperty(value = "台区低压主干线主要线径")
    @TableField("TQDYZGXZYLJ")
    private Integer tqdyzgxzylj;

    @ApiModelProperty(value = "低压侧额定电流（A）")
    @TableField("DYCEDDL")
    private Float dyceddl;

    @ApiModelProperty(value = "低压侧额定电压（V）")
    @TableField("DYCEDDY")
    private Integer dyceddy;

    @ApiModelProperty(value = "投运日期")
    @TableField("TYRQ")
    private String tyrq;

    @ApiModelProperty(value = "是否过载")
    @TableField("SFGZ")
    private String sfgz;

    @ApiModelProperty(value = "过载次数")
    @TableField("GZCS")
    private Integer gzcs;

    @ApiModelProperty(value = "过载累计持续时间(min)")
    @TableField("GZLJCXSJ")
    private Integer gzljcxsj;

    @ApiModelProperty(value = "是否重载")
    @TableField("SFZZ")
    private String sfzz;

    @ApiModelProperty(value = "重载次数")
    @TableField("ZZCS")
    private Integer zzcs;

    @ApiModelProperty(value = "重载累计持续时间(min)")
    @TableField("ZZLJCXSJ")
    private Integer zzljcxsj;

    @ApiModelProperty(value = "过载/重载原因分析")
    @TableField("GZZZYYFX")
    private String gzzzyyfx;

    @ApiModelProperty(value = "预计下一年是否过载")
    @TableField("XYNSFGZ")
    private String xynsfgz;

    @ApiModelProperty(value = "是否轻载")
    @TableField("SFQZ")
    private String sfqz;

    @ApiModelProperty(value = "A相")
    @TableField("AX")
    private Float ax;

    @ApiModelProperty(value = "A相")
    @TableField("BX")
    private Float bx;

    @ApiModelProperty(value = "A相")
    @TableField("CX")
    private Float cx;

    @ApiModelProperty(value = "三相电流不平衡度（%）")
    @TableField("SXDLBPHD")
    private Float sxdlbphd;

    @ApiModelProperty(value = "是否三相不平衡")
    @TableField("SFSXBPH")
    private String sfsxbph;

    @ApiModelProperty(value = "电压超限时间")
    @TableField("DYCXSJ")
    private String dycxsj;

    @ApiModelProperty(value = "首端电压最小值（V）")
    @TableField("SDDYZXZ")
    private Integer sddyzxz;

    @ApiModelProperty(value = "首端电压最大值（V）")
    @TableField("SDDYZDZ")
    private Integer sddyzdz;

    @ApiModelProperty(value = "末端电压最小值（V）")
    @TableField("MDDYZXZ")
    private Integer mddyzxz;

    @ApiModelProperty(value = "末端电压最大值（V）")
    @TableField("MDDYZDZ")
    private Integer mddyzdz;

    @ApiModelProperty(value = "末端电压是否长时间低于180V")
    @TableField("MDDYSFCSJDY180")
    private String mddysfcsjdy180;

    @ApiModelProperty(value = "末端电压是否长时间处于180-199V之间")
    @TableField("MDDYSFCSJCY180_199")
    private String mddysfcsjcy180199;

    @ApiModelProperty(value = "末端电压是否长时间高于235V")
    @TableField("MDDYSFCSJGY235")
    private String mddysfcsjgy235;

    @ApiModelProperty(value = "是否存在台区电压偏高")
    @TableField("SFCZTQDYPG")
    private String sfcztqdypg;

    @ApiModelProperty(value = "是否存在台区电压偏低")
    @TableField("SFCZTQDYPD")
    private String sfcztqdypd;

    @ApiModelProperty(value = "台区电压偏低主要原因")
    @TableField("TQDYPDZYYY")
    private String tqdypdzyyy;

    @ApiModelProperty(value = "是否存在残旧设备或线路")
    @TableField("SFCZCJSBHXL")
    private String sfczcjsbhxl;

    @ApiModelProperty(value = "残旧设备或线路情况")
    @TableField("CJSBHXLQK")
    private String cjsbhxlqk;

    @ApiModelProperty(value = "残旧低压线路长度(m)")
    @TableField("CJDYXLCD")
    private Integer cjdyxlcd;

    @ApiModelProperty(value = "残旧低压设备数量(台)")
    @TableField("CJDYSBSL")
    private Integer cjdysbsl;

    @ApiModelProperty(value = "是否存在安全隐患")
    @TableField("SFCZAQYH")
    private String sfczaqyh;

    @ApiModelProperty(value = "安全隐患类型")
    @TableField("AQYHLX")
    private String aqyhlx;

    @ApiModelProperty(value = "隐患位置及情况")
    @TableField("YHWZJQK")
    private String yhwzjqk;

    @ApiModelProperty(value = "安全隐患低压线路长度(m)")
    @TableField("AQYHDYXLCD")
    private Integer aqyhdyxlcd;

    @ApiModelProperty(value = "安全隐患低压设备数量(台)")
    @TableField("AQYHDYSBSL")
    private Integer aqyhdysbsl;

    @ApiModelProperty(value = "供电半径(m)")
    @TableField("GDBJ")
    private Integer gdbj;

    @ApiModelProperty(value = "是否供电半径过大")
    @TableField("SFGDBJGD")
    private String sfgdbjgd;

    @ApiModelProperty(value = "低电压投诉次数")
    @TableField("DDYTSCS")
    private Integer ddytscs;

    @ApiModelProperty(value = "是否线损超过15%")
    @TableField("SFXSCG15")
    private String sfxscg15;

    @ApiModelProperty(value = "是否报装受限")
    @TableField("SFBZSX")
    private String sfbzsx;

    @ApiModelProperty(value = "是否安装配变监测终端")
    @TableField("SFAZPBJCZD")
    private String sfazpbjczd;

    @ApiModelProperty(value = "是否存在一变多村")
    @TableField("SFCZYBDC")
    private String sfczybdc;

    @ApiModelProperty(value = "是否高损配变")
    @TableField("SFGSPB")
    private String sfgspb;

    @ApiModelProperty(value = "总电表数（块）")
    @TableField("ZDBS")
    private Integer zdbs;

    @ApiModelProperty(value = "智能电表数（块）")
    @TableField("ZNDBS")
    private Integer zndbs;

    @ApiModelProperty(value = "空字段")
    @TableField("KZD")
    private Integer kzd;

    @ApiModelProperty(value = "智能电表覆盖率(%)")
    @TableField("ZNDBFGL")
    private Integer zndbfgl;

    @ApiModelProperty(value = "是否智能电表未全覆盖")
    @TableField("SFZNDBWQFG")
    private String sfzndbwqfg;

    @ApiModelProperty(value = "已实现低压集抄的用户数（户）")
    @TableField("YSXDYJCYHS")
    private Integer ysxdyjcyhs;

    @ApiModelProperty(value = "低压集抄覆盖率(%)")
    @TableField("DYJCFGL")
    private Integer dyjcfgl;

    @ApiModelProperty(value = "是否低压集抄未全覆盖")
    @TableField("SFDYJCWQFG")
    private String sfdyjcwqfg;

    @ApiModelProperty(value = "主要电能表投运时间")
    @TableField("ZYDNTYSJ")
    private String zydntysj;

    @ApiModelProperty(value = "运行状态")
    @TableField("YXZT")
    private String yxzt;

    @ApiModelProperty(value = "所属环境情况")
    @TableField("SSHJQK")
    private String sshjqk;

    @ApiModelProperty(value = "是否属于中心村")
    @TableField("SFSYZXC")
    private String sfsyzxc;

    @ApiModelProperty(value = "是否属于贫困地区")
    @TableField("SFSYPKDQ")
    private String sfsypkdq;

    @ApiModelProperty(value = "是否属于国有林场供电配变")
    @TableField("SFSYGYLCGDPB")
    private String sfsygylcgdpb;

    @ApiModelProperty(value = "是否已开展可研或列入投资计划项目")
    @TableField("SFYKZKYHLRTZJH")
    private String sfykzkyhlrtzjh;

    @ApiModelProperty(value = "拟定本配变存在问题解决方案")
    @TableField("NDBPBCZWTJJFA")
    private String ndbpbczwtjjfa;

    @ApiModelProperty(value = "备注")
    @TableField("BZ")
    private String bz;

    @ApiModelProperty(value = "系统ID主键")
    @TableField("STIDZJ")
    private String stidzj;

    @ApiModelProperty(value = "系统机构ID")
    @TableField("XTJGID")
    private String xtjgid;

    @ApiModelProperty(value = "台区现状")
    @TableField("TQXZ")
    private String tqxz;


}
