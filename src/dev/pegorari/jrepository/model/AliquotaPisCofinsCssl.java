package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AliquotaPisCofinsCssl extends AbstractSankhyaEntity<AliquotaPisCofinsCssl> {
   public BigDecimal getAliq() {
        return this.getVo().asBigDecimal("ALIQ");
   }

   public void setAliq(BigDecimal aliq) {
        markAsChanged("ALIQ", aliq);
   }

   public BigDecimal getAliqCred() {
        return this.getVo().asBigDecimal("ALIQCRED");
   }

   public void setAliqCred(BigDecimal aliqCred) {
        markAsChanged("ALIQCRED", aliqCred);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCst() {
        return this.getVo().asBigDecimal("CST");
   }

   public void setCst(BigDecimal cst) {
        markAsChanged("CST", cst);
   }

   public String getEntSai() {
        return this.getVo().asString("ENTSAI");
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
   }

   public String getGrupoImp() {
        return this.getVo().asString("GRUPOIMP");
   }

   public void setGrupoImp(String grupoImp) {
        markAsChanged("GRUPOIMP", grupoImp);
   }

   public String getIpiIncBase() {
        return this.getVo().asString("IPIINCBASE");
   }

   public void setIpiIncBase(String ipiIncBase) {
        markAsChanged("IPIINCBASE", ipiIncBase);
   }

   public BigDecimal getIva() {
        return this.getVo().asBigDecimal("IVA");
   }

   public void setIva(BigDecimal iva) {
        markAsChanged("IVA", iva);
   }

   public String getNomeImp() {
        return this.getVo().asString("NOMEIMP");
   }

   public void setNomeImp(String nomeImp) {
        markAsChanged("NOMEIMP", nomeImp);
   }

   public String getPercVlr() {
        return this.getVo().asString("PERCVLR");
   }

   public void setPercVlr(String percVlr) {
        markAsChanged("PERCVLR", percVlr);
   }

   public BigDecimal getRedBase() {
        return this.getVo().asBigDecimal("REDBASE");
   }

   public void setRedBase(BigDecimal redBase) {
        markAsChanged("REDBASE", redBase);
   }

   public String getRetemFin() {
        return this.getVo().asString("RETEMFIN");
   }

   public void setRetemFin(String retemFin) {
        markAsChanged("RETEMFIN", retemFin);
   }

   public BigDecimal getVlrPauta() {
        return this.getVo().asBigDecimal("VLRPAUTA");
   }

   public void setVlrPauta(BigDecimal vlrPauta) {
        markAsChanged("VLRPAUTA", vlrPauta);
   }

   public BigDecimal getVlrPautaCred() {
        return this.getVo().asBigDecimal("VLRPAUTACRED");
   }

   public void setVlrPautaCred(BigDecimal vlrPautaCred) {
        markAsChanged("VLRPAUTACRED", vlrPautaCred);
   }

   public BigDecimal getAliqSuframa() {
        return this.getVo().asBigDecimal("ALIQSUFRAMA");
   }

   public void setAliqSuframa(BigDecimal aliqSuframa) {
        markAsChanged("ALIQSUFRAMA", aliqSuframa);
   }

   public String getProdSemTrib() {
        return this.getVo().asString("PRODSEMTRIB");
   }

   public void setProdSemTrib(String prodSemTrib) {
        markAsChanged("PRODSEMTRIB", prodSemTrib);
   }

   public BigDecimal getIdAliq() {
        return this.getVo().asBigDecimal("IDALIQ");
   }

   public void setIdAliq(BigDecimal idAliq) {
        markAsChanged("IDALIQ", idAliq);
   }

   @Override
   public String getTableName() {
        return "TGFIFE";
   }

   @Override
   public String getEntityName() {
        return "AliquotaPisCofinsCssl";
   }

   @Override
   public AliquotaPisCofinsCssl fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
