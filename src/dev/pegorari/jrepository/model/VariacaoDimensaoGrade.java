package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class VariacaoDimensaoGrade extends AbstractSankhyaEntity<VariacaoDimensaoGrade> {
   public String getAbvVar() {
        return this.getVo().asString("ABVVAR");
   }

   public void setAbvVar(String abvVar) {
        markAsChanged("ABVVAR", abvVar);
   }

   public BigDecimal getIdAtb() {
        return this.getVo().asBigDecimal("IDATB");
   }

   public void setIdAtb(BigDecimal idAtb) {
        markAsChanged("IDATB", idAtb);
   }

   public BigDecimal getIdGrade() {
        return this.getVo().asBigDecimal("IDGRADE");
   }

   public void setIdGrade(BigDecimal idGrade) {
        markAsChanged("IDGRADE", idGrade);
   }

   public BigDecimal getIdVcl() {
        return this.getVo().asBigDecimal("IDVCL");
   }

   public void setIdVcl(BigDecimal idVcl) {
        markAsChanged("IDVCL", idVcl);
   }

   public String getNomVar() {
        return this.getVo().asString("NOMVAR");
   }

   public void setNomVar(String nomVar) {
        markAsChanged("NOMVAR", nomVar);
   }

   public BigDecimal getOrdCamp() {
        return this.getVo().asBigDecimal("ORDCAMP");
   }

   public void setOrdCamp(BigDecimal ordCamp) {
        markAsChanged("ORDCAMP", ordCamp);
   }

   public String getPrmCpr() {
        return this.getVo().asString("PRMCPR");
   }

   public void setPrmCpr(String prmCpr) {
        markAsChanged("PRMCPR", prmCpr);
   }

   public String getPrmVnd() {
        return this.getVo().asString("PRMVND");
   }

   public void setPrmVnd(String prmVnd) {
        markAsChanged("PRMVND", prmVnd);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getAtuniversao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtuniversao(String atuniversao) {
        markAsChanged("ATUNUVERSAO", atuniversao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
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
        this.setVo(vo);
        return this;
   }
}
