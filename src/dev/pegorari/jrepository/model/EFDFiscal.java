package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EFDFiscal extends AbstractSankhyaEntity<EFDFiscal> {
   private String arqConfirmado;
   private BigDecimal codEmp;
   private Timestamp dtRef;
   private BigDecimal versaoLayout;
   private BigDecimal codFinCsll;

   public String getArqConfirmado() {
        return arqConfirmado;
   }

   public void setArqConfirmado(String arqConfirmado) {
        this.arqConfirmado = arqConfirmado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        this.versaoLayout = versaoLayout;
   }

   public BigDecimal getCodFinCsll() {
        return codFinCsll;
   }

   public void setCodFinCsll(BigDecimal codFinCsll) {
        this.codFinCsll = codFinCsll;
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
        this.arqConfirmado = vo.asString("ARQCONFIRMADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtRef = vo.asTimestamp("DTREF");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        this.codFinCsll = vo.asBigDecimal("COD_FIN_CSLL");
        return this;
   }
}
