package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasAjustesCPRB extends AbstractSankhyaEntity<NotasAjustesCPRB> {
   public BigDecimal getCodAjuste() {
        return this.getVo().asBigDecimal("CODAJUSTE");
   }

   public void setCodAjuste(BigDecimal codAjuste) {
        markAsChanged("CODAJUSTE", codAjuste);
   }

   public String getCodCprb() {
        return this.getVo().asString("CODCPRB");
   }

   public void setCodCprb(String codCprb) {
        markAsChanged("CODCPRB", codCprb);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodObra() {
        return this.getVo().asString("CODOBRA");
   }

   public void setCodObra(String codObra) {
        markAsChanged("CODOBRA", codObra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDhMov() {
        return this.getVo().asTimestamp("DHMOV");
   }

   public void setDhMov(Timestamp dhMov) {
        markAsChanged("DHMOV", dhMov);
   }

   public Timestamp getDtDoc() {
        return this.getVo().asTimestamp("DTDOC");
   }

   public void setDtDoc(Timestamp dtDoc) {
        markAsChanged("DTDOC", dtDoc);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipoAjuste() {
        return this.getVo().asBigDecimal("TIPOAJUSTE");
   }

   public void setTipoAjuste(BigDecimal tipoAjuste) {
        markAsChanged("TIPOAJUSTE", tipoAjuste);
   }

   public BigDecimal getVlrAjuste() {
        return this.getVo().asBigDecimal("VLRAJUSTE");
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        markAsChanged("VLRAJUSTE", vlrAjuste);
   }

   @Override
   public String getTableName() {
        return "TGFNCPRB";
   }

   @Override
   public String getEntityName() {
        return "NotasAjustesCPRB";
   }

   @Override
   public NotasAjustesCPRB fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
