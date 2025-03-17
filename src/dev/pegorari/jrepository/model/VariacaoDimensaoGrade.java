package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VariacaoDimensaoGrade extends AbstractSankhyaEntity<VariacaoDimensaoGrade> {
   private String abvVar;
   private BigDecimal idAtb;
   private BigDecimal idGrade;
   private BigDecimal idVcl;
   private String nomVar;
   private BigDecimal ordCamp;
   private String prmCpr;
   private String prmVnd;
   private String tipo;
   private String atuniversao;
   private BigDecimal nuVersao;

   public String getAbvVar() {
        return abvVar;
   }

   public void setAbvVar(String abvVar) {
        this.abvVar = abvVar;
   }

   public BigDecimal getIdAtb() {
        return idAtb;
   }

   public void setIdAtb(BigDecimal idAtb) {
        this.idAtb = idAtb;
   }

   public BigDecimal getIdGrade() {
        return idGrade;
   }

   public void setIdGrade(BigDecimal idGrade) {
        this.idGrade = idGrade;
   }

   public BigDecimal getIdVcl() {
        return idVcl;
   }

   public void setIdVcl(BigDecimal idVcl) {
        this.idVcl = idVcl;
   }

   public String getNomVar() {
        return nomVar;
   }

   public void setNomVar(String nomVar) {
        this.nomVar = nomVar;
   }

   public BigDecimal getOrdCamp() {
        return ordCamp;
   }

   public void setOrdCamp(BigDecimal ordCamp) {
        this.ordCamp = ordCamp;
   }

   public String getPrmCpr() {
        return prmCpr;
   }

   public void setPrmCpr(String prmCpr) {
        this.prmCpr = prmCpr;
   }

   public String getPrmVnd() {
        return prmVnd;
   }

   public void setPrmVnd(String prmVnd) {
        this.prmVnd = prmVnd;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public String getAtuniversao() {
        return atuniversao;
   }

   public void setAtuniversao(String atuniversao) {
        this.atuniversao = atuniversao;
   }

   public BigDecimal getNuVersao() {
        return nuVersao;
   }

   public void setNuVersao(BigDecimal nuVersao) {
        this.nuVersao = nuVersao;
   }

   @Override
   public String getTableName() {
        return "TGFGCL";
   }

   @Override
   public String getEntityName() {
        return "VariacaoDimensaoGrade";
   }

   @Override
   public VariacaoDimensaoGrade fromVO(DynamicVO vo) {
        this.abvVar = vo.asString("ABVVAR");
        this.idAtb = vo.asBigDecimal("IDATB");
        this.idGrade = vo.asBigDecimal("IDGRADE");
        this.idVcl = vo.asBigDecimal("IDVCL");
        this.nomVar = vo.asString("NOMVAR");
        this.ordCamp = vo.asBigDecimal("ORDCAMP");
        this.prmCpr = vo.asString("PRMCPR");
        this.prmVnd = vo.asString("PRMVND");
        this.tipo = vo.asString("TIPO");
        this.atuniversao = vo.asString("ATUNUVERSAO");
        this.nuVersao = vo.asBigDecimal("NUVERSAO");
        return this;
   }
}
