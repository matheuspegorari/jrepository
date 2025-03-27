package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EFDFiscal extends AbstractSankhyaEntity<EFDFiscal> {
   public String getArqConfirmado() {
        return this.getVo().asString("ARQCONFIRMADO");
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getVersaoLayout() {
        return this.getVo().asBigDecimal("VERSAOLAYOUT");
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
   }

   public BigDecimal getCodFinCsll() {
        return this.getVo().asBigDecimal("COD_FIN_CSLL");
   }

   public void setCodFinCsll(BigDecimal codFinCsll) {
        markAsChanged("COD_FIN_CSLL", codFinCsll);
   }

   @Override
   public String getTableName() {
        return "TGFEFDF";
   }

   @Override
   public String getEntityName() {
        return "EFDFiscal";
   }

   @Override
   public EFDFiscal fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
